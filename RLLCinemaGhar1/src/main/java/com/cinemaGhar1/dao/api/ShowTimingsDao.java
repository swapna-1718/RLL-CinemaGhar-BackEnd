package com.cinemaGhar1.dao.api;

import java.util.List;

import com.cinemaGhar1.dao.entity.ShowTimings;

public interface ShowTimingsDao
{
	public boolean insert(ShowTimings show);
	public List<ShowTimings> getAllShowTimings();
	//public List<ShowTimings> getShowById(Long showId);
	 public List<ShowTimings> getShowById(String showId);

	
}