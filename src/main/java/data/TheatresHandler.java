package data;

import model.Theatre;
import model.Show;

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

    public List<String> getShowTimes() {
        Shows times = new Shows();
        List<Show> timing = times.getShowTimes();
        List<String> timings = new ArrayList<>();
        for (Show show : timing) {
            timings.add(show.getShowTime());
        }
        return timings;
    }
}
