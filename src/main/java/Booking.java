import data.MoviesHandler;
import data.TheatresHandler;
import movies.MovieNotAvailableException;

import java.util.List;
import java.util.logging.Logger;

public class Booking {
    //log with class names
    private static final Logger logger = Logger.getLogger(Booking.class.getName());
    private final MoviesHandler moviesHandler;
    private final TheatresHandler theatresHandler;


    public Booking(MoviesHandler moviesHandler, TheatresHandler theatresHandler) {
        this.moviesHandler = moviesHandler;
        this.theatresHandler = theatresHandler;
    }

    public List<String> listOfMovies() {
        List<String> movieNames = moviesHandler.getMovieNames();
        return movieNames;
    }

    //todo rename
    public List<String> getTheatresForAMovie(String movieName) throws MovieNotAvailableException {
        if (moviesHandler.contains(movieName)) {
            //todo shouldn't be here
            return theatresHandler.getTheatresForMovie(movieName);
        }
        logger.severe("Raises exception for entering wrong movie name");
        throw new MovieNotAvailableException("Movie is not Available");
    }
}
