package model;

import org.junit.jupiter.api.Test;

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
        assertEquals("Asian-cineplex", theatre.getScreenName());
    }
}
