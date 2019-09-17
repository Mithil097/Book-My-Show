package data;

import model.Movie;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Movies {
    List<Movie> movies = new ArrayList<>();

    public void setMovies() {
        movies.add(new Movie("Avengers","English",new Date(2018,12,11)));
        movies.add(new Movie("Sahoo","Telugu",new Date(2019,9,12)));
        movies.add(new Movie("DreamGirl","Hindi",new Date(2019,9,5)));
    }

    public String getMovieNames() {
        String movieNames = "";
        for (Movie movie : movies) {
            movieNames += movie.getMovieName() + "\n";
        }
        return movieNames;
    }
}
