package com.example.demo.service;

import com.example.demo.controller.MovieController;
import com.example.demo.entity.Booking;
import com.example.demo.entity.Theatre;
import com.example.demo.repository.BookingRepository;
import com.example.demo.repository.TheatreRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    @Autowired
    BookingRepository bookingRepository;

    static Logger logger
            = LoggerFactory.getLogger(MovieController.class);

    public List<Booking> getBooking() {

        return bookingRepository.findAll();
    }

    public List<Booking> getBookingsByUserid(long userId) {

        return bookingRepository.findBookingsByUserId(userId);
    }

    public Booking createBooking(Booking booking) {

        //logger.info("----  No of seats = " + booking.getBookingSeatsList().size());

        return bookingRepository.save(booking);
    }
}



