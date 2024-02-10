package com.example.demo.service;

import com.example.demo.controller.MovieController;
import com.example.demo.entity.Booking;
import com.example.demo.entity.Theatre;
import com.example.demo.repository.BookingRepository;
import com.example.demo.repository.TheatreRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDate;
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

        logger.info("----  No of seats = " + booking.getBookingSeatsList().size());

        List<String> bookedSeats = bookingRepository.findSeatsByMovieAndDate(booking.getMovieName(),
               booking.getMovieDate(),
                booking.getScreenName(),
                booking.getMovieTiming());


        if(CollectionUtils.containsAny(bookedSeats,booking.getBookingSeatsList())) {
            logger.warn("Some of the seats are not available");

            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST, "Some of the seats are not available");
        }
        else {
            logger.info("Seats are available");
        }

        return bookingRepository.save(booking);
    }
}



