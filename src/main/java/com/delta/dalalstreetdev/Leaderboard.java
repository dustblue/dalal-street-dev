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
import java.util.Map;

import dalalstreet.socketapi.models.LeaderboardRowOuterClass;

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
        View rootView = inflater.inflate(R.layout.fragment_leaderboard, container, false);
        getActivity().setTitle("Leaderboard");

        recyclerView = (RecyclerView) rootView.findViewById(R.id.leaderboard_display);
        name = (TextView)rootView.findViewById(R.id.name_list);
        rank = (TextView)rootView.findViewById(R.id.rank_list);
        wealth = (TextView)rootView.findViewById(R.id.wealth_list);

        publish();

        return rootView;
    }

    public void setValues(){
        details = new ArrayList<>();
        Map<Integer, LeaderboardRowOuterClass.LeaderboardRow> rank_list = WebSocketsService.rank_list;
        for (Integer key : rank_list.keySet()) {
            details.add(new LeaderboardDetails(key, WebSocketsService.rank_list.get(key).getUserName(),
                    WebSocketsService.rank_list.get(key).getTotalWorth()));
        }
    }

    public void publish(){
        setValues();

        leaderboardAdapter = new LeaderboardAdapter(details,getActivity());
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL,false));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(leaderboardAdapter);

        name.setText(WebSocketsService.user.getName());  //TODO : If user has no name?
        rank.setText(WebSocketsService.my_rank);
        wealth.setText(WebSocketsService.user.getTotal());
    }
}
