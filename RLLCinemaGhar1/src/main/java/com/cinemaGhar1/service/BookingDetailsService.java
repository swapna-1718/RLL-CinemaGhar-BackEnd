package com.cinemaGhar1.service;

import java.util.List;

import com.cinemaGhar1.dao.entity.BookingDetails;

public interface BookingDetailsService {

	public Boolean insert(BookingDetails bookingDetails) ;
	public List<BookingDetails> getAllBookingDetails();
	public List<BookingDetails> getBookingDeatilsByUser(String email);
	public List<BookingDetails> getBookingDetailsById(Long id );
	public List<Long> getIds() ;
	public List<String> getTicket();

}