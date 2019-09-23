import data.Movies;
import javafx.beans.binding.When;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class BookingTest {

    @Test
    void expectSetListOfMoviesWhenBookIsCalledInBooking() throws IOException, ParseException {
        Movies movies = mock(Movies.class);
        Booking bookTheShow = new Booking(movies);
        when(movies.getMovieNames()).thenReturn("ABC");
        assertEquals("ABC",bookTheShow.listOfMovies());
    }
}
