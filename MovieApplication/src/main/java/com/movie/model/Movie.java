package com.movie.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class Movie {

	@NotNull
    private Integer id;

    @NotBlank
    private String name;

    @NotBlank
    private String description;

    private String genre;

//    parameterized constructor
	public Movie(@NotNull Integer id, @NotBlank String name, @NotBlank String description, String genre) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.genre = genre;
	}
//getters and setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
// toString method
	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", description=" + description + ", genre=" + genre + "]";
	}

}
