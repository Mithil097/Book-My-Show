package model;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MovieTest {
    @Test
    void expectTheDetailsOfTheMovieAvengers() {
        Movie avengers = new Movie("Avengers", "English", new Date(2018, 12, 1));
        assertEquals("Avengers\tEnglish\tWed Jan 01 00:00:00 IST 3919", avengers.getDetails());
    }

    @Test
    void expectMovieNameOfTheMovieAvengers() {
        Movie avengers = new Movie("Avengers", "English", new Date(2018, 12, 1));
        assertEquals("Avengers", avengers.getMovieName());
    }
}
