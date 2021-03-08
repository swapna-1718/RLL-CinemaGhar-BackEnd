package com.cinemaGhar1.service;

import java.util.List;

import com.cinemaGhar1.dao.entity.ShowTimings;

public interface ShowTimingsService {
	
	public Boolean insert(ShowTimings show);
	public List<ShowTimings> getAllShowTimings();
	public List<ShowTimings> getShowTimingById(String id);


}