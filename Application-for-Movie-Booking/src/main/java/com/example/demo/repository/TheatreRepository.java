package com.example.demo.repository;

import com.example.demo.entity.Booking;
import com.example.demo.entity.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;


@Repository
public interface TheatreRepository extends JpaRepository<Theatre, Integer> {

    @Query(
            value = "SELECT b.booking_id, b.user_id, b.current_movie_id, b.total_seats, b.total_amount, " +
                    "sb.booking_seat_id, sb.seat_id " +
                    "FROM booking b join booking_seats sb on b.booking_id = sb.booking_id " +
                    "WHERE b.user_id = :userId",
            nativeQuery = true)
    List<Booking> findTheatresByCityMovieNameDate(String city, String movieName, LocalDate movieDate);
}

/*
select t.theatre_id, t.theatre_name, t.address, t.city,
m.current_movie_id, m.show_timing, m.current_movie_name from theatre t, current_movies m
where t.city="Pune" and m.current_movie_name = "animal" and start_date <= "2024-02-04" and end_date >= "2024-02-04"
 */
