package data;

import model.Show;
import model.Theatre;

import java.util.ArrayList;
import java.util.List;

public class TheatresHandler {


    private final List<Theatre> theatres;

    public TheatresHandler(List<Theatre> theatres) {
        this.theatres = theatres;
    }

    public List<String> getTheatresForMovie(String movieName) {
        List<String> theatreNames = new ArrayList<>();
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


    public boolean contains(String theatreName) {
        for (Theatre theatre : theatres) {
            if (theatre.getTheatreName().equals(theatreName)) {
                return true;
            }
        }
        return false;
    }

    public List<String> getTimingsForTheTheatre(String theatreName) {
        List<Show> timings = null;
        List<String> timing = new ArrayList<>();
        for (Theatre theatre : theatres) {
            if (theatreName.equals(theatre.getTheatreName())) {
                timings = theatre.getShowTimings();
            }
        }
        for (Show show : timings) {
            timing.add(show.getShowTime());
        }
        return timing;
    }

    public Theatre getTheatre(String theatreName) {
        Theatre name = null;
        for (Theatre theatre:theatres){
            if (theatre.getTheatreName().equals(theatreName)) {
                name=theatre;
            }
        }
        return name;
    }
}
