package com.example.demo.repository;

import com.example.demo.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long>  {

    @Query(
            value = "SELECT * FROM booking b WHERE b.user_id = :userId",
            nativeQuery = true)
    List<Booking> findBookingsByUserId(long userId);
}
