package model;

import enums.Movie_Status;
import enums.Movie_Language;

import java.util.Date;

public class Movie {
    private final String movieName;
    private final Movie_Language language;
    private final Date releaseDate;
    private final Movie_Status status;

    public Movie(String movieName, Movie_Language language, Date releaseDate, Movie_Status status) {
        this.movieName = movieName;
        this.language = language;
        this.releaseDate = releaseDate;
        this.status=status;
    }

    public String getDetails() {
        return movieName + "\t" + language + "\t" + releaseDate;
    }

    public String getMovieName() {
        return movieName;
    }

    public Movie_Status getStatus(){
        return this.status;
    }
}
