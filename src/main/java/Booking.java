import Theatres.TheatreNotAvailableException;
import data.MoviesHandler;
import data.TheatresHandler;
import model.Show;
import model.Theatre;
import movies.MovieNotAvailableException;

import java.util.List;
import java.util.logging.Logger;

public class Booking {

    private static final Logger logger = Logger.getLogger(Booking.class.getName());
    private final MoviesHandler moviesHandler;
    private final TheatresHandler theatresHandler;


    public Booking(MoviesHandler moviesHandler, TheatresHandler theatresHandler) {
        this.moviesHandler = moviesHandler;
        this.theatresHandler = theatresHandler;
    }

    public List<String> getAvailableMovies() {
        List<String> movieNames = moviesHandler.getMovieNames();
        return movieNames;
    }

    public List<String> getTheatresForAMovie(String movieName) throws MovieNotAvailableException {
        if (moviesHandler.contains(movieName)) {
            return theatresHandler.getTheatresForMovie(movieName);
        }
        logger.severe("Movie Not Available ");
        throw new MovieNotAvailableException("Movie not Available");
    }

    public List<String> getTimingsForTheTheatre(String theatreName) throws TheatreNotAvailableException {
        if (theatresHandler.contains(theatreName)){
            return theatresHandler.getTimingsForTheTheatre(theatreName);
        }
        throw new TheatreNotAvailableException("Theatre not Available");
    }

    public Show getShow(String theatreName, String showTime) {
        Theatre theatre=theatresHandler.getTheatre(theatreName);
        Show show=theatre.getShow(showTime);
        return show;
    }
}
