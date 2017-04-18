package com.technicalyorker.codetest.skyhubdigital.recommendation.db;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.technicalyorker.codetest.skyhubdigital.recommendation.model.Movie;
import com.technicalyorker.codetest.skyhubdigital.recommendation.model.MovieList;

public class MovieDB {
	public static List<Movie> getMovieList() {
		MovieList obj = new MovieList();
		ObjectMapper mapper = new ObjectMapper();
		try {
			obj = mapper.readValue(new File(MovieDB.class.getClassLoader().getResource("movies.json").getFile()),
					MovieList.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return obj.getMovies();
	}
}
