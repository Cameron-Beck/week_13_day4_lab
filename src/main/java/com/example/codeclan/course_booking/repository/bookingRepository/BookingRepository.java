package com.example.codeclan.course_booking.repository.bookingRepository;

import com.example.codeclan.course_booking.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long>, BookingRepositoryCustom {


}
