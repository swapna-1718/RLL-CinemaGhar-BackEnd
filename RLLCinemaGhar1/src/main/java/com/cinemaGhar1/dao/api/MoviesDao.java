package com.cinemaGhar1.dao.api;

import java.util.List;

import com.cinemaGhar1.dao.entity.Movies;

public interface MoviesDao
{
	public boolean insert(Movies movie);
	public List<Movies> getAllMovies();
	//public List<Movies> getMovieById(Long movieId);
	// public List<Movies> getMovieById(String id);
 public	List<Movies> getMovieById(Long movieId);
	
}