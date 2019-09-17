import data.Movies;

public class Booking {
    private final Movies movies;

    public Booking(Movies movies) {
        this.movies = movies;
    }

    public void listOfMovies() {
        movies.setMovies();
    }
}
