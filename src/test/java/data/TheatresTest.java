package data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TheatresTest {
    @Test
    void expectEmptyStringToReturnWhenListOfTheatresIsEmptyInTheatres(){
        Theatres theatres=new Theatres();
        assertEquals("",theatres.getTheatreNames());
    }

    @Test
    void expectTheatreNamesToReturnWhenListOfTheatresIsAddedInTheatres(){
        Theatres theatres=new Theatres();
        theatres.setTheatres();
        assertEquals("Asian\nPVR\nCinePolis\nIMAX\n",theatres.getTheatreNames());
    }
}
