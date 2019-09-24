package data;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MoviesTest {

    @Test
    void expectListOfMovieNamesToReturnWhenSetMoviesCalledWithAFile() throws IOException, ParseException {
        File file = new File("/Users/mithil.kumar/Desktop/BookMyShow/BookMyShow/src/main/java/movies.txt");
        Movies movies = new Movies(file);
        List<String> movieNames = new ArrayList<>();
        movieNames.add("Bahubali");
        movieNames.add("avengers Infinity war");
        movieNames.add("Maze Runner");
        movieNames.add("Sahoo");
        assertEquals(movieNames, movies.getMovieNames());
    }

    @Test
    void ExpectTrueIfMovieNameIsPresentInTheMovies() throws IOException, ParseException {
        File file = new File("/Users/mithil.kumar/Desktop/BookMyShow/BookMyShow/src/main/java/movies.txt");
        Movies movies = new Movies(file);
        List<String> movieNames = new ArrayList<>();
        movieNames.add("Bahubali");
        movieNames.add("avengers Infinity war");
        movieNames.add("Maze Runner");
        movieNames.add("Sahoo");
        assertTrue(movies.contains("Sahoo"));
    }
}
