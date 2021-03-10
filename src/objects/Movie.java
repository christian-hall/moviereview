package objects;

import java.util.Date;

public class Movie {
	private int movieId;
	private String title;
	private String genre;
	private Date released;
	private String rating;
	private int premise;
	private int plotPace;
	private int plotIntegrity;
	private int plotComplexity;
	private int theme;
	private int musicalScore;
	private int acting;
	private int cinematography;
	private int costume;
	private int specialEffects;
	
	public Movie(int movieId, String title, String genre, Date released, String rating, int premise, int plotPace,
			int plotIntegrity, int plotComplexity, int theme, int musicalScore, int acting, int cinematography,
			int costume, int specialEffects) {
		super();
		this.movieId = movieId;
		this.title = title;
		this.genre = genre;
		this.released = released;
		this.rating = rating;
		this.premise = premise;
		this.plotPace = plotPace;
		this.plotIntegrity = plotIntegrity;
		this.plotComplexity = plotComplexity;
		this.theme = theme;
		this.musicalScore = musicalScore;
		this.acting = acting;
		this.cinematography = cinematography;
		this.costume = costume;
		this.specialEffects = specialEffects;
	}

	public Movie() {
		super();
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Date getReleased() {
		return released;
	}

	public void setReleased(Date released) {
		this.released = released;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public int getPremise() {
		return premise;
	}

	public void setPremise(int premise) {
		this.premise = premise;
	}

	public int getPlotPace() {
		return plotPace;
	}

	public void setPlotPace(int plotPace) {
		this.plotPace = plotPace;
	}

	public int getPlotIntegrity() {
		return plotIntegrity;
	}

	public void setPlotIntegrity(int plotIntegrity) {
		this.plotIntegrity = plotIntegrity;
	}

	public int getPlotComplexity() {
		return plotComplexity;
	}

	public void setPlotComplexity(int plotComplexity) {
		this.plotComplexity = plotComplexity;
	}

	public int getTheme() {
		return theme;
	}

	public void setTheme(int theme) {
		this.theme = theme;
	}

	public int getMusicalScore() {
		return musicalScore;
	}

	public void setMusicalScore(int musicalScore) {
		this.musicalScore = musicalScore;
	}

	public int getActing() {
		return acting;
	}

	public void setActing(int acting) {
		this.acting = acting;
	}

	public int getCinematography() {
		return cinematography;
	}

	public void setCinematography(int cinematography) {
		this.cinematography = cinematography;
	}

	public int getCostume() {
		return costume;
	}

	public void setCostume(int costume) {
		this.costume = costume;
	}

	public int getSpecialEffects() {
		return specialEffects;
	}

	public void setSpecialEffects(int specialEffects) {
		this.specialEffects = specialEffects;
	}
	
	
	
	
	

}
