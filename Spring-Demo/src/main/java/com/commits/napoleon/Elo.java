package com.commits.napoleon;

public class Elo {
	public Elo(int rating, int previousRating, int projectedRating) {
		super();
		this.rating = rating;
		this.previousRating = previousRating;
		this.projectedRating = projectedRating;
	}
	public Elo() {
		super();
		// TODO Auto-generated constructor stub
	}
	private int rating;
	private int previousRating;
	private int projectedRating;
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public int getPreviousRating() {
		return previousRating;
	}
	public void setPreviousRating(int previousRating) {
		this.previousRating = previousRating;
	}
	public int getProjectedRating() {
		return projectedRating;
	}
	public void setProjectedRating(int projectedRating) {
		this.projectedRating = projectedRating;
	}
	@Override
	public String toString() {
		return "Elo [rating=" + rating + ", previousRating=" + previousRating + ", projectedRating=" + projectedRating
				+ "]";
	}
	
}
