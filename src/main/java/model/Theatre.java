package model;

import java.util.Objects;

public class Theatre {

    private final String TheatreName;
    private final String movieName;
    private final int theatreId;

    public Theatre(String TheatreName, String movieName, int theatreId) {
        this.TheatreName = TheatreName;
        this.movieName = movieName;
        this.theatreId = theatreId;
    }

    public String getMovieInTheatre() {
        return this.movieName;
    }

    public String getTheatreName() {
        return this.TheatreName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Theatre theatre = (Theatre) o;
        return Objects.equals(TheatreName, theatre.TheatreName) &&
                Objects.equals(movieName, theatre.movieName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(TheatreName, movieName);
    }
}
