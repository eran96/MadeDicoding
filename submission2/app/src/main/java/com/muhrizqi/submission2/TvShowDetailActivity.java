package com.muhrizqi.submission2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class TvShowDetailActivity extends AppCompatActivity {

    public static String DETAIL_TV_SHOW_EXTRA = " detail tv show extra";

    private TvShow tvShow;
    private TextView txtTitle;
    private TextView txtOverview;
    private TextView txtVoteAverages;
    private TextView txtDate;
    private ImageView imgPoster;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tv_show_detail);

        txtTitle = findViewById(R.id.text_detail_titile_tv_show);
        txtOverview = findViewById(R.id.text_detail_description_tv_show);
        txtVoteAverages = findViewById(R.id.text_detail_rating_tv_show);
        txtDate = findViewById(R.id.text_detail_calendar_tv_show);
        imgPoster = findViewById(R.id.image_detail_tv_show);

        tvShow = getIntent().getParcelableExtra(DETAIL_TV_SHOW_EXTRA);
        setDetailTvShowView();
    }

    private void setDetailTvShowView() {
        setTitle(R.string.title_detail_tv_show);
        txtTitle.setText(tvShow.getName());
        txtOverview.setText(tvShow.getOverview());
        txtVoteAverages.setText(String.valueOf(tvShow.getVote_average()));
        txtDate.setText(tvShow.getFirst_air_date());
        Glide.with(getApplicationContext()).load(tvShow.getPoster_path()).into(imgPoster);
    }
}
