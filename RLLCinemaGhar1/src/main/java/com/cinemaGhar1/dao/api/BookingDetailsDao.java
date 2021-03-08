package com.cinemaGhar1.dao.api;

import java.util.List;

import com.cinemaGhar1.dao.entity.BookingDetails;

public interface BookingDetailsDao 
{
	public boolean insert(BookingDetails bd);
	public List<BookingDetails> getAllBookingDetails();
	public List<BookingDetails> getAllBookingByUser(String email);
	public List<BookingDetails> getBookingDetailById(Long bookingDetailId);
	public List<Long> getIds();
	public List<String> getTicket();
	
}