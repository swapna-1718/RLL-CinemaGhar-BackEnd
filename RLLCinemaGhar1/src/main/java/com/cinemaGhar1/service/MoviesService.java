package com.cinemaGhar1.service;

import java.util.List;

import com.cinemaGhar1.dao.entity.Movies;

public interface MoviesService {
	
	public Boolean insert(Movies movie);
	public List<Movies> getAllMovies();
//	public List<Movies> getMovieById(String id);
	public List<Movies> getMovieById(long id);

}