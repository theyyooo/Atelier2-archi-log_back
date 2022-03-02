package com.asi.exo01.repository;

import org.springframework.data.repository.CrudRepository;

import com.asi.exo01.model.Movie;

public interface MovieRepository extends CrudRepository<Movie, Integer> {

}
