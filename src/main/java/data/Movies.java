package data;

import model.Movie;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Movies {
    private List<Movie> movies = new ArrayList<>();

    public void setMovies(File file) throws IOException, ParseException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        String movie = br.readLine();
        while (movie != null) {
            String[] movieDetails = movie.split(",");
            String movieName = movieDetails[0];
            String language = movieDetails[1];
            String releaseDate = movieDetails[2];
            Date release = new SimpleDateFormat("dd-MM-yyyy").parse(releaseDate);
            movies.add(new Movie(movieName, language, release));
            movie = br.readLine();
        }
    }

    public List<String> getMovieNames() {
        List<String> movieNames = new ArrayList<>();
        for (Movie movie : movies) {
            movieNames.add(movie.getMovieName());
        }
        return movieNames;
    }
}
