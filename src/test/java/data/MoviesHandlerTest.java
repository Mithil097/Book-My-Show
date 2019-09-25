package data;

import model.Movie;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static movies.Language.ENGLISH;
import static movies.Language.TELUGU;
import static movies.Status.AVAILABLE;
import static movies.Status.NOT_AVAILABLE;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class MoviesHandlerTest {

    @Test
    void expectListOfMovieNamesToReturnWhenGetMoviesCalled() throws IOException, ParseException, NoSuchFieldException {
        Parser mockParser=mock(Parser.class);
        List<Movie> movies=new ArrayList<>();
        movies.add(new Movie("Bahubali", TELUGU,new Date(2015,07,31), AVAILABLE));
        movies.add(new Movie("avengers Infinity war", ENGLISH,new Date(2019,05,12), AVAILABLE));
        when(mockParser.getMovies()).thenReturn(movies);
        MoviesHandler moviesHandler =new MoviesHandler(mockParser);
        List<String> movieNames = new ArrayList<>();
        movieNames.add("Bahubali");
        movieNames.add("avengers Infinity war");
        assertEquals(movieNames, moviesHandler.getMovieNames());
    }

    @Test
    void expectTrueIfMovieNameIsPresentInTheMovies() throws IOException, ParseException {
        Parser mockParser=mock(Parser.class);
        List<Movie> movies=new ArrayList<>();
        movies.add(new Movie("Bahubali", TELUGU,new Date(2015,07,31), AVAILABLE));
        movies.add(new Movie("Sahoo", TELUGU,new Date(2019,05,12), AVAILABLE));
        movies.add(new Movie("avengers Infinity war", ENGLISH,new Date(2019,05,12), AVAILABLE));
        when(mockParser.getMovies()).thenReturn(movies);
        MoviesHandler moviesHandler = new MoviesHandler(mockParser);
        List<String> movieNames = new ArrayList<>();
        movieNames.add("Bahubali");
        movieNames.add("Sahoo");
        movieNames.add("avengers Infinity war");
        assertTrue(moviesHandler.contains("Sahoo"));
    }
    @Test
    void expectFalseIfMovieNameIsNotPresentInTheMovies() throws IOException, ParseException {
        Parser mockParser=mock(Parser.class);
        List<Movie> movies=new ArrayList<>();
        movies.add(new Movie("Bahubali", TELUGU,new Date(2015,07,31), AVAILABLE));
        movies.add(new Movie("Sahoo", TELUGU,new Date(2019,05,12), AVAILABLE));
        movies.add(new Movie("avengers Infinity war", ENGLISH,new Date(2019,05,12), AVAILABLE));
        when(mockParser.getMovies()).thenReturn(movies);
        MoviesHandler moviesHandler = new MoviesHandler(mockParser);
        List<String> movieNames = new ArrayList<>();
        movieNames.add("Bahubali");
        movieNames.add("Sahoo");
        movieNames.add("avengers Infinity war");
        assertFalse(moviesHandler.contains("Mithil"));
    }

    @Test
    void expectListOfAvailableMovieNamesToReturnWhenGetMoviesCalled() throws IOException, ParseException, NoSuchFieldException {
        Parser mockParser=mock(Parser.class);
        List<Movie> movies=new ArrayList<>();
        movies.add(new Movie("Bahubali", TELUGU,new Date(2015,07,31), AVAILABLE));
        movies.add(new Movie("avengers Infinity war", ENGLISH,new Date(2019,05,12), AVAILABLE));
        movies.add(new Movie("Maze Runner", ENGLISH,new Date(2019,05,12), NOT_AVAILABLE));
        when(mockParser.getMovies()).thenReturn(movies);
        MoviesHandler moviesHandler =new MoviesHandler(mockParser);
        List<String> movieNames = new ArrayList<>();
        movieNames.add("Bahubali");
        movieNames.add("avengers Infinity war");
        assertEquals(movieNames, moviesHandler.getMovieNames());
    }

}
