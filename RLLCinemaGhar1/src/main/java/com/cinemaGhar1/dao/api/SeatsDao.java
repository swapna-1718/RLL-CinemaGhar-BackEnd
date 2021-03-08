package com.cinemaGhar1.dao.api;

import java.util.List;

import com.cinemaGhar1.dao.entity.Seats;

public interface SeatsDao 
{
	public boolean insert(Seats seat);
	public List<Seats> getAllSeats();
	public List<Seats> getSeatById(Long seatId);

}