import Theatres.TheatreNotAvailableException;
import data.MoviesHandler;
import data.TheatresHandler;
import movies.MovieNotAvailableException;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BookingTest {

    @Test
    void expectListOfAllMoviesNamesPresentInTheFileToReturnWhenCallingListOfMovies() {
        MoviesHandler moviesHandler = mock(MoviesHandler.class);
        List<String> movieNames = new ArrayList<>();
        movieNames.add("ABC");
        TheatresHandler theatresHandler = mock(TheatresHandler.class);
        Booking bookTheShow = new Booking(moviesHandler, theatresHandler);
        when(moviesHandler.getMovieNames()).thenReturn(movieNames);
        assertEquals(movieNames, bookTheShow.getAvailableMovies());
    }


    @Test
    void expectListOfTheatresWhichConsistsAGivenMovieToReturnWhenCallingListOfTheatresForAGivenMovie() throws MovieNotAvailableException {
        MoviesHandler moviesHandler = mock(MoviesHandler.class);
        TheatresHandler theatresHandler = mock(TheatresHandler.class);
        List<String> theatreNames = new ArrayList<>();
        theatreNames.add("PVR");
        theatreNames.add("IMAX");
        Booking bookTheShow = new Booking(moviesHandler, theatresHandler);
        when(moviesHandler.contains("Sahoo")).thenReturn(true);
        when(theatresHandler.getTheatresForMovie("Sahoo")).thenReturn(theatreNames);
        assertEquals(theatreNames, bookTheShow.getTheatresForAMovie("Sahoo"));
    }

    @Test
    void expectExceptionToReturnWhenCallingListOfTheatresForAGivenMovieWhichIsNotPresentInMovies() {
        MoviesHandler moviesHandler = mock(MoviesHandler.class);
        TheatresHandler theatresHandler = mock(TheatresHandler.class);
        try {
            Booking bookTheShow = new Booking(moviesHandler, theatresHandler);
            when(moviesHandler.contains("mithil")).thenReturn(false);
            bookTheShow.getTheatresForAMovie("Mithil");
        } catch (MovieNotAvailableException exception) {
            assertEquals("Movie not Available", exception.getMessage());
        }
    }

    @Test
    void expectListOfShowTimingsForAGivenTheatre() throws TheatreNotAvailableException {
        List<String> timing = new ArrayList<>();
        timing.add("10:00PM");
        timing.add("1:00PM");
        MoviesHandler moviesHandler = mock(MoviesHandler.class);
        TheatresHandler theatresHandler = mock(TheatresHandler.class);
        Booking bookTheShow = new Booking(moviesHandler, theatresHandler);
        when(theatresHandler.contains("Asian")).thenReturn(true);
        when(theatresHandler.getTimingsForTheTheatre("Asian")).thenReturn(timing);
        assertEquals(timing, bookTheShow.getTimingsForTheTheatre("Asian"));
    }
}
