package data;

import model.Movie;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class Movies {
    private List<Movie> movies;

    public Movies(File file) throws IOException, ParseException {
        Parser parser = new Parser(file);
        this.movies = parser.getmovies();
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
