import data.Movies;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BookingTest {
    @Test
    void expectSetListOfMoviesWhenBookIsCalledInBooking() {
        Movies movies = mock(Movies.class);
        Booking bookTheShow = new Booking(movies);
        bookTheShow.listOfMovies();
        verify(movies).setMovies();
    }
}
