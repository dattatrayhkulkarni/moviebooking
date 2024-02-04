package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

public class CurrentMovies {


    @Id
    @Column(name="current_movie_id", nullable = false)
    @JsonProperty("current_movie_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int currentMovieId;


    @Column(name="theatre_id", nullable = false)
    @JsonProperty("theatre_id")
    private int theatreId;

    @Column(name="start_date", nullable = false)
    @JsonProperty("start_date")
    private LocalDate startDate;


    @Column(name="end_date", nullable = false)
    @JsonProperty("end_date")
    private LocalDate endDate;


    @Column(name="show_timing", nullable = false)
    @JsonProperty("show_timing")
    private String showTiming;

    @Column(name="current_movie_name", nullable = false)
    @JsonProperty("current_movie_name")
    private String currentMovieName;


    public CurrentMovies(int currentMovieId, int theatreId, LocalDate startDate, LocalDate endDate, String showTiming, String currentMovieName) {
        this.currentMovieId = currentMovieId;
        this.theatreId = theatreId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.showTiming = showTiming;
        this.currentMovieName = currentMovieName;
    }

    public CurrentMovies() {
    }


    public int getCurrentMovieId() {
        return currentMovieId;
    }

    public int getTheatreId() {
        return theatreId;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public String getShowTiming() {
        return showTiming;
    }

    public String getCurrentMovieName() {
        return currentMovieName;
    }


    public void setCurrentMovieId(int currentMovieId) {
        this.currentMovieId = currentMovieId;
    }

    public void setTheatreId(int theatreId) {
        this.theatreId = theatreId;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public void setShowTiming(String showTiming) {
        this.showTiming = showTiming;
    }

    public void setCurrentMovieName(String currentMovieName) {
        this.currentMovieName = currentMovieName;
    }
}
