package com.cinemaGhar1.service;

import java.util.List;

import com.cinemaGhar1.dao.entity.Theaters;

public interface TheaterService {
	
	public Boolean insert(Theaters theater);
	public List< Theaters> getAllTheaters ();
	public  List<Theaters> getTheaterById(String id);

}