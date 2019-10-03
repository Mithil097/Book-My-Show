package services;

public interface Payment {

    String cash(Double money) throws MoneyNotCorrectException;

    String debitCard(int cardNumber, Double money) throws MoneyNotCorrectException;
}
