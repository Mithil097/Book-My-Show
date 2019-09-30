package model;

import Theatres.Shows;

import java.util.List;
import java.util.Objects;

public class Theatre {

    private final String theatreName;
    private final String movieName;
    //todo
    private final int numberOfSeats;
    private final Shows shows;

    public Theatre(String TheatreName, String movieName) {
        this.theatreName = TheatreName;
        this.movieName = movieName;
        this.shows = new Shows();
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

    public List<Show> getShowTimings() {
        List<Show> showTimings = shows.getTimings();
        return showTimings;
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


    public Show getShow(String showTime) {
        Show showTiming = null;
        List<Show> shows = this.getShowTimings();
        for (Show show : shows) {
            if (show.getShowTime().equals(showTime)) {
                showTiming = show;
            }
        }
        return showTiming;
    }
}
