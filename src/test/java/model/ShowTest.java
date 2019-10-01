package model;

import org.junit.jupiter.api.Test;
import org.mockito.internal.util.reflection.FieldSetter;
import services.MoneyNotCorrectException;
import services.Payment;
import services.PaymentHandler;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Matchers.anyDouble;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ShowTest {
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
    void expectToBookASeat() throws MoneyNotCorrectException {
        Show show = new Show("11:00AM");
        List<Integer> seats = new ArrayList<Integer>() {
            {
                for (int i = 1; i <= 10; i++) {
                    add(i);
                }
            }
        };
        show.bookTheSeat(9, 100.00);
        seats.remove(Integer.valueOf(9));
        assertEquals(seats, show.getAvailableSeats());
    }

    @Test
    void expectToVerifyPaymentIsCalled() throws NoSuchFieldException, MoneyNotCorrectException {
        Show show = new Show("11:00AM");
        PaymentHandler mockPayment = mock(PaymentHandler.class);
        Field executorField = show.getClass().getDeclaredField("payment");
        FieldSetter fieldSetter = new FieldSetter(show, executorField);
        fieldSetter.set(mockPayment);
        show.bookTheSeat(9, anyDouble());
        verify(mockPayment).cash(anyDouble());
    }
}
