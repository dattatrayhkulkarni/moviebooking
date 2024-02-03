package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.*;


@Entity
@Table(name = "booking")
public class Booking {

    @Id
    @Column(name="booking_id", nullable = false)
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



    public Booking(Long bookingId, int userId, int currentMovieId, int totalSeats, String totalAmount) {
        this.bookingId = bookingId;
        this.userId = userId;
        this.currentMovieId = currentMovieId;
        this.totalSeats = totalSeats;
        this.totalAmount = totalAmount;
    }

    public Booking() {
    }

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
}

