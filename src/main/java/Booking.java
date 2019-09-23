import data.Movies;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;

public class Booking {
    private final Movies movies;

    public Booking(Movies movies) {
        this.movies = movies;
    }

    public String listOfMovies() throws IOException, ParseException {
        File file=new File("/Users/mithil.kumar/Desktop/BookMyShow/BookMyShow/src/main/java/movies.txt");
        movies.setMovies(file);
        String movieNames=movies.getMovieNames();
        return movieNames;
    }
}
