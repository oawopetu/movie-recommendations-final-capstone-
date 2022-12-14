package com.techelevator.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.beans.factory.annotation.Value;

import javax.validation.Valid;

public class MovieDTO {
    @JsonProperty("id")
    private int movieId;
    private int[] genre;
    @JsonProperty("release_date")
    private String releaseDate;
    //private String director;
    private String title;
    @JsonProperty("overview")
    private String summary;
    @JsonProperty("poster_path")
    private String movieImg;
    @JsonProperty("favorite")
    @Value("false")
    private boolean favorite;
    @JsonProperty("seen")
    private boolean seen;

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public int[] getGenre() {
        return genre;
    }

    public void setGenre(int[] genre) {
        this.genre = genre;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getMovieImg() {
        return movieImg;
    }

    public void setMovieImg(String movieImg) {
        this.movieImg = movieImg;
    }

    public Boolean getFavorite() {
        return favorite;
    }

    public void setFavorite(Boolean favorite) {
        this.favorite = favorite;
    }

    public Boolean getSeen() {
        return seen;
    }

    public void setSeen(Boolean seen) {
        this.seen = seen;
    }
}
