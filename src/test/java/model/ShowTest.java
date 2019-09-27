package model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShowTest {
    @Test
    void expectGetTimingForTheShowToReturn() {
        Show show = new Show("11:00AM");
        assertEquals("11:00AM", show.getShowTime());
    }
    @Test
    void expectAllSeatsToReturn() {
        Show show = new Show("11:00AM");
        List<Integer> seats=new ArrayList<Integer>(){
            {
                for (int i=1;i<=10;i++){
                    add(i);
                }
            }
        };
        assertEquals(seats,show.getAllSeats());
    }
}
