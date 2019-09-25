package model;

import movies.Language;
import movies.Status;

import java.util.Date;
import java.util.Objects;

public class Movie {
    private final String movieName;
    private final Language language;
    private final Date releaseDate;
    private final Status status;

    public Movie(String movieName, Language language, Date releaseDate, Status status) {
        this.movieName = movieName;
        this.language = language;
        this.releaseDate = releaseDate;
        this.status = status;
    }

    public String getDetails() {
        return movieName + "\t" + language + "\t" + releaseDate;
    }

    public String getMovieName() {
        return movieName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return movieName.equals(movie.movieName) &&
                language == movie.language &&
                Objects.equals(releaseDate, movie.releaseDate) &&
                status == movie.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(movieName, language, releaseDate, status);
    }
}
