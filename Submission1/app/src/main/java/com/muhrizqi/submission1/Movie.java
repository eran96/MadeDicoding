package com.muhrizqi.submission1;

import android.os.Parcel;
import android.os.Parcelable;

public class Movie implements Parcelable {

    private int id;
    private String title;
    private String overview;
    private String date;
    private double vote_avarage;
    private int image;

    public Movie() {

    }


    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
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
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getVote_avarage() {
        return vote_avarage;
    }

    public void setVote_avarage(double vote_avarage) {
        this.vote_avarage = vote_avarage;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeString(this.title);
        dest.writeString(this.overview);
        dest.writeString(this.date);
        dest.writeDouble(this.vote_avarage);
        dest.writeInt(this.image);
    }

    protected Movie(Parcel in) {
        this.id=in.readInt();
        this.title=in.readString();
        this.overview=in.readString();
        this.date=in.readString();
        this.vote_avarage=in.readDouble();
        this.image=in.readInt();
    }

    public static final Parcelable.Creator<Movie> CREATOR = new Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel in) {
            return new Movie(in);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };
}
