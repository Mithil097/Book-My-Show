package data;

import model.Movie;

import java.util.ArrayList;
import java.util.List;

public class MoviesHandler {

    private List<Movie> movies;

    public MoviesHandler(List<Movie> movies) {
        this.movies = movies;
    }

    public List<String> getMovieNames() {
        List<String> movieNames = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.isAvailable())
                movieNames.add(movie.getMovieName());
        }
        return movieNames;
    }

    public boolean contains(String movieName) {
        for (Movie movie : movies) {
            if (movie.getMovieName().equals(movieName)) {
                return true;
            }
        }
        return false;
    }
}
