package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TheatreTest {
    @Test
    void expectSahooToReturnWhenTheatreCallsGetMovieInTheatre() {
        Theatre theatre = new Theatre("Asian-cineplex", "Sahoo",111);
        assertEquals("Sahoo", theatre.getMovieInTheatre());
    }

    @Test
    void expectAsianCineplexToReturnWhenTheatreCallsGetScreenName() {
        Theatre theatre = new Theatre("Asian-cineplex", "Sahoo",112);
        assertEquals("Asian-cineplex", theatre.getTheatreName());
    }

    @Test
    void expectTheatreAEqualsToTheatreBWhenScreenNameAndMovieNameAreSame() {
        Theatre theatreA = new Theatre("Asian-cineplex", "Sahoo",112);
        Theatre theatreB = new Theatre("Asian-cineplex", "Sahoo",112);
        assertEquals(theatreA, theatreB);
    }
}
