package data;

import model.Movie;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class MoviesHandler {

    private List<Movie> movies;

    public MoviesHandler(Parser parser) throws IOException, ParseException {
        this.movies = parser.getMovies();
    }

    public List<String> getMovieNames() {
        List<String> movieNames = new ArrayList<>();
        for (Movie movie : movies) {
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
