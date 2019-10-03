package model;

import org.junit.jupiter.api.Test;
import services.MoneyNotCorrectException;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ShowTest {
    @Test
    void expectGetTimingForTheShowToReturn() {
        Show show = new Show("11:00AM");
        assertEquals("11:00AM", show.getShowTime());
    }

    @Test
    void expectAvailableSeatsToReturn() {
        Show show = new Show("11:00AM");
        List<Integer> seats = new ArrayList<Integer>() {
            {
                for (int i = 1; i <= 10; i++) {
                    add(i);
                }
            }
        };
        assertEquals(seats, show.getAvailableSeats());
    }

    @Test
    void expectToBookASeat() throws MoneyNotCorrectException, SeatNotAvailableException {
        Show show = new Show("11:00AM");
        List<Integer> seats = new ArrayList<Integer>() {
            {
                for (int i = 1; i <= 10; i++) {
                    add(i);
                }
            }
        };
        show.bookTheSeat(9);
        seats.remove(Integer.valueOf(9));
        assertEquals(seats, show.getAvailableSeats());
    }


    @Test
    void expectExceptionWhenYouTryToBookASeatWhichIsNotAvailable() throws SeatNotAvailableException {

        Throwable exception = assertThrows(SeatNotAvailableException.class, () -> {
            Show show = new Show("11:00AM");

            show.bookTheSeat(11);
        });
        assertEquals("Seat is not available", exception.getMessage());
    }
}
