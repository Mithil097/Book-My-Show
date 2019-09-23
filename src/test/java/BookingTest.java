import data.Movies;
import data.Theatres;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class BookingTest {

    @Test
    void expectSetListOfMoviesWhenBookIsCalledInBooking() throws IOException, ParseException {
        Movies movies = mock(Movies.class);
        List<String> movieNames=new ArrayList<>();
        movieNames.add("ABC");
        Theatres theatres=mock(Theatres.class);
        Booking bookTheShow = new Booking(movies,theatres);
        when(movies.getMovieNames()).thenReturn(movieNames);
        assertEquals(movieNames,bookTheShow.listOfMovies());
    }
}
