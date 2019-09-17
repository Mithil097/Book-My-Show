package model;

public class Theatre {
    private final String screenName;
    private final String movieName;

    public Theatre(String screenName, String movieName) {
        this.screenName = screenName;
        this.movieName = movieName;
    }

    String getMovieInTheatre() {
        return this.movieName;
    }

    String getScreenName() {
        return this.screenName;
    }
}
