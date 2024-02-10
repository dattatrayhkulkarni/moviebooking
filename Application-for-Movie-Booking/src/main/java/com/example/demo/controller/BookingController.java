package com.example.demo.controller;

import com.example.demo.entity.Booking;
import com.example.demo.entity.BookingSeats;
import com.example.demo.entity.Theatre;
import com.example.demo.service.BookingService;
import com.example.demo.service.TheatreService;
import com.example.demo.utils.UUIDGen;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api")
public class BookingController {
    @Autowired
    private BookingService bookingService;

    static Logger logger
            = LoggerFactory.getLogger(MovieController.class);


    @RequestMapping(value="/booking", method= RequestMethod.POST)
    public Booking createBooking(@RequestBody Booking booking) {

        logger.info("Inside createBooking");
        logger.info("Booking details = " + booking.toString());

        if(booking.getUserId() == 0 ||
            booking.getMovieDate() == null ||
            booking.getCurrentMovieId() == 0 ||
            booking.getTotalSeats() == 0 ||
            booking.getTotalAmount() == 0 ||
            booking.getMovieName() == null ||
            booking.getScreenName() == null ) {

            logger.warn("Invalid Booking request");

            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST, "Invalid Booking Request");

        }

        if(booking.getBookingSeatsList() == null || booking.getBookingSeatsList().isEmpty()) {
            logger.warn("No seats specified in the request");

            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST, "No seats specified in the request");
        }

        if(booking.getMovieDate().isBefore(LocalDate.now())) {
            logger.info("Booking date can't be in the past");

            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST, "Booking date can't be in the past");
        }

        Booking savedBooking = bookingService.createBooking(booking);

        return savedBooking;

    }


    @RequestMapping(value="/booking/{userId}", method=RequestMethod.GET)
    public List<Booking> readBookingsByUserId(@PathVariable(value = "userId") long userId) {

        try {

            List<Booking> bookingList = bookingService.getBookingsByUserid(userId);

            if (bookingList == null) {
                logger.warn("Bookings Not Found");
                throw new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Bookings Not Found");
            }

            return bookingList;
        } catch (NoSuchElementException exception) {

            logger.warn("Bookings Not Found");
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Booking Not Found", exception);

        }

    }


}


