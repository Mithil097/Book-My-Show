package services;

public class PaymentHandler implements Payment {

    private int id = 0;

    @Override
    public String cash(Double money) throws MoneyNotCorrectException {
        if (money != 100.00) {
            throw new MoneyNotCorrectException("Money is not correct");
        }
        id += 1;
        return "cash" + id;
    }

    @Override
    public String debitCard(int cardNumber, Double money) throws MoneyNotCorrectException {
        if (money != 100.00) {
            throw new MoneyNotCorrectException("Money is not correct");
        }
        id += 1;
        return "card" + id;
    }
}
