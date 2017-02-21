package com.delta.dalalstreetdev;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.Map;
import java.util.Set;

import dalalstreet.socketapi.models.StockOuterClass;
import dalalstreet.socketapi.models.UserOuterClass;

public class Home extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, Listener {

    WebSocketsService websocket;
    String name;
    TextView username, stock, cash, total;
    int stockWorth, cashWorth, totalWorth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        websocket = new WebSocketsService(this,this);
        websocket.openWebSocket();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        View headView = navigationView.inflateHeaderView(R.layout.nav_header_home);

        displaySelectedScreen(R.id.nav_home);

        username = (TextView) headView.findViewById(R.id.username);
        stock = (TextView) findViewById(R.id.user_stock_worth);
        cash = (TextView) findViewById(R.id.user_cash_worth);
        total = (TextView) findViewById(R.id.user_total_worth);


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        WebSocketsService.ws.close();
    }

    @Override
    protected void onPause() {
        super.onPause();
        WebSocketsService.ws.close();
    }

    @Override
    protected void onResume() {
        super.onResume();
        websocket.openWebSocket();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch (id) {
            case R.id.action_help:
                help();
                return true;
            case R.id.action_logout:
                logout();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void displaySelectedScreen(int id) {
        Fragment fragment = null;

        switch (id) {
            case R.id.nav_home:
                fragment = new Companies();
                break;
            case R.id.nav_exchange:
                fragment = new StockExchange();
                break;
            case R.id.nav_company_profile:
                fragment = new CompanyProfile();
                break;
            case R.id.nav_news:
                fragment = new News();
                break;
            case R.id.nav_buy_sell:
                fragment = new BuySell();
                break;
            case R.id.nav_mortgage:
                fragment = new Mortgage();
                break;
            case R.id.nav_my_orders:
                fragment = new MyOrders();
                break;
            case R.id.nav_transactions:
                fragment = new Transactions();
                break;
            case R.id.nav_portfolio:
                fragment = new Portfolio();
                break;
            case R.id.nav_leaderboard:
                fragment = new Leaderboard();
                break;
        }

        if (fragment != null) {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.content_home, fragment);
            ft.commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        displaySelectedScreen(item.getItemId());
        return true;
    }

    public void help() {
        LayoutInflater inflater = LayoutInflater.from(this);
        View view = inflater.inflate(R.layout.help_box, null);
        View view2 = inflater.inflate(R.layout.help_title, null);

        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        alertDialog.setCustomTitle(view2);
        alertDialog.setView(view);
        alertDialog.setCancelable(true);
        AlertDialog alert = alertDialog.create();
        alert.show();
    }

    public void logout() {
        //Toast.makeText(this, "logged out", Toast.LENGTH_SHORT).show();
        websocket.logout_request();
    }

    public void publish() {

        setValues();
        UserOuterClass.User user = WebSocketsService.user;
        name = user.getName(); //todo : get from service

        cashWorth = user.getCash();
        String cashText = "Cash worth\n" + String.valueOf(cashWorth);
        SpannableString spannable2 = new SpannableString(cashText);
        spannable2.setSpan(new StyleSpan(Typeface.BOLD), 11, cashText.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannable2.setSpan(new RelativeSizeSpan(0.8f), 0, 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannable2.setSpan(new RelativeSizeSpan(2.0f), 11, cashText.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        cash.setText(spannable2);
        stockWorth = getStockWorth();
        totalWorth = cashWorth + stockWorth;
        username.setText(name);
        String stockText = "Stock worth\n" + String.valueOf(stockWorth);

        String totalText = "Total worth\n" + String.valueOf(totalWorth);
        Log.e(WebSocketsService.TAG,"  "+stockText+ " "+cashText);


        SpannableString spannable1 = new SpannableString(stockText);
        spannable1.setSpan(new StyleSpan(Typeface.BOLD), 12, stockText.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannable1.setSpan(new RelativeSizeSpan(0.8f), 0, 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannable1.setSpan(new RelativeSizeSpan(2.0f), 12, stockText.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        stock.setText(spannable1);



        SpannableString spannable3 = new SpannableString(totalText);
        spannable3.setSpan(new StyleSpan(Typeface.BOLD), 12, totalText.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannable3.setSpan(new RelativeSizeSpan(0.8f), 0, 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannable3.setSpan(new RelativeSizeSpan(2.0f), 12, totalText.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        total.setText(spannable3);

    }

    public void setValues() {
//        UserOuterClass.User user = WebSocketsService.user;
//        name = user.getName(); //todo : get from service
//
//        cashWorth = user.getCash();
//        stockWorth = getStockWorth();
//        totalWorth = cashWorth + stockWorth;
    }

    private int getStockWorth() {
        Map<Integer, Integer> stocks_owned = WebSocketsService.stocks_owned;
        Map<Integer, StockOuterClass.Stock> stock_list = WebSocketsService.stock_list;
        Integer sum = 0;
        for(Integer i : stock_list.keySet()){
            sum += stock_list.get(i).getCurrentPrice() * stocks_owned.get(i);
        }
        return sum;
    }

    @Override
    public void onCallback() {
        //Logout callback
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void connectionEstablished() {
        publish();
    }

}