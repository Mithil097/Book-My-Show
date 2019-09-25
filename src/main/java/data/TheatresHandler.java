package data;

import model.Theatre;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class TheatresHandler {
    List<Theatre> theatres;

    public TheatresHandler(Parser parser) throws IOException {
        this.theatres = parser.getTheatres();
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
