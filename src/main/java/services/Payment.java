package services;

public interface Payment {

    void cash(Double money);

    void debitCard(int cardNumber,Double money);
}
