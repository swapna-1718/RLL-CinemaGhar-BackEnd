package com.cinemaGhar1.dao.api;

import java.util.List;

import com.cinemaGhar1.dao.entity.Theaters;

public interface TheatersDao {
	public Boolean insert(Theaters theater);
	public List< Theaters> getAllTheaters ();
	public  List<Theaters> getTheaterById(String id);
	
}
