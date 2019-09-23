package data;

import model.Theatre;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TheatresTest {
    @Test
    void expectEmptyStringToReturnWhenListOfTheatresIsEmptyInTheatres() {
        Theatres theatres = new Theatres();
        assertEquals("", theatres.getTheatreNames());
    }

    @Test
    void expectTheatreNamesToReturnWhenListOfTheatresIsAddedInTheatres() {
        Theatres theatres = new Theatres();
        theatres.setTheatres();
        assertEquals("Asian\nPVR\nCinePolis\nIMAX\n", theatres.getTheatreNames());
    }

    @Test
    void expectListOfTheatresWithMovieNameToReturnWhenGivenAMovieName() {
        Theatres theatres = new Theatres();
        theatres.setTheatres();
        List<Theatre> theatreNames = new ArrayList<>();
        theatreNames.add(new Theatre("Asian", "Sahoo"));
        theatreNames.add(new Theatre("IMAX", "Sahoo"));
        assertEquals(theatreNames, theatres.listOfTheatreForAGivenMovie("Sahoo"));
    }
}
