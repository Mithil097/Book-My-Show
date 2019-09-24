import Exceptions.DoesNotExist;
import data.Movies;
import data.Theatres;
import model.Theatre;

import java.util.List;
import java.util.logging.Logger;

public class Booking {
    private static final Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    private final Movies movies;
    private final Theatres theatres;


    public Booking(Movies movies, Theatres theatres) {
        this.movies = movies;
        this.theatres = theatres;
    }

    public List<String> listOfMovies() {
        List<String> movieNames = movies.getMovieNames();
        return movieNames;
    }

    public List<Theatre> listOfTheatresForAGivenMovieName(String movieName) throws DoesNotExist {
        if (movies.contains(movieName)) {
            theatres.setTheatres();
            return theatres.listOfTheatreForAGivenMovie(movieName);
        }
        logger.severe("Raises exception for entering wrong movie name");
        throw new DoesNotExist("Movie is not Available");
    }
}
