package services;

import Theatres.TheatreNotAvailableException;
import data.MoviesHandler;
import data.TheatresHandler;
import model.SeatNotAvailableException;
import model.Show;
import model.Theatre;
import movies.MovieNotAvailableException;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.*;

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
        Throwable exception = assertThrows(MovieNotAvailableException.class, () -> {
            MoviesHandler moviesHandler = mock(MoviesHandler.class);
            TheatresHandler theatresHandler = mock(TheatresHandler.class);
            Booking bookTheShow = new Booking(moviesHandler, theatresHandler);
            when(moviesHandler.contains("mithil")).thenReturn(false);
            bookTheShow.getTheatresForAMovie("Mithil");
        });
        assertEquals("Movie not Available", exception.getMessage());
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

    @Test
    void expectExceptionToReturnWhenCallingShowTimingsForAGivenMovieWhichIsNotPresentInTheatres() {
        Throwable exception = assertThrows(TheatreNotAvailableException.class, () -> {
            MoviesHandler moviesHandler = mock(MoviesHandler.class);
            TheatresHandler theatresHandler = mock(TheatresHandler.class);
            Booking bookTheShow = new Booking(moviesHandler, theatresHandler);
            when(theatresHandler.contains("mithil")).thenReturn(false);
            bookTheShow.getTimingsForTheTheatre("Mithil");
        });
        assertEquals("Theatre not Available", exception.getMessage());
    }

    @Test
    void expectShowToReturnWhenWeHaveTheatreNameAndShowTimings() {
        MoviesHandler moviesHandler = mock(MoviesHandler.class);
        TheatresHandler theatresHandler = mock(TheatresHandler.class);
        Theatre theatre = mock(Theatre.class);
        Show show = new Show("10:00PM");
        Booking bookTheShow = new Booking(moviesHandler, theatresHandler);
        when(theatresHandler.getTheatre("Asian")).thenReturn(theatre);
        when(theatre.getShow("10:00PM")).thenReturn(show);
        assertEquals(show, bookTheShow.getShow("Asian", "10:00PM"));
    }

    @Test
    void expectAvailableSeatsToReturnWhenBookingCallsGetAvailableSeats() {
        MoviesHandler moviesHandler = mock(MoviesHandler.class);
        TheatresHandler theatresHandler = mock(TheatresHandler.class);
        Show show = mock(Show.class);
        List<Integer> seats = new ArrayList();
        seats.add(1);
        seats.add(2);
        Booking bookTheShow = new Booking(moviesHandler, theatresHandler);
        when(show.getAvailableSeats()).thenReturn(seats);
        assertEquals(seats, bookTheShow.getAvailableSeats(show));
    }

    @Test
    void expectSeatIsBookedForAParticularSelectedShow() throws MoneyNotCorrectException, SeatNotAvailableException {
        MoviesHandler moviesHandler = mock(MoviesHandler.class);
        TheatresHandler theatresHandler = mock(TheatresHandler.class);
        Show show = mock(Show.class);
        Booking bookTheShow = new Booking(moviesHandler, theatresHandler);
        bookTheShow.bookASeat(show, 2);
        verify(show).bookTheSeat(anyInt());
    }

    @Test
    void expectExceptionToReturnWhenCalling() {
        Throwable exception = assertThrows(SeatNotAvailableException.class, () -> {
            MoviesHandler moviesHandler = mock(MoviesHandler.class);
            TheatresHandler theatresHandler = mock(TheatresHandler.class);
            Show show=new Show("11:00PM");
            Booking bookTheShow = new Booking(moviesHandler, theatresHandler);
            bookTheShow.bookASeat(show,11);
        });
        assertEquals("Seat is not available", exception.getMessage());
    }
}
