package data;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MoviesTest {

    @Test
    void expectMovieNamesToReturnWhenSetMoviesAddedListOfMoviesAndCalledGetMovieNames() throws IOException, ParseException {
        Movies movies = new Movies();
        File file=new File("/Users/mithil.kumar/Desktop/BookMyShow/BookMyShow/src/main/java/movies.txt");
        movies.setMovies(file);
        assertEquals("Bahubali\navengers Infinity war\nMaze Runner\n", movies.getMovieNames());
    }
}
