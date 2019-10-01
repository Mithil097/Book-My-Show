package services;

public class MoneyNotCorrectException extends Throwable {
    public MoneyNotCorrectException(String message) {
        super(message);
    }
}
