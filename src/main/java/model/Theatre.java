package model;

import java.util.Objects;

public class Theatre {

    private final String screenName;
    private final String movieName;
    private final int theatreId;

    public Theatre(String screenName, String movieName,int theatreId) {
        this.screenName = screenName;
        this.movieName = movieName;
        this.theatreId=theatreId;
    }

    public String getMovieInTheatre() {
        return this.movieName;
    }

    public String getScreenName() {
        return this.screenName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Theatre theatre = (Theatre) o;
        return Objects.equals(screenName, theatre.screenName) &&
                Objects.equals(movieName, theatre.movieName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(screenName, movieName);
    }
}
