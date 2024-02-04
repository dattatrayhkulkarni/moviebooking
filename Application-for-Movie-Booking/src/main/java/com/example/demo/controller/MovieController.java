package com.example.demo.controller;

import com.example.demo.entity.Theatre;
import com.example.demo.service.TheatreService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MovieController {
    @Autowired
    private TheatreService theatreServiceService;

    static Logger logger
            = LoggerFactory.getLogger(MovieController.class);


    @RequestMapping(value="/theatre/{city}/{movie_name}/{date}", method=RequestMethod.GET)
    public List<Theatre> getTheatresByMovieNameCityDate(@PathVariable(value = "city") String city,
                                                        @PathVariable(value = "movie_name") String movie_name,
                                                         @PathVariable(value = "date") String date)
    {
        logger.info("Inside read getTheatresByMovieNameCityDate");

        logger.info("City = " + city);
        logger.info("movie_name = " + movie_name);
        logger.info("date = " + date);

        return theatreServiceService.getTheatres();
    }


    @RequestMapping(value="/theatre", method=RequestMethod.GET)
    public List<Theatre> readTheatres() {
        logger.info("Inside read Theatres");

        return theatreServiceService.getTheatres();
    }



    @RequestMapping(value="/theatre", method= RequestMethod.POST)
    public Theatre createTrade(@RequestBody Theatre theatre) {

        return theatreServiceService.createTheatre(theatre);
    }



}
