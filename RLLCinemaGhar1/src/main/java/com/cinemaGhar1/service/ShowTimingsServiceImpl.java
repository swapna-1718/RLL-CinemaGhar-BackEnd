package com.cinemaGhar1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cinemaGhar1.dao.api.ShowTimingsDao;
import com.cinemaGhar1.dao.entity.ShowTimings;
@Service
@Transactional
public class ShowTimingsServiceImpl implements ShowTimingsService{
	
	@Autowired
	private ShowTimingsDao showTimingsDao;

	@Override
	public Boolean insert(ShowTimings show) {
		return showTimingsDao.insert(show);
	}

	@Override
	public List<ShowTimings> getAllShowTimings() {
		return showTimingsDao.getAllShowTimings();
	}

	@Override
	public List<ShowTimings> getShowTimingById(String id) {
		return showTimingsDao.getShowById(id);
	}

}