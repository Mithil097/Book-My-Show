package Theatres;

import model.Show;

import java.util.ArrayList;
import java.util.List;

public class Shows {
    List<Show> showTimings = new ArrayList<>();

    public Shows() {
        showTimings.add(new Show("10:00AM"));
        showTimings.add(new Show("1:00PM"));
        showTimings.add(new Show("5:00PM"));
        showTimings.add(new Show("10:00PM"));
    }

    public List<Show> getTimings() {
        return showTimings;
    }
}
