package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table(name = "booking_seats")
public class BookingSeats {


    @Id
    @Column(name="booking_seat_id", nullable = false)
    @JsonProperty("booking_seat_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long bookingSeatId;


    @Column(name="seat_id", nullable = false)
    @JsonProperty("seat_id")
    private String seatId;


    @Column(name="booking_id", nullable = false)
    @JsonProperty("booking_id")
    private long bookingId;


    /*
    @ManyToOne
    @JoinColumn(name = "booking_id")
    private Booking booking;


     */

    public BookingSeats() {
    }


    public BookingSeats(long bookingSeatId, String seatId, long bookingId) {
        this.bookingSeatId = bookingSeatId;
        this.seatId = seatId;
        this.bookingId = bookingId;
    }


    public long getBookingSeatId() {
        return bookingSeatId;
    }

    public String getSeatId() {
        return seatId;
    }

    public long getBookingId() {
        return bookingId;
    }


    public void setBookingSeatId(long bookingSeatId) {
        this.bookingSeatId = bookingSeatId;
    }

    public void setSeatId(String seatId) {
        this.seatId = seatId;
    }

    public void setBookingId(long bookingId) {
        this.bookingId = bookingId;
    }
}
