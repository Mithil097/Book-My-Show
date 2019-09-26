package data;

import model.Movie;
import model.Theatre;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class TheatresHandler {


    private final List<Theatre> theatres;

    public TheatresHandler(List<Theatre> theatres) {
        this.theatres=theatres;
    }
//todo take input from files


    //todo getTheatres, getTheatresForMovie
    public List<String> getTheatresForMovie(String movieName) {
        List<String > theatreNames = new ArrayList<>();
        for (Theatre theatre : theatres) {
            if (movieName.equals(theatre.getMovieInTheatre())) {
                theatreNames.add(theatre.getTheatreName());
            }
        }
        return theatreNames;
    }

    public String getAllTheatreNames() {
        String theatreNames = "";
        for (Theatre theatre : theatres) {
            theatreNames += theatre.getTheatreName() + "\n";
        }
        return theatreNames;
    }
}
