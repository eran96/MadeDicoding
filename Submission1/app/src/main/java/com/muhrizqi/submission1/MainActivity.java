package com.muhrizqi.submission1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> titles;
    private ArrayList<String> overviews;
    private ArrayList<String> dates;
    private ArrayList<Double> voteAverages;
    private ArrayList<Integer> images;
    private ArrayList<Movie> movies;
    private MovieAdapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titles = MovieData.getTitles();
        overviews = MovieData.getOverview();
        dates = MovieData.getDates();
        voteAverages = MovieData.getVoteAvarages();
        images = MovieData.getImages();
        movies = new ArrayList<>();

        adapter = new MovieAdapter(this);
        ListView listView = findViewById(R.id.lv_list);
        listView.setAdapter(adapter);

        addMoviesItem();
        adapter.setMovies(movies);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent moveWithObjectIntent = new Intent(MainActivity.this, DetailActivity.class);
                moveWithObjectIntent.putExtra(DetailActivity.EXTRA_MOVIE, movies.get(i));
                startActivity(moveWithObjectIntent);
            }
        });
    }

    private void addMoviesItem() {
        for (int i = 0; i< titles.size(); i++){
            Movie movie = new Movie();
            movie.setId(i);
            movie.setImage(images.get(i));
            movie.setTitle(titles.get(i));
            movie.setDate(dates.get(i));
            movie.setVote_avarage(voteAverages.get(i));
            movie.setOverview(overviews.get(i));
            movies.add(movie);
        }
    }
}
