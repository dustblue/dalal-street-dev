package com.delta.dalalstreetdev;

import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;

import java.util.Map;

import dalalstreet.socketapi.models.StockOuterClass;

public class Mortgage extends Fragment implements Listener{

    MaterialBetterSpinner materialBetterSpinner;
    RadioButton defaultButton;
    Button mortgageButton;
    EditText stocks;
    TextInputLayout stock_input;
    TextView owned, mortgaged;

    int stocks_owned, stocks_mortgaged, stock_transaction, stock_id;

    public Mortgage() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View rootView = inflater.inflate(R.layout.fragment_mortgage, container, false);
        getActivity().setTitle("Mortgage");

        materialBetterSpinner = (MaterialBetterSpinner) rootView.findViewById(R.id.mortgage_companies_spinner);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_dropdown_item_1line,
                getResources().getStringArray(R.array.companies));
        materialBetterSpinner.setAdapter(arrayAdapter);

        stocks = (EditText) rootView.findViewById(R.id.mortgage_stock);
        stock_input = (TextInputLayout) rootView.findViewById(R.id.mortgage_stock_input);

        owned = (TextView) rootView.findViewById(R.id.stocks_owned);
        mortgaged = (TextView) rootView.findViewById(R.id.stocks_mortgaged);

        defaultButton = (RadioButton) rootView.findViewById(R.id.radioButton_sell);
        defaultButton.setChecked(true);

        mortgageButton = (Button) rootView.findViewById(R.id.mortgage);
        mortgageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (stocks.getText().toString().trim().isEmpty()) {
                    stock_input.setError("Enter the number of stocks");
                    stocks.requestFocus();
                } else {
                    stock_input.setErrorEnabled(false);
                    if (materialBetterSpinner.getText().toString().trim().isEmpty()) {
                        Toast.makeText(getActivity(), "Select a company", Toast.LENGTH_SHORT).show();
                    } else {
                        stock_transaction = Integer.parseInt(stocks.getText().toString());
                        Map<Integer, StockOuterClass.Stock> stocks_list = WebSocketsService.stocks_list;
                        for (Integer i : stocks_list.keySet()) {
                            if (materialBetterSpinner.getText().toString().equals(stocks_list.get(i).getFullName())) {
                                stock_id = WebSocketsService.stocks_list.get(0).getId();
                            }
                        }
                        stocks_owned = WebSocketsService.stocks_owned.get(stock_id);
                        stocks_mortgaged = WebSocketsService.mortgaged_stocks.get(stock_id).getStocksInBank();
                        if (defaultButton.isChecked()) {

                            if (stock_transaction <= stocks_owned) {
                                stocks_owned -= stock_transaction;
                                stocks_mortgaged += stock_transaction;

                                owned.setText("Number of stocks you own : " + String.valueOf(stocks_owned));
                                mortgaged.setText("Number of stocks in mortgage : " + String.valueOf(stocks_mortgaged));
                                stocks.setText("");
                            } else {
                                Toast.makeText(getActivity(), "You don't have sufficient stocks", Toast.LENGTH_SHORT).show();
                            }

                        } else {

                            if (stock_transaction <= stocks_mortgaged && stocks_mortgaged >= 0) {
                                stocks_owned += stock_transaction;
                                stocks_mortgaged -= stock_transaction;

                                stocks.setText("");
                                owned.setText("Number of stocks you own : " + String.valueOf(stocks_owned));
                                mortgaged.setText("Number of stocks in mortgage : " + String.valueOf(stocks_mortgaged));
                            } else {
                                Toast.makeText(getActivity(), "You dont have sufficient stocks", Toast.LENGTH_SHORT).show();
                            }
                        }

                    }
                }

            }
        });

        publish();
        //TODO Call mortgage_stocks_request

        return rootView;
    }

    public void setValues() {
        stocks_owned = WebSocketsService.stocks_owned.get(stock_id);
        stocks_mortgaged = WebSocketsService.mortgaged_stocks.get(stock_id).getStocksInBank();
    }

    public void publish() {
        setValues();

        owned.setText("Number of stocks you own : " + String.valueOf(stocks_owned));
        mortgaged.setText("Number of stocks in mortgage : " + String.valueOf(stocks_mortgaged));
    }

    @Override
    public void onCallback() {

    }

    @Override
    public void connectionEstablished() {

    }
}
