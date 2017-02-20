package com.delta.dalalstreetdev;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Leaderboard extends Fragment {

    RecyclerView recyclerView;
    ArrayList<LeaderboardDetails> details;
    LeaderboardAdapter leaderboardAdapter;


    TextView name,rank,wealth;


    public Leaderboard() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView=inflater.inflate(R.layout.fragment_leaderboard, container, false);
        getActivity().setTitle("Leaderboard");

        recyclerView=(RecyclerView) rootView.findViewById(R.id.leaderboard_display);
        name=(TextView)rootView.findViewById(R.id.name_list);
        rank=(TextView)rootView.findViewById(R.id.rank_list);
        wealth=(TextView)rootView.findViewById(R.id.wealth_list);

        publish();

        return rootView;
    }


    public void setValues(){
        details=new ArrayList<>(); //todo : get from service
                                    //position,name,total wealth
        details.add(new LeaderboardDetails(1,"aaa",5000));
        details.add(new LeaderboardDetails(2,"bbb",4500));
        details.add(new LeaderboardDetails(3,"ccc",4400));
        details.add(new LeaderboardDetails(4,"ddd",4300));
        details.add(new LeaderboardDetails(5,"eee",4200));
        details.add(new LeaderboardDetails(6,"fff",4200));
        details.add(new LeaderboardDetails(7,"ggg",4200));
        details.add(new LeaderboardDetails(8,"hhh",4200));
        details.add(new LeaderboardDetails(9,"iii",4200));
        details.add(new LeaderboardDetails(10,"jjj",4200));




    }

    public void publish(){
        setValues();

        leaderboardAdapter=new LeaderboardAdapter(details,getActivity());

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL,false));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(leaderboardAdapter);


        name.setText("your name");  //todo : add our details
        rank.setText("8");
        wealth.setText("3500");

    }

}
