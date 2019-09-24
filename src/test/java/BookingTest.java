import data.Movies;
import data.Theatres;
import model.Theatre;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BookingTest {

    @Test
    void expectListOfAllMoviesNamesPresentInTheFileToReturnWhenCallingListOfMovies() throws IOException, ParseException {
        Movies movies = mock(Movies.class);
        List<String> movieNames = new ArrayList<>();
        movieNames.add("ABC");
        Theatres theatres = mock(Theatres.class);
        Booking bookTheShow = new Booking(movies, theatres);
        when(movies.getMovieNames()).thenReturn(movieNames);
        assertEquals(movieNames, bookTheShow.listOfMovies());
    }


    @Test
    void expectListOfTheatresWhichConsistsAGivenMovieToReturnWhenCallingListOfTheatresForAGivenMovie() {
        Movies movies = mock(Movies.class);
        Theatres theatres = mock(Theatres.class);
        List<Theatre> theatreNames = new ArrayList<>();
        theatreNames.add(new Theatre("PVR", "Sahoo",112));
        theatreNames.add(new Theatre("IMAX", "Sahoo",123));
        Booking bookTheShow = new Booking(movies, theatres);
        when(theatres.listOfTheatreForAGivenMovie("Sahoo")).thenReturn(theatreNames);
        assertEquals(theatreNames, bookTheShow.listOfTheatresForAGivenMovieName("Sahoo"));
    }
}
