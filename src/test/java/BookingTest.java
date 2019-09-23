import data.Movies;
import data.Theatres;
import model.Theatre;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class BookingTest {

    @Test
    void expectSetListOfMoviesWhenLisOfMoviesIsCalledInBooking() throws IOException, ParseException {
        Movies movies = mock(Movies.class);
        List<String> movieNames=new ArrayList<>();
        movieNames.add("ABC");
        Theatres theatres=mock(Theatres.class);
        Booking bookTheShow = new Booking(movies,theatres);
        when(movies.getMovieNames()).thenReturn(movieNames);
        assertEquals(movieNames,bookTheShow.listOfMovies());
    }


    @Test
    void expectListOfTheatresWhenBookIsCalledInBooking(){
        Movies movies = mock(Movies.class);
        Theatres theatres=mock(Theatres.class);
        List<Theatre> theatreNames=new ArrayList<>();
        theatreNames.add(new Theatre("PVR","Sahoo"));
        theatreNames.add(new Theatre("IMAX","Sahoo"));
        Booking bookTheShow = new Booking(movies,theatres);
        when(theatres.listOfTheatreForAGivenMovie("Sahoo")).thenReturn(theatreNames);
        assertEquals(theatreNames,bookTheShow.listOfTheatresForAGivenMovieName("Sahoo"));
    }
}
