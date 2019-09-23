package data;

import model.Movie;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Movies {
    private static List<Movie> movies = new ArrayList<>();

    public void setMovies(File file) throws IOException, ParseException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        String movie = br.readLine();
        while (movie != null) {
            String[] movieDetails=movie.split(",");
            String movieName=movieDetails[0];
            String language=movieDetails[1];
            String releaseDate=movieDetails[2];
            System.out.println(movieName+language+releaseDate);
            Date release=new SimpleDateFormat("dd-MM-yyyy").parse(releaseDate);
            movies.add(new Movie(movieName,language,release));
            movie = br.readLine();
        }
    }

    public String getMovieNames() {
        String movieNames = "";
        for (Movie movie : movies) {
            movieNames += movie.getMovieName() + "\n";
        }
        return movieNames;
    }
}
