package com.delta.dalalstreetdev;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Transactions extends Fragment {

    RecyclerView transactionView;
    TransactionAdapter adapter;
    List<TransactionDetails> transactionList;


    public Transactions() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView=inflater.inflate(R.layout.fragment_transactions, container, false);

        getActivity().setTitle("Transactions");

        transactionView=(RecyclerView)rootView.findViewById(R.id.transactions_view);

        publish();

        return rootView;
    }



    public void setValues(){


        transactionList=new ArrayList<TransactionDetails>(); //todo : get from service
        transactionList.clear();                   //type,company,number of stocks,stock price,timestamp,total amount

        transactionList.add(new TransactionDetails("Mortgage","Github",50,43,"10:00",-100));
        transactionList.add(new TransactionDetails("Exchange","Github",50,43,"11:00",+50));
        transactionList.add(new TransactionDetails("Mortgage","Github",50,43,"12:00",-25));
        transactionList.add(new TransactionDetails("Market","Github",50,43,"12:01",+58));
        transactionList.add(new TransactionDetails("Exchange","Github",50,43,"12:02",+75));
    }

    public void publish(){
        setValues();
        adapter=new TransactionAdapter(getActivity(),transactionList);
        transactionView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL,false));
        transactionView.setItemAnimator(new DefaultItemAnimator());
        transactionView.setAdapter(adapter);


    }

}
