package com.delta.dalalstreetdev;


import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import dalalstreet.socketapi.models.StockOuterClass;


/**
 * A simple {@link Fragment} subclass.
 */
public class Companies extends Fragment {


    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    ListView homeNews;
    CompanyAdapter adapter;


    List<Company> companyList;
    ArrayList<String> news;

    Handler handler;



    public Companies() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView=inflater.inflate(R.layout.fragment_companies, container, false);

        getActivity().setTitle("Home");



        recyclerView=(RecyclerView)rootView.findViewById(R.id.recycler_view);
        linearLayoutManager=new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        homeNews=(ListView)rootView.findViewById(R.id.home_news);

        publish();


       handler=new Handler();
        Runnable runnable=new Runnable() {
            int position =0;

            @Override
            public void run() {
                if(position < companyList.size()){
                    position=linearLayoutManager.findFirstVisibleItemPosition();
                    recyclerView.smoothScrollToPosition(++position);
                }
                else {
                    recyclerView.smoothScrollToPosition(0);
                    position=0;
                }
                handler.postDelayed(this,3000);
            }
        };
        handler.postDelayed(runnable,3000);



        return rootView;
    }
    private int returnUporDownImg(StockOuterClass.Stock stock){
        if(stock.getCurrentPrice() >= stock.getPreviousDayClose())
            return R.drawable.up_arrow;
        else
            return R.drawable.down_arrow;
    }
    public void setValues(){ //todo : get from service,checkout companyAdapter
        companyList=new ArrayList<>();
        companyList.clear();
        Map<Integer, StockOuterClass.Stock> stockMap = WebSocketsService.stock_list;
        Set<Integer> keyset = stockMap.keySet();
        Collection<StockOuterClass.Stock> stockList = stockMap.values();
        for (StockOuterClass.Stock i : stockList){
            companyList.add(new Company(i.getShortName(),Integer.toString(i.getCurrentPrice()),R.drawable.github2,returnUporDownImg(i)));
        }

        news=new ArrayList<>();
        news.clear();
        news.add("Github makes private repos free!");
        news.add("Apple revokes iphone 7 plus due to faulty cameras");
        news.add("Yahoo employees announce strike due to non payment of salary");
        news.add("Sony launches Xperia X conpact priced at 45,000");
        news.add("LG patents new refrigerant for its refrigerator products");

    }

    public void publish(){

     setValues();
        adapter= new CompanyAdapter(getActivity(),companyList);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,news);
        homeNews.setAdapter(arrayAdapter);

    }



}
