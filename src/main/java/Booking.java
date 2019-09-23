import data.Movies;
import data.Theatres;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;

public class Booking {
    private final Movies movies;
    private final Theatres theatres;

    public Booking(Movies movies, Theatres theatres) {
        this.movies = movies;
        this.theatres=theatres;
    }

    public List<String> listOfMovies() throws IOException, ParseException {
        File file=new File("/Users/mithil.kumar/Desktop/BookMyShow/BookMyShow/src/main/java/movies.txt");
        movies.setMovies(file);
        List<String> movieNames=movies.getMovieNames();
        return movieNames;
    }

}
