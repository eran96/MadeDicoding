package com.muhrizqi.submission2;

import android.os.Parcel;
import android.os.Parcelable;

public class Movie implements Parcelable {
    private int id;
    private String title;
    private String Overview;
    private String realease_date;
    private double vote_avarage;
    private int poster_path;
    private int backdrop_path;

    public Movie() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOverview() {
        return Overview;
    }

    public void setOverview(String overview) {
        Overview = overview;
    }

    public String getRealease_date() {
        return realease_date;
    }

    public void setRealease_date(String realease_date) {
        this.realease_date = realease_date;
    }

    public double getVote_avarage() {
        return vote_avarage;
    }

    public void setVote_avarage(double vote_avarage) {
        this.vote_avarage = vote_avarage;
    }

    public int getPoster_path() {
        return poster_path;
    }

    public void setPoster_path(int poster_path) {
        this.poster_path = poster_path;
    }

    public int getBackdrop_path() {
        return backdrop_path;
    }

    public void setBackdrop_path(int backdrop_path) {
        this.backdrop_path = backdrop_path;
    }

    @Override
    public  int describeContents(){
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flag) {
        dest.writeInt(this.id);
        dest.writeString(this.title);
        dest.writeString(this.Overview);
        dest.writeString(this.realease_date);
        dest.writeDouble(this.vote_avarage);
        dest.writeInt(this.poster_path);
    }

    public Movie(Parcel in){
        this.id = in.readInt();
        this.title = in.readString();
        this.realease_date = in.readString();
        this.vote_avarage = in.readDouble();
        this.poster_path = in.readInt();
    }

    public static final Creator<Movie> CREATOR = new Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel source) {
            return new Movie(source);
        }


        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };

}
