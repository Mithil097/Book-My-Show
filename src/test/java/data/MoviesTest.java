package data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MoviesTest {
    @Test
    void expectEmptyStringToReturnWhenMoviesListIsZeroAndCalledGetMovieNames() {
        Movies movies = new Movies();
        assertEquals("", movies.getMovieNames());
    }

    @Test
    void expectMovieNamesToReturnWhenSetMoviesAddedListOfMoviesAndCalledGetMovieNames() {
        Movies movies = new Movies();
        movies.setMovies();
        assertEquals("Avengers\nSahoo\nDreamGirl\n", movies.getMovieNames());
    }
}
