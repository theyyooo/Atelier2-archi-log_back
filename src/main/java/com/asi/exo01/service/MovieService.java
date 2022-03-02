package com.asi.exo01.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.asi.exo01.model.Movie;
import com.asi.exo01.repository.MovieRepository;

@Service
public class MovieService {
	private final MovieRepository mRepository;

	public MovieService(MovieRepository mRepository) {
		this.mRepository = mRepository;
	}

	public Movie getMovie(int id) {
		Optional<Movie> mOpt = mRepository.findById(id);
		return mOpt.get();
	}

	public Collection<Movie> getMovies() {
		List<Movie> mL = new ArrayList<Movie>();
		for (Movie m : mRepository.findAll()) {
			mL.add(m);
		}

		return mL;
	}

	public Movie addMovie(Movie m) {
		return mRepository.save(m);
	}

}
