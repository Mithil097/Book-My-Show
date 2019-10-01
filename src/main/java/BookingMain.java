import Theatres.TheatreNotAvailableException;
import services.Booking;
import controller.BookingController;
import data.MoviesHandler;
import data.Parser;
import data.TheatresHandler;
import display.Display;
import model.Movie;
import model.Theatre;
import movies.MovieNotAvailableException;
import services.MoneyNotCorrectException;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;

public class BookingMain {
    public static void main(String[] args) throws IOException, ParseException, MovieNotAvailableException, TheatreNotAvailableException, MoneyNotCorrectException {
        File movieFile = new File("/Users/mithil.kumar/Desktop/BookMyShow/BookMyShow/src/main/resources/movies.txt");
        File theatreFile = new File("/Users/mithil.kumar/Desktop/BookMyShow/BookMyShow/src/main/resources/Theatres.txt");
        Parser parser = new Parser();
        List<Movie> movies = parser.getMovies(movieFile);
        List<Theatre> theatres = parser.getTheatres(theatreFile);
        MoviesHandler moviesHandler = new MoviesHandler(movies);
        TheatresHandler theatresHandler = new TheatresHandler(theatres);
        Booking booking = new Booking(moviesHandler, theatresHandler);
        Display display = new Display();
        BookingController bookingController = new BookingController(booking, display);
        bookingController.menu();
    }
}
