package movies;

//todo rename
public class MovieNotAvailableException extends Exception {
    public MovieNotAvailableException(String message) {
        super(message);
    }
}