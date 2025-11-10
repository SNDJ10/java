package com.xworkz.methodsinjava.dto;

import java.util.Objects;

public class MovieDto {

    private int movieId;
    private long imdbId;
    private boolean released;
    private char ratingCode;
    private double budget;

    private String movieName;
    private String directorName;
    private Integer releaseYear;
    private Long boxOfficeCollection;
    private Double imdbRating;
    private Float durationInHours;
    private Boolean hitStatus;

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public void setImdbId(long imdbId) {
        this.imdbId = imdbId;
    }

    public void setReleased(boolean released) {
        this.released = released;
    }

    public void setRatingCode(char ratingCode) {
        this.ratingCode = ratingCode;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setBoxOfficeCollection(Long boxOfficeCollection) {
        this.boxOfficeCollection = boxOfficeCollection;
    }

    public void setImdbRating(Double imdbRating) {
        this.imdbRating = imdbRating;
    }

    public void setDurationInHours(Float durationInHours) {
        this.durationInHours = durationInHours;
    }

    public void setHitStatus(Boolean hitStatus) {
        this.hitStatus = hitStatus;
    }

    public int getMovieId() {
        return movieId;
    }

    public long getImdbId() {
        return imdbId;
    }

    public boolean isReleased() {
        return released;
    }

    public char getRatingCode() {
        return ratingCode;
    }

    public double getBudget() {
        return budget;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getDirectorName() {
        return directorName;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public Long getBoxOfficeCollection() {
        return boxOfficeCollection;
    }

    public Double getImdbRating() {
        return imdbRating;
    }

    public Float getDurationInHours() {
        return durationInHours;
    }

    public Boolean getHitStatus() {
        return hitStatus;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                movieId,
                imdbId,
                released,
                ratingCode,
                budget,
                movieName,
                directorName,
                releaseYear,
                boxOfficeCollection,
                imdbRating,
                durationInHours,
                hitStatus
        );
    }

    @Override
    public boolean equals(Object object) {
        if (this == object)
            return true;
        if (object == null)
            return false;
        if (getClass() != object.getClass())
            return false;
        MovieDto other = (MovieDto) object;
        if (movieId != other.movieId)
            return false;
        if (imdbId != other.imdbId)
            return false;
        if (released != other.released)
            return false;
        if (ratingCode != other.ratingCode)
            return false;
        if (Double.compare(other.budget, budget) != 0)
            return false;
        if (!Objects.equals(movieName, other.movieName))
            return false;
        if (!Objects.equals(directorName, other.directorName))
            return false;
        if (!Objects.equals(releaseYear, other.releaseYear))
            return false;
        if (!Objects.equals(boxOfficeCollection, other.boxOfficeCollection))
            return false;
        if (!Objects.equals(imdbRating, other.imdbRating))
            return false;
        if (!Objects.equals(durationInHours, other.durationInHours))
            return false;
        if (!Objects.equals(hitStatus, other.hitStatus))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "MovieDto {"
                + "\n  movieId = " + movieId
                + ",\n  movieName = '" + movieName + '\''
                + ",\n  directorName = '" + directorName + '\''
                + ",\n  imdbId = " + imdbId
                + ",\n  released = " + released
                + ",\n  ratingCode = " + ratingCode
                + ",\n  budget = " + budget
                + ",\n  releaseYear = " + releaseYear
                + ",\n  boxOfficeCollection = " + boxOfficeCollection
                + ",\n  imdbRating = " + imdbRating
                + ",\n  durationInHours = " + durationInHours
                + ",\n  hitStatus = " + hitStatus
                + "\n}";
    }
}

