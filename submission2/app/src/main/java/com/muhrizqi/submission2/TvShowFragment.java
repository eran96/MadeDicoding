package com.muhrizqi.submission2;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class TvShowFragment extends Fragment {

    private ArrayList<TvShow> tvShows = new ArrayList<>();

    public TvShowFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tv_show, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        if (tvShows.isEmpty()){
            tvShows.addAll(TvShowData.getTvShowListData());
        }
        RecyclerView rvFragmentTvshow = view.findViewById(R.id.rv_fragment_tv_show);
        rvFragmentTvshow.setHasFixedSize(true);
        rvFragmentTvshow.setLayoutManager(new LinearLayoutManager(view.getContext()));

        TvShowAdapter adapter = new TvShowAdapter(view.getContext());
        adapter.setTvShows(tvShows);
        rvFragmentTvshow.setAdapter(adapter);

    }
}
