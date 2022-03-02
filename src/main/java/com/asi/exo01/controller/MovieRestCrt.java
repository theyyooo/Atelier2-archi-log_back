package com.asi.exo01.controller;

import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.asi.exo01.model.Movie;
import com.asi.exo01.service.MovieService;

@RestController
public class MovieRestCrt {
	
	private final MovieService mService;
	
	public MovieRestCrt(MovieService mService) {
		this.mService=mService;
	}
	
	@GetMapping("/movies")
	public Collection<Movie> getMovies(){
		return mService.getMovies();
		
	}
	
	@GetMapping("/movie/{id}")
	public Movie getMovie(@PathVariable String id){
		int current_id=Integer.valueOf(id);
		return mService.getMovie(current_id);
	}
	
	@PostMapping("/movie")
	public Movie addMovie(@RequestBody Movie m){
		return mService.addMovie(m);
	}
}
