package com.technicalyorker.codetest.skyhubdigital.recommendation;

import com.technicalyorker.codetest.skyhubdigital.recommendation.model.Movie;

public class TwoMovies implements Comparable<TwoMovies> {
	private Movie movie1;
	private Movie movie2;

	public TwoMovies(Movie movie1, Movie movie2) {
		super();
		this.movie1 = movie1;
		this.movie2 = movie2;
	}

	public Integer getTime() {
		return movie1.getRuntime() + movie2.getRuntime();
	}

	@Override
	public int compareTo(TwoMovies anotherTwoMovies) {
		Integer compare = anotherTwoMovies.getTime().compareTo(this.getTime());
		if (compare == 0) {
			return (anotherTwoMovies.movie1.getOriginalTitle() + this.movie1.getOriginalTitle())
					.compareTo(anotherTwoMovies.movie2.getOriginalTitle() + this.movie2.getOriginalTitle());
		}
		return compare;
	}

	@Override
	public String toString() {
		return movie1.getOriginalTitle() + "(" + movie1.getRuntime() + ")  " + movie2.getOriginalTitle() + "("
				+ movie2.getRuntime() + ")   " + getTime();
	}

}
