package com.example.demo.service;

import com.example.demo.entity.Booking;
import com.example.demo.entity.CurrentMovies;
import com.example.demo.repository.CurrentMovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CurrentMovieService {
    @Autowired
    CurrentMovieRepository currentMovieRepository;

    public CurrentMovies  createCurrentMovie(CurrentMovies currentMovie) {
        return currentMovieRepository.save(currentMovie);
    }


    public List<CurrentMovies> getCurrentMovies() {

        return currentMovieRepository.findAll();
    }

}


