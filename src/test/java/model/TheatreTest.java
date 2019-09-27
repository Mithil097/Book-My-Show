package model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TheatreTest {
    @Test
    void expectSahooToReturnWhenTheatreCallsGetMovieInTheatre() {
        Theatre theatre = new Theatre("Asian-cineplex", "Sahoo");
        assertEquals("Sahoo", theatre.getMovieInTheatre());
    }

    @Test
    void expectAsianCineplexToReturnWhenTheatreCallsGetScreenName() {
        Theatre theatre = new Theatre("Asian-cineplex", "Sahoo");
        assertEquals("Asian-cineplex", theatre.getTheatreName());
    }

    @Test
    void expectTheatreAEqualsToTheatreBWhenScreenNameAndMovieNameAreSame() {
        Theatre theatreA = new Theatre("Asian-cineplex", "Sahoo");
        Theatre theatreB = new Theatre("Asian-cineplex", "Sahoo");
        assertEquals(theatreA, theatreB);
    }

    @Test
    void expect100SeatsInitiallyWhenATheatreIsCreated() {
        Theatre theatreA = new Theatre("Asian-cineplex", "Sahoo");
        assertEquals(100, theatreA.getNumberOfSeats());
    }

    @Test
    void expectAllShiowTimesToReturnWhenATheatreIsCreated() {
        List<Show> timings = new ArrayList<>();
        Theatre theatreA = new Theatre("Asian-cineplex", "Sahoo");
        timings.add(new Show("10:00AM"));
        timings.add(new Show("1:00PM"));
        timings.add(new Show("5:00PM"));
        timings.add(new Show("10:00PM"));
        assertEquals(timings, theatreA.getTimings());
    }
}
