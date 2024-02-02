package com.example.demo.service;

import com.example.demo.entity.Theatre;
import com.example.demo.repository.TheatreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TheatreService {

    @Autowired
    TheatreRepository theatreRepositoryRepository;

    public List<Theatre> getTheatres() {

        return theatreRepositoryRepository.findAll();
    }

    public Theatre  createTheatre(Theatre theatre) {

        return theatreRepositoryRepository.save(theatre);
    }



}
