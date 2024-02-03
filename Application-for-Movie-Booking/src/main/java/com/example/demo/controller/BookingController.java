package com.example.demo.controller;

import com.example.demo.entity.Booking;
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

        return bookingService.createBooking(booking);
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

