import Exceptions.DoesNotExist;
import data.Movies;
import data.Theatres;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) throws IOException, ParseException, DoesNotExist {
        Scanner input = new Scanner(System.in);
        File file = new File("/Users/mithil.kumar/Desktop/BookMyShow/BookMyShow/src/main/java/movies.txt");
        Movies movies = new Movies(file);
        Theatres theatres = new Theatres();
        Booking book = new Booking(movies, theatres);
        System.out.println(book.listOfMovies());
        String movieName = input.nextLine();
        System.out.println(book.listOfTheatresForAGivenMovieName(movieName));
    }
}
