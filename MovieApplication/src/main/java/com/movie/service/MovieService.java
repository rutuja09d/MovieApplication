package com.movie.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.movie.model.Movie;

@Service
public class MovieService {
	private final List<Movie> movies = new ArrayList<>();

    public Movie addMovie(Movie movie) {
        movies.add(movie);
        return movie;
    }

    public Movie getMovieById(int id) {
        return movies.stream()
                .filter(m -> m.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
