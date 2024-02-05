package com.example.demo.controller;

import com.example.demo.entity.CurrentMovies;
import com.example.demo.entity.Theatre;
import com.example.demo.service.CurrentMovieService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api")
public class CurrentMovieController {
    @Autowired
    private CurrentMovieService currentMovieService;

    static Logger logger
            = LoggerFactory.getLogger(MovieController.class);


    @RequestMapping(value = "/current_movie", method = RequestMethod.POST)
    public CurrentMovies addCurrentMovie(@RequestBody CurrentMovies currentMovie) {

        logger.info("Inside addCurrentMovie");
        logger.info("CurrentMovie details = " + currentMovie.toString());

        CurrentMovies savedMovie = currentMovieService.createCurrentMovie(currentMovie);

        return savedMovie;

    }


    @RequestMapping(value="/current_movie", method=RequestMethod.GET)
    public List<CurrentMovies> getCurrentMovies() {
        logger.info("Inside getCurrentMovies");

        return currentMovieService.getCurrentMovies();
    }

}


