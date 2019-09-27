package Controller;

import Theatres.TheatreNotAvailableException;
import controller.Booking;
import controller.BookingController;
import display.Display;
import movies.MovieNotAvailableException;
import org.junit.jupiter.api.Test;

import static org.mockito.Matchers.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BookingControllerTest {


    @Test
    void expectToPrintAvailableMoviesWhenDisplayCallsAvailableMovies() throws MovieNotAvailableException, TheatreNotAvailableException {
        Display display=mock(Display.class);
        Booking booking=mock(Booking.class);
        BookingController bookingController=new BookingController(booking,display);
        bookingController.run();
        verify(display).showAvailableMovies(any());
    }

    @Test
    void expectMovieNameToReturnWhenDisplayCallsGetMovieName() throws MovieNotAvailableException, TheatreNotAvailableException {
        Display display=mock(Display.class);
        Booking booking=mock(Booking.class);
        BookingController bookingController=new BookingController(booking,display);
        bookingController.run();
        verify(display).getMovieName();
    }

    @Test
    void expectToPrintTheatresNameWhenDisplayCallsShowTheatres() throws MovieNotAvailableException, TheatreNotAvailableException {
        Display display=mock(Display.class);
        Booking booking=mock(Booking.class);
        BookingController bookingController=new BookingController(booking,display);
        bookingController.run();
        verify(display).showTheatres(any());
    }

    @Test
    void expectToPrintShowTimingsWhenDisplayCallsShowTimingsForATheatre() throws MovieNotAvailableException, TheatreNotAvailableException {
        Display display=mock(Display.class);
        Booking booking=mock(Booking.class);
        BookingController bookingController=new BookingController(booking,display);
        bookingController.run();
        verify(display).showTimings(any());
    }

    @Test
    void expectGetTheInputTimingOfTheShowFromConsole() throws MovieNotAvailableException, TheatreNotAvailableException {
        Display display=mock(Display.class);
        Booking booking=mock(Booking.class);
        BookingController bookingController=new BookingController(booking,display);
        bookingController.run();
        verify(display).getTimings();
    }

    @Test
    void expectToShowATicketForABookingOfASeat() throws MovieNotAvailableException, TheatreNotAvailableException {
        Display display=mock(Display.class);
        Booking booking=mock(Booking.class);
        BookingController bookingController=new BookingController(booking,display);
        bookingController.run();
        verify(display).generateTicket(anyString(),anyString(),anyString(),anyString(),anyInt());
    }

    @Test
    void expectToShowAvailableSeatsForAParticularSelected() throws MovieNotAvailableException, TheatreNotAvailableException {
        Display display=mock(Display.class);
        Booking booking=mock(Booking.class);
        BookingController bookingController=new BookingController(booking,display);
        bookingController.run();
        verify(display).showAvailableSeats(any());
    }

    @Test
    void expectToGetASeatNumberFromTheConsole() throws MovieNotAvailableException, TheatreNotAvailableException {
        Display display=mock(Display.class);
        Booking booking=mock(Booking.class);
        BookingController bookingController=new BookingController(booking,display);
        bookingController.run();
        verify(display).getSeatNumber();
    }

    @Test
    void expectToGetAUserNameFromTheConsole() throws MovieNotAvailableException, TheatreNotAvailableException {
        Display display=mock(Display.class);
        Booking booking=mock(Booking.class);
        BookingController bookingController=new BookingController(booking,display);
        bookingController.run();
        verify(display).getUserName();
    }

    @Test
    void expectToCallAvailableMoviesInBookingToGetMovies() throws MovieNotAvailableException, TheatreNotAvailableException {
        Display display=mock(Display.class);
        Booking booking=mock(Booking.class);
        BookingController bookingController=new BookingController(booking,display);
        bookingController.run();
        verify(booking).getAvailableMovies();
    }

    @Test
    void expectToGetTheatresNamesForAMovieToReturn() throws MovieNotAvailableException, TheatreNotAvailableException {
        Display display=mock(Display.class);
        Booking booking=mock(Booking.class);
        BookingController bookingController=new BookingController(booking,display);
        bookingController.run();
        verify(booking).getTheatresForAMovie(any());
    }

    @Test
    void expectTheatreTimingsToReturnWhenATheatre() throws MovieNotAvailableException, TheatreNotAvailableException {
        Display display=mock(Display.class);
        Booking booking=mock(Booking.class);
        BookingController bookingController=new BookingController(booking,display);
        bookingController.run();
        verify(booking).getTimingsForTheTheatre(any());
    }

    @Test
    void expectAvailableSeatsToReturnWhenShowIsSelectedInATheatre() throws MovieNotAvailableException, TheatreNotAvailableException {
        Display display=mock(Display.class);
        Booking booking=mock(Booking.class);
        BookingController bookingController=new BookingController(booking,display);
        bookingController.run();
        verify(booking).getAvailableSeats(any());
    }

    @Test
    void expectToBookASeatForParticularSeatAndShow() throws MovieNotAvailableException, TheatreNotAvailableException {
        Display display=mock(Display.class);
        Booking booking=mock(Booking.class);
        BookingController bookingController=new BookingController(booking,display);
        bookingController.run();
        verify(booking).bookASeat(any(),anyInt());
    }

}
