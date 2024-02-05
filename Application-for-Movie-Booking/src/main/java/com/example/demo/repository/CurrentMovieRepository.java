package com.example.demo.repository;

import com.example.demo.entity.CurrentMovies;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrentMovieRepository extends JpaRepository<CurrentMovies, Integer>  {
}
