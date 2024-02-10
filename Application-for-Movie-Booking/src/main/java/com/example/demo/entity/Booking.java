package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;


@Entity
@Table(name = "booking")
public class Booking {

    @Id
    @Column(name="booking_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("booking_id")
    private long bookingId;

    @Column(name="user_id", nullable = false)
    @JsonProperty("user_id")
    private int userId;

    @Column(name="current_movie_id", nullable = false)
    @JsonProperty("current_movie_id")
    private int currentMovieId;

    @Column(name="total_seats", nullable = false)
    @JsonProperty("total_seats")
    private int totalSeats;

    @Column(name="total_amount", nullable = false)
    @JsonProperty("total_amount")
    private String totalAmount;

    @Column(name="screen_name", nullable = false)
    @JsonProperty("screen_name")
    private String screenName;

    @Column(name="movie_date", nullable = false)
    @JsonProperty("movie_date")
    private LocalDate movieDate;

    @Column(name="movie_name", nullable = false)
    @JsonProperty("movie_name")
    private String movieName;


    @Column(name="movie_timing", nullable = false)
    @JsonProperty("movie_timing")
    private String movieTiming;



    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonProperty("seats")
    @JoinColumn(name = "booking_id")
    private List<BookingSeats> bookingSeatsList;


    public Booking() {
    }

    public Booking(long bookingId, int userId, int currentMovieId, int totalSeats, String totalAmount, String screenName,
                   LocalDate movieDate, String movieName, String movieTiming, List<BookingSeats> bookingSeatsList) {
        this.bookingId = bookingId;
        this.userId = userId;
        this.currentMovieId = currentMovieId;
        this.totalSeats = totalSeats;
        this.totalAmount = totalAmount;
        this.screenName = screenName;
        this.movieDate = movieDate;
        this.movieName = movieName;
        this.movieTiming = movieTiming;
        this.bookingSeatsList = bookingSeatsList;
    }

    /*
    public Booking(long bookingId, int userId, int currentMovieId, int totalSeats, String totalAmount,
                   List<BookingSeats> bookingSeatsList) {
        this.bookingId = bookingId;
        this.userId = userId;
        this.currentMovieId = currentMovieId;
        this.totalSeats = totalSeats;
        this.totalAmount = totalAmount;
        this.bookingSeatsList = bookingSeatsList;
    }

     */




    public Long getBookingId() {
        return bookingId;
    }

    public int getUserId() {
        return userId;
    }

    public int getCurrentMovieId() {
        return currentMovieId;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }

    public LocalDate getMovieDate() {
        return movieDate;
    }

    /*
    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", userId=" + userId +
                ", currentMovieId=" + currentMovieId +
                ", totalSeats=" + totalSeats +
                ", totalAmount='" + totalAmount + '\'' +
               // ", bookingSeatsList=" + bookingSeatsList +
                '}';
    }


    public List<BookingSeats> getBookingSeatsList() {
        return bookingSeatsList;
    }

    public void setBookingSeatsList(List<BookingSeats> bookingSeatsList) {
        this.bookingSeatsList = bookingSeatsList;
    }
    */
}



