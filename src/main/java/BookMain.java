import data.MoviesHandler;
import data.Parser;
import data.TheatresHandler;
import movies.MovieDoesNotExistException;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) throws IOException, ParseException, MovieDoesNotExistException {
        Scanner input = new Scanner(System.in);
        File file = new File("/Users/mithil.kumar/Desktop/BookMyShow/BookMyShow/src/main/resources/movies.txt");
        File theatreFile = new File("/Users/mithil.kumar/Desktop/BookMyShow/BookMyShow/src/main/resources/Theatres.txt");
        Parser parser = new Parser(file);
        Parser theatreParser = new Parser(theatreFile);
        MoviesHandler moviesHandler = new MoviesHandler(parser);
        TheatresHandler theatresHandler = new TheatresHandler(theatreParser);
        Booking book = new Booking(moviesHandler, theatresHandler);
        System.out.println(book.listOfMovies());
        String movieName = input.nextLine();
        System.out.println(book.listOfTheatresForAGivenMovieName(movieName));
    }
}
