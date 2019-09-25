import movies.MovieDoesNotExistException;
import data.MoviesHandler;
import data.TheatresHandler;
import model.Theatre;
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
        assertEquals(movieNames, bookTheShow.listOfMovies());
    }


    @Test
    void expectListOfTheatresWhichConsistsAGivenMovieToReturnWhenCallingListOfTheatresForAGivenMovie() throws MovieDoesNotExistException {
        MoviesHandler moviesHandler = mock(MoviesHandler.class);
        TheatresHandler theatresHandler = mock(TheatresHandler.class);
        List<Theatre> theatreNames = new ArrayList<>();
        theatreNames.add(new Theatre("PVR", "Sahoo"));
        theatreNames.add(new Theatre("IMAX", "Sahoo"));
        Booking bookTheShow = new Booking(moviesHandler, theatresHandler);
        when(moviesHandler.contains("Sahoo")).thenReturn(true);
        when(theatresHandler.getTheatresForMovie("Sahoo")).thenReturn(theatreNames);
        assertEquals(theatreNames, bookTheShow.listOfTheatresForAGivenMovieName("Sahoo"));
    }

    //todo junit way expecting exception
    @Test
    void expectExceptionToReturnWhenCallingListOfTheatresForAGivenMovieWhichIsNotPresentInMovies() {
        MoviesHandler moviesHandler = mock(MoviesHandler.class);
        TheatresHandler theatresHandler = mock(TheatresHandler.class);
        List<Theatre> theatreNames = new ArrayList<>();
        theatreNames.add(new Theatre("PVR", "Sahoo"));
        theatreNames.add(new Theatre("IMAX", "Sahoo"));
        try {
            Booking bookTheShow = new Booking(moviesHandler, theatresHandler);
            when(moviesHandler.contains("mithil")).thenReturn(false);
            bookTheShow.listOfTheatresForAGivenMovieName("Mithil");
        } catch (MovieDoesNotExistException exception) {
            assertEquals("Movie is not Available", exception.getMessage());
        }
    }
}
