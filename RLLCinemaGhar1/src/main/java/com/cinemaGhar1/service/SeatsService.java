package com.cinemaGhar1.service;

import java.util.List;

import com.cinemaGhar1.dao.entity.Seats;

public interface SeatsService {
	
	public Boolean insert(Seats seat);
	public List<Seats> getAllSeats();
	public List<Seats> getSeatById(Long seatId);

}