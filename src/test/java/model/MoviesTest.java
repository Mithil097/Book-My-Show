package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MoviesTest {
    @Test
    void expectEmptyStringToReturnWhenMoviesListIsZeroAndCalledGetMovies() {
        Movies movies = new Movies();
        assertEquals("", movies.getMovies());
    }

    @Test
    void expectMovieNamesToReturnWhenSetMoviesAddedListOfMoviesAndCalledGetMovies() {
        Movies movies = new Movies();
        movies.setMovies();
        assertEquals("Avengers\nSahoo\nDreamGirl\n", movies.getMovies());
    }
}
