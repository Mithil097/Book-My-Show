import Theatres.TheatreNotAvailableException;
import controller.Booking;
import controller.BookingController;
import data.MoviesHandler;
import data.Parser;
import data.TheatresHandler;
import display.Display;
import model.Movie;
import model.Show;
import model.Theatre;
import movies.MovieNotAvailableException;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

public class BookingMain {
    public static void main(String[] args) throws IOException, ParseException, MovieNotAvailableException, TheatreNotAvailableException {
        Scanner input = new Scanner(System.in);
        File movieFile = new File("/Users/mithil.kumar/Desktop/BookMyShow/BookMyShow/src/main/resources/movies.txt");
        File theatreFile = new File("/Users/mithil.kumar/Desktop/BookMyShow/BookMyShow/src/main/resources/Theatres.txt");
        Parser parser = new Parser();
        List<Movie> movies = parser.getMovies(movieFile);
        List<Theatre> theatres = parser.getTheatres(theatreFile);
        MoviesHandler moviesHandler = new MoviesHandler(movies);
        TheatresHandler theatresHandler = new TheatresHandler(theatres);
        Booking booking = new Booking(moviesHandler, theatresHandler);
        Display display=new Display();
        BookingController bookingController=new BookingController(booking,display);
        bookingController.run();
//        System.out.println(booking.getAvailableMovies());
//        String movieName = input.nextLine();
//        System.out.println(booking.getTheatresForAMovie(movieName));
//        String theatreName = input.nextLine();
//        System.out.println(booking.getTimingsForTheTheatre(theatreName));
//        String showTiming=input.nextLine();
//        Show show=booking.getShow(theatreName,showTiming);
//        System.out.println(booking.getAvailableSeats(show));
//        int seatNumber=input.nextInt();
//        booking.bookASeat(show,seatNumber);
//        System.out.println(booking.getAvailableSeats(show));
    }
}
