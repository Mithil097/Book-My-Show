package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShowTest {
    @Test
    void expectGetTimingForTheShowToReturn(){
        Show show=new Show("11:00AM");
        assertEquals("11:00AM",show.getShowTime());
    }
}
