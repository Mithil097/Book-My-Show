package model;

import java.util.Objects;

public class Theatre {

    //todo naming conventions
    private final String theatreName;
    private final String movieName;

    public Theatre(String TheatreName, String movieName) {
        this.theatreName = TheatreName;
        this.movieName = movieName;
    }

    public String getMovieInTheatre() {
        return this.movieName;
    }

    public String getTheatreName() {
        return this.theatreName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Theatre theatre = (Theatre) o;
        return Objects.equals(theatreName, theatre.theatreName) &&
                Objects.equals(movieName, theatre.movieName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(theatreName, movieName);
    }
}
