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
        showTimings.add(mock(Show.class));
        assertEquals(showTimings, theatreA.getShowTimings());
    }

    @Test
    void expectShowToReturnWhenShowTimingIsCalledFromATheatre() throws NoSuchFieldException {
        List<Show> showTimings = new ArrayList<>();
        Theatre theatreA = new Theatre("Asian-cineplex", "Sahoo");
        Shows mockShows = mock(Shows.class);
        Show show1 = mock(Show.class);
        Show show2 = mock(Show.class);
        Field executorField = theatreA.getClass().getDeclaredField("shows");
        FieldSetter fieldSetter = new FieldSetter(theatreA, executorField);
        fieldSetter.set(mockShows);
        showTimings.add(show1);
        showTimings.add(show2);
        when(mockShows.getTimings()).thenReturn(showTimings);
        when(show1.getShowTime()).thenReturn("11:00PM");
        when(show2.getShowTime()).thenReturn("1:00PM");
        assertEquals(show2, theatreA.getShow("1:00PM"));
    }
}
