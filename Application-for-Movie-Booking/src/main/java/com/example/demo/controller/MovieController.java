package com.example.demo.controller;

import com.example.demo.entity.Theatre;
import com.example.demo.service.TheatreService;
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
public class MovieController {
    @Autowired
    private TheatreService theatreServiceService;

    static Logger logger
            = LoggerFactory.getLogger(MovieController.class);


    @RequestMapping(value="/theatre", method=RequestMethod.GET)
    public List<Theatre> readTheatres() {
    //public String readTheatres() {
        logger.info("Inside read Theatres");

        return theatreServiceService.getTheatres();
    }


    @RequestMapping(value="/theatre", method= RequestMethod.POST)
    public Theatre createTrade(@RequestBody Theatre theatre) {

        return theatreServiceService.createTheatre(theatre);
    }



}
