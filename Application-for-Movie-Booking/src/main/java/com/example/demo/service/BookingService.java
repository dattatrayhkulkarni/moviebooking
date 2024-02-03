package com.example.demo.service;

import com.example.demo.entity.Booking;
import com.example.demo.entity.Theatre;
import com.example.demo.repository.BookingRepository;
import com.example.demo.repository.TheatreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    @Autowired
    BookingRepository bookingRepository;

    public List<Booking> getBooking() {

        return bookingRepository.findAll();
    }

    public List<Booking> getBookingsByUserid(long userId) {

        return bookingRepository.findBookingsByUserId(userId);
    }

    public Booking createBooking(Booking booking) {

        return bookingRepository.save(booking);
    }
}



