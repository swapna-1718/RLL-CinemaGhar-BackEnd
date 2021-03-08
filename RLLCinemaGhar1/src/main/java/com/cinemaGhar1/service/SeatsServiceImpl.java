package com.cinemaGhar1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cinemaGhar1.dao.api.SeatsDao;
import com.cinemaGhar1.dao.entity.Seats;
@Service
@Transactional
public class SeatsServiceImpl implements SeatsService {
	
	@Autowired
	private SeatsDao seatsDao;

	@Override
	public Boolean insert(Seats seat) {
		return seatsDao.insert(seat);
	}

	@Override
	public List<Seats> getAllSeats() {
		return seatsDao.getAllSeats();
				
	}

	@Override
	public List<Seats> getSeatById(Long id) {
		return seatsDao.getSeatById(id);
	}

}