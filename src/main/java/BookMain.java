import data.Movies;
import data.Theatres;
import model.Theatre;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) throws IOException, ParseException {
        Scanner input = new Scanner(System.in);
        Movies movies = new Movies();
        Theatres theatres = new Theatres();
        Booking book = new Booking(movies, theatres);
        System.out.println(book.listOfMovies());
        String movieName = input.nextLine();
        List<Theatre> theatresConsitsMovieName = book.listOfTheatresForAGivenMovieName(movieName);
        for (Theatre theatre : theatresConsitsMovieName) {
            System.out.println(theatre.getScreenName());
        }
    }
}
