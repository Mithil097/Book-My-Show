package data;

import model.Theatre;

import java.util.ArrayList;
import java.util.List;

public class Theatres {
    List<Theatre> theatres = new ArrayList<>();

    public void setTheatres() {
        theatres.add(new Theatre("Asian", "Sahoo",123));
        theatres.add(new Theatre("PVR", "DreamGirl",111));
        theatres.add(new Theatre("CinePolis", "Avengers",112));
        theatres.add(new Theatre("IMAX", "Sahoo",1234));
    }

    public List<Theatre> listOfTheatreForAGivenMovie(String movieName) {
        List<Theatre> theatreNames = new ArrayList<>();
        for (Theatre theatre : theatres) {
            if (movieName.equals(theatre.getMovieInTheatre())) {
                theatreNames.add(theatre);
            }
        }
        return theatreNames;
    }

    public String getTheatreNames() {
        String theatreNames = "";
        for (Theatre theatre : theatres) {
            theatreNames += theatre.getTheatreName() + "\n";
        }
        return theatreNames;
    }
}
