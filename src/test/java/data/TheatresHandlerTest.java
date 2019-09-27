package data;

import model.Show;
import model.Theatre;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


class TheatresHandlerTest {
    @Test
    void expectEmptyStringToReturnWhenListOfTheatresIsEmptyInTheatres() throws IOException, ParseException {
        List<Theatre> theatres = new ArrayList<>();
        TheatresHandler theatresHandler = new TheatresHandler(theatres);
        assertEquals("", theatresHandler.getAllTheatreNames());
    }

    @Test
    void expectStringWithAllTheatreNamesToReturnWhenListOfTheatresIsAddedInTheatres() throws IOException, ParseException {
        List<Theatre> theatres = new ArrayList<>();
        theatres.add(new Theatre("Asian", "Sahoo"));
        theatres.add(new Theatre("PVR", "Sahoo"));
        TheatresHandler theatresHandler = new TheatresHandler(theatres);
        assertEquals("Asian\nPVR\n", theatresHandler.getAllTheatreNames());
    }

    @Test
    void expectListOfTheatresForAGivenMovieNameToReturnWhenCalledListOFTheatresForAGivenMovieName() throws IOException, ParseException {
        List<Theatre> theatres = new ArrayList<>();
        theatres.add(new Theatre("Asian", "Sahoo"));
        theatres.add(new Theatre("IMAX", "Sahoo"));
        theatres.add(new Theatre("PVR", "Avengers"));
        theatres.add(new Theatre("INOX", "Maze Runner"));
        TheatresHandler theatresHandler = new TheatresHandler(theatres);
        List<String> theatresWithTheMovie = new ArrayList<>();
        theatresWithTheMovie.add("Asian");
        theatresWithTheMovie.add("IMAX");
        assertEquals(theatresWithTheMovie, theatresHandler.getTheatresForMovie("Sahoo"));
    }

    @Test
    void expectListOfTimingsToReturnWhenGetShowTimesCalled() {
        List<Show> timings = new ArrayList<>();
        List<Theatre> theatres = new ArrayList<>();
        theatres.add(new Theatre("Asian", "Sahoo"));
        TheatresHandler theatresHandler = new TheatresHandler(theatres);
        List<String> times = new ArrayList<>();
        times.add("10:00AM");
        times.add("1:00PM");
        times.add("5:00PM");
        times.add("10:00PM");
        assertEquals(times, theatresHandler.getShowTimes());
    }
}
