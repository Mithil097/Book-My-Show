package model;

import Theatres.Shows;
import org.junit.jupiter.api.Test;
import org.mockito.internal.util.reflection.FieldSetter;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

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
    void expectAllShowTimesToReturnWhenATheatreIsCreated() throws NoSuchFieldException {
        List<Show> showTimings = new ArrayList<>();
        Theatre theatreA = new Theatre("Asian-cineplex", "Sahoo");
        Shows mockShows = mock(Shows.class);
        Field executorField = theatreA.getClass().getDeclaredField("shows");
        FieldSetter fieldSetter = new FieldSetter(theatreA, executorField);
        fieldSetter.set(mockShows);
        when(mockShows.getTimings()).thenReturn(showTimings);
        showTimings.add(new Show("10:00AM"));
        showTimings.add(new Show("1:00PM"));
        showTimings.add(new Show("5:00PM"));
        assertEquals(showTimings, theatreA.getShowTimings());
    }
}
