package model;

import java.util.Objects;

public class Theatre {

    private final String theatreName;
    private final String movieName;
    private final int numberOfSeats;

    public Theatre(String TheatreName, String movieName) {
        this.theatreName = TheatreName;
        this.movieName = movieName;
        this.numberOfSeats = 100;
    }

    public String getMovieInTheatre() {
        return this.movieName;
    }

    public String getTheatreName() {
        return this.theatreName;
    }

    public int getNumberOfSeats() {
        return this.numberOfSeats;
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
