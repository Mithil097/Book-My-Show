package data;

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
        Parser mockParser=mock(Parser.class);
        TheatresHandler theatresHandler = new TheatresHandler(mockParser);
        assertEquals("", theatresHandler.getTheatreNames());
    }

    @Test
    void expectStringWithAllTheatreNamesToReturnWhenListOfTheatresIsAddedInTheatres() throws IOException, ParseException {
        Parser mockParser=mock(Parser.class);
        List<Theatre> theatres=new ArrayList<>();
        theatres.add(new Theatre("Asian","Sahoo"));
        theatres.add(new Theatre("PVR","Sahoo"));
        when(mockParser.getTheatres()).thenReturn(theatres);
        TheatresHandler theatresHandler = new TheatresHandler(mockParser);
        assertEquals("Asian\nPVR\n", theatresHandler.getTheatreNames());
    }

    @Test
    void expectListOfTheatresForAGivenMovieNameToReturnWhenCalledListOFTheatresForAGivenMovieName() throws IOException, ParseException {
        Parser mockParser=mock(Parser.class);
        List<Theatre> theatres = new ArrayList<>();
        theatres.add(new Theatre("Asian", "Sahoo"));
        theatres.add(new Theatre("IMAX", "Sahoo"));
        theatres.add(new Theatre("PVR", "Avengers"));
        theatres.add(new Theatre("INOX", "Maze Runner"));
        when(mockParser.getTheatres()).thenReturn(theatres);
        TheatresHandler theatresHandler = new TheatresHandler(mockParser);
        List<String> theatresWithTheMovie = new ArrayList<>();
        theatresWithTheMovie.add("Asian");
        theatresWithTheMovie.add("IMAX");
        assertEquals(theatresWithTheMovie, theatresHandler.getTheatresForMovie("Sahoo"));
    }
}
