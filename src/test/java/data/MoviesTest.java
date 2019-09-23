package data;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MoviesTest {

    @Test
    void expectMovieNamesToReturnWhenSetMoviesAddedListOfMoviesAndCalledGetMovieNames() throws IOException, ParseException {
        Movies movies = new Movies();
        List<String> movieNames=new ArrayList<>();
        movieNames.add("Bahubali");
        movieNames.add("avengers Infinity war");
        movieNames.add("Maze Runner");
        File file=new File("/Users/mithil.kumar/Desktop/BookMyShow/BookMyShow/src/main/java/movies.txt");
        movies.setMovies(file);
        assertEquals(movieNames, movies.getMovieNames());
    }
}
