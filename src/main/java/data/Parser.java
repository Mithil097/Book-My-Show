package data;

import enums.Movie_Language;
import enums.Movie_Status;
import model.Movie;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Queue;

public class Parser {
    private BufferedReader br;

    public Parser(File file) throws FileNotFoundException {
        this.br = new BufferedReader(new FileReader(file));
    }

    List<Movie> getmovies() throws IOException, ParseException {
        List<Movie> movies=new ArrayList<>();
        String movie = br.readLine();
        while (movie != null) {
            String[] movieDetails = movie.split(",");
            String movieName = movieDetails[0];
            Movie_Language language = Movie_Language.valueOf(movieDetails[1]);
            String releaseDate = movieDetails[2];
            Movie_Status status = Movie_Status.valueOf(movieDetails[3]);
            Date release = new SimpleDateFormat("dd-MM-yyyy").parse(releaseDate);
            movies.add(new Movie(movieName,language,release,status));
            movie = br.readLine();
        }
        return movies;
    }

}
