package services;

public interface Payment {

    void cash(Double money) throws MoneyNotCorrectException;

    void debitCard(int cardNumber,Double money);
}
