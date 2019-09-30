package data;

import model.Movie;
import model.Theatre;
import movies.Language;
import movies.Status;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class Parser {
    private BufferedReader br;

    public List<Movie> getMovies(File file) throws IOException, ParseException {
        br = new BufferedReader(new FileReader(file));
        List<Movie> movies = new ArrayList<>();
        String movie = br.readLine();
        while (movie != null) {
            String[] movieDetails = movie.split(",");
            String movieName = movieDetails[0];
            Language language = Language.valueOf(movieDetails[1]);
            String releaseDate = movieDetails[2];
            Status status = Status.valueOf(movieDetails[3]);
            Date release = new SimpleDateFormat("dd-MM-yyyy").parse(releaseDate);
            movies.add(new Movie(movieName, language, release, status));
            movie = br.readLine();
        }
        return movies;
    }

    public List<Theatre> getTheatres(File theatreFile) throws IOException {

        br = new BufferedReader(new FileReader(theatreFile));
        List<Theatre> theatres = new ArrayList<>();
        String theatre = br.readLine();
        while (theatre != null) {
            String[] theatreDetails = theatre.split(",");
            String theatreName = theatreDetails[0];
            String movieName = theatreDetails[1];
            theatres.add(new Theatre(theatreName, movieName));
            theatre = br.readLine();
        }
        return theatres;
    }
}
