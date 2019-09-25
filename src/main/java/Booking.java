import data.MoviesHandler;
import data.TheatresHandler;
import model.Theatre;
import movies.MovieDoesNotExistException;

import java.util.List;
import java.util.logging.Logger;

public class Booking {
    //log with class names
    private static final Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
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
    public List<Theatre> listOfTheatresForAGivenMovieName(String movieName) throws MovieDoesNotExistException {
        if (moviesHandler.contains(movieName)) {
            //todo shouldn't be here
            return theatresHandler.getTheatresForMovie(movieName);
        }
        logger.severe("Raises exception for entering wrong movie name");
        throw new MovieDoesNotExistException("Movie is not Available");
    }
}
