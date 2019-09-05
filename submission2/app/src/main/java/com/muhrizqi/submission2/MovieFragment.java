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
public class MovieFragment extends Fragment {

    private ArrayList<Movie> movies = new ArrayList<>();

    public MovieFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_movie, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        if (movies.isEmpty()){
            movies.addAll(MovieData.getMovieListData());
        }
        RecyclerView rvFragmentMovies = view.findViewById(R.id.rv_fragment_movie);
        rvFragmentMovies.setHasFixedSize(true);
        rvFragmentMovies.setLayoutManager(new LinearLayoutManager(view.getContext()));

        MovieAdapter adapter = new MovieAdapter(view.getContext());
        adapter.setMovies(movies);
        rvFragmentMovies.setAdapter(adapter);
    }
}
