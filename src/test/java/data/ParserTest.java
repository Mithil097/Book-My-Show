package data;

import model.Movie;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static movies.Language.ENGLISH;
import static movies.Language.TELUGU;
import static movies.Status.Available;
import static movies.Status.NotAvailable;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParserTest {
    @Test
    void expectListOfMoviesToReturnWhenGetMoviesCalled() throws IOException, ParseException {
        File file = new File("/Users/mithil.kumar/Desktop/BookMyShow/BookMyShow/src/main/resources/movies.txt");
        Parser parser=new Parser(file);
        List<Movie> movies=new ArrayList<>();
        movies.add(new Movie("Bahubali", TELUGU,new Date(2015,07,31),Available));
        movies.add(new Movie("avengers Infinity war", ENGLISH,new Date(2019,05,12),Available));
        movies.add(new Movie("Maze Runner", TELUGU,new Date(2018,11,02),Available));
        movies.add(new Movie("Sahoo", TELUGU,new Date(2019,8,31),Available));
        movies.add(new Movie("SyeRaa", TELUGU,new Date(2019,10,02),NotAvailable));
        assertEquals(movies, parser.getMovies());
    }
}
