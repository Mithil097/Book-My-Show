package services;

public class PaymentHandler implements Payment{
    @Override
    public void cash(Double money) throws MoneyNotCorrectException {
        if (money!=100.00){
            throw new MoneyNotCorrectException("Money is notcorrect");
        }
    }

    @Override
    public void debitCard(int cardNumber, Double money) {

    }
}
