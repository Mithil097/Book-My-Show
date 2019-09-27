package model;

import movies.Status;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static movies.Language.ENGLISH;
import static movies.Language.TELUGU;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MovieTest {
    @Test
    void expectTheDetailsOfTheMovieAvengers() {
        Movie avengers = new Movie("Avengers", ENGLISH, new Date(2018 - 12 - 1), Status.AVAILABLE);
        assertEquals("Avengers\tENGLISH\tThu Jan 01 05:30:02 IST 1970", avengers.getDetails());
    }

    @Test
    void expectMovieNameOfTheMovieAvengers() {
        Movie avengers = new Movie("Avengers", TELUGU, new Date(2018 - 12 - 1), Status.AVAILABLE);
        assertEquals("Avengers", avengers.getMovieName());
    }

    @Test
    void expectMovieAEqualsToMovieBWhenAllAttributesAreEqual() {
        Movie movieA = new Movie("Avengers", TELUGU, new Date(2018 - 12 - 1), Status.AVAILABLE);
        Movie movieB = new Movie("Avengers", TELUGU, new Date(2018 - 12 - 1), Status.AVAILABLE);
        assertEquals(movieA, movieB);
    }

    @Test
    void expectTrueWhenMovieAStatusIsAvailable() {
        Movie movieA = new Movie("Avengers", TELUGU, new Date(2018 - 12 - 1), Status.AVAILABLE);
        assertTrue(movieA.isAvailable());
    }
}
