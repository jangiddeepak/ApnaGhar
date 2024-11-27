package com.mydev.apnaghar.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mydev.apnaghar.entity.Booking;

import java.util.Optional;

public interface BookingRepository extends JpaRepository<Booking, Long> {

    Optional<Booking> findByBookingConfirmationCode(String confirmationCode);
}
