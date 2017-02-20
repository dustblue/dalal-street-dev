package com.delta.dalalstreetdev;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ravi on 19/2/17.
 */

public class TransactionAdapter  extends RecyclerView.Adapter<TransactionAdapter.MyViewHolder>{


    private Context context;
    private List<TransactionDetails> transactionList;

    public TransactionAdapter(Context context, List<TransactionDetails> transactionList) {
        this.context = context;
        this.transactionList = transactionList;
    }

    public TransactionAdapter() {
    }



    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.transactions, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        int size=transactionList.size();

        TransactionDetails transactionDetails=transactionList.get(size-position-1);

        holder.type.setText("Transaction Type : "+transactionDetails.getType());
        holder.company.setText("Company : "+transactionDetails.getCompany());
        holder.noOfStocks.setText("Numberof stocks : "+String.valueOf(transactionDetails.getNoOfStocks()));
        holder.price.setText("Stock price : "+String.valueOf(transactionDetails.getStockPrice()));
        holder.time.setText("Time : "+transactionDetails.getTime());

        if(transactionDetails.getTotalMoney()>=0){
            holder.relativeLayout.setBackgroundColor(ContextCompat.getColor(context, R.color.greenTint));
        }
        else{
            holder.relativeLayout.setBackgroundColor(ContextCompat.getColor(context, R.color.redTint));

        }

    }

    @Override
    public int getItemCount() {
        return transactionList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView type,company,noOfStocks,price,time;
        RelativeLayout relativeLayout;

        public MyViewHolder(View view) {
            super(view);
            type=(TextView)view.findViewById(R.id.transaction_type);
            company=(TextView)view.findViewById(R.id.transaction_company);
            noOfStocks=(TextView)view.findViewById(R.id.trans_noOfStocks);
            price=(TextView)view.findViewById(R.id.trans_stockPrice);
            time=(TextView)view.findViewById(R.id.trans_time);
            relativeLayout=(RelativeLayout)view.findViewById(R.id.trans);
        }
    }

}
