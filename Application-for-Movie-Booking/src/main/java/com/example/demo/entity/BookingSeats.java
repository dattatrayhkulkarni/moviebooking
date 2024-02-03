package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table(name = "booking_seats")
public class BookingSeats {

    @Id
    @Column(name="booking_id", nullable = false)
    @JsonProperty("booking_id")
    private long bookingId;

    @Id
    @Column(name="seat_id", nullable = false)
    @JsonProperty("seat_id")
    private String seatId;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "booking_id")
    private Booking booking;


    public BookingSeats(long bookingId, String seatId) {
        this.bookingId = bookingId;
        this.seatId = seatId;
    }


    public BookingSeats() {
    }


    public long getBookingId() {
        return bookingId;
    }

    public String getSeatId() {
        return seatId;
    }

    public void setBookingId(long bookingId) {
        this.bookingId = bookingId;
    }

    public void setSeatId(String seatId) {
        this.seatId = seatId;
    }
}
