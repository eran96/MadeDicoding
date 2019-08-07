package com.muhrizqi.submission1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_MOVIE = "extra_movie";

    private Movie movie;
    private TextView tvTitle;
    private TextView tvOverview;
    private TextView tvDate;
    private TextView tvVote;
    private ImageView ivImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ivImage = findViewById(R.id.poster_image);
        tvTitle = findViewById(R.id.tv_title);
        tvOverview = findViewById(R.id.tv_desc);
        tvDate = findViewById(R.id.tv_date);
        tvVote = findViewById(R.id.rating);

        movie =getIntent().getParcelableExtra(EXTRA_MOVIE);
        setUserInterfaces();
    }

    private void setUserInterfaces() {
        Glide.with(this).load(movie.getImage()).into(ivImage);
        tvTitle.setText(movie.getTitle());
        tvDate.setText(movie.getDate());
        tvOverview.setText(movie.getOverview());
        tvVote.setText(String.valueOf(movie.getVote_avarage()));

        setTitle(movie.getTitle());
    }
}
