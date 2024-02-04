package com.example.demo.repository;

import com.example.demo.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long>  {

    @Query(
            value = "SELECT b.booking_id, b.user_id, b.current_movie_id, b.total_seats, b.total_amount, " +
                    "sb.booking_seat_id, sb.seat_id " +
                    "FROM booking b join booking_seats sb on b.booking_id = sb.booking_id " +
                    "WHERE b.user_id = :userId",
            nativeQuery = true)
    List<Booking> findBookingsByUserId(long userId);
}
