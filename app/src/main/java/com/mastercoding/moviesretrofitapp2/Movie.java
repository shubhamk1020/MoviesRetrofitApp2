package com.mastercoding.moviesretrofitapp2;

import com.google.gson.annotations.SerializedName;

public class Movie {


    private String name;
    private double rating;
    private String poster;

    @SerializedName("Details")
    private MoreDetails moreDetails;


    // Constructor

    public Movie(String name, double rating, String poster, MoreDetails moreDetails) {
        this.name = name;
        this.rating = rating;
        this.poster = poster;
        this.moreDetails = moreDetails;
    }

    // Getters


    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public String getPoster() {
        return poster;
    }

    public MoreDetails getMoreDetails() {
        return moreDetails;
    }
}