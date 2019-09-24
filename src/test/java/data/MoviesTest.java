package data;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MoviesTest {

    @Test
    void expectListOfMovieNamesToReturnWhenGetMoviesCalled() throws IOException, ParseException {
        File file = new File("/Users/mithil.kumar/Desktop/BookMyShow/BookMyShow/src/main/java/movies.txt");
        Movies movies = new Movies(file);
        List<String> movieNames = new ArrayList<>();
        movieNames.add("Bahubali");
        movieNames.add("avengers Infinity war");
        movieNames.add("Maze Runner");
        movieNames.add("Sahoo");
        movieNames.add("SyeRaa");
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
        movieNames.add("SyeRaa");
        assertTrue(movies.contains("Sahoo"));
    }
    @Test
    void ExpectFalseIfMovieNameIsNotPresentInTheMovies() throws IOException, ParseException {
        File file = new File("/Users/mithil.kumar/Desktop/BookMyShow/BookMyShow/src/main/java/movies.txt");
        Movies movies = new Movies(file);
        List<String> movieNames = new ArrayList<>();
        movieNames.add("Bahubali");
        movieNames.add("avengers Infinity war");
        movieNames.add("Maze Runner");
        movieNames.add("Sahoo");
        assertFalse(movies.contains("Mithil"));
    }
}
