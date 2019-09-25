package movies;

//todo rename
public class MovieDoesNotExistException extends Exception {
    public MovieDoesNotExistException(String message) {
        super(message);
    }
}