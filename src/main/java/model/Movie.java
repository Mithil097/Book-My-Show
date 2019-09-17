package model;

import java.util.Date;

public class Movie {
    private final String movieName;
    private final String language;
    private final Date releaseDate;

    public Movie(String movieName, String language, Date releaseDate) {
        this.movieName = movieName;
        this.language = language;
        this.releaseDate = releaseDate;
    }

    public String getDetails() {

        return movieName + "\t" + language + "\t" + releaseDate;
    }

    public String getMovieName() {

        return movieName;
    }
}
