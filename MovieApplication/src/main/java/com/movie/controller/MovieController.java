package com.movie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.model.Movie;
import com.movie.service.MovieService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("api/movie")
public class MovieController {
	
	@Autowired
	private MovieService movieService;
	
	@GetMapping("/")
    public String home() {
        return "Movie API is running successfully";
    }
	
	// Add new movie
    @PostMapping("/add")
    public ResponseEntity<Movie> addMovie(@Valid @RequestBody Movie movie) {
        return ResponseEntity.ok(movieService.addMovie(movie));
    }

    // Get movie by ID
    @GetMapping("/{id}")
    public ResponseEntity<?> getMovie(@PathVariable int id) {
        Movie movie = movieService.getMovieById(id);
        if (movie == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(movie);
    }

}
