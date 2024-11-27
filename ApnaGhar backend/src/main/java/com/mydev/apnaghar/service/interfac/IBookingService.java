package com.mydev.apnaghar.service.interfac;

import com.mydev.apnaghar.dto.Response;
import com.mydev.apnaghar.entity.Booking;

public interface IBookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);

}