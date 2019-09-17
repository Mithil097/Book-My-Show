package data;

import model.Theatre;

import java.util.ArrayList;
import java.util.List;

public class Theatres {
    List<Theatre> theatres = new ArrayList<>();

    public String getTheatreNames() {
        String theatreNames = "";
        for (Theatre theatre : theatres) {
            theatreNames += theatre.getScreenName() + "\n";
        }
        return theatreNames;
    }

    public void setTheatres() {
        theatres.add(new Theatre("Asian", "Sahoo"));
        theatres.add(new Theatre("PVR", "DreamGirl"));
        theatres.add(new Theatre("CinePolis", "Avengers"));
        theatres.add(new Theatre("IMAX", "Sahoo"));
    }
}
