package services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PaymentHandlerTest {
    @Test
    void expectCash1ToReturnWhenPaymentWithCash() throws MoneyNotCorrectException {
        PaymentHandler payment=new PaymentHandler();
        assertEquals("cash1",payment.cash(100.00));
    }

    @Test
    void expectMoneyNotCorrectExceptionPayingWithCash() {
        Throwable exception = assertThrows(MoneyNotCorrectException.class, () -> {
            PaymentHandler payment=new PaymentHandler();
            payment.cash(10.00);
        });
        assertEquals("Money is not correct",exception.getMessage());
    }

    @Test
    void expectCash3IdWhen3paymentsAreDoneThroughCash() throws MoneyNotCorrectException {
        PaymentHandler payment=new PaymentHandler();
        payment.cash(100.00);
        payment.cash(100.00);
        assertEquals("cash3",payment.cash(100.00));
    }

    @Test
    void expectCard1IdToReturnWhenPaymentWithDebitCard() throws MoneyNotCorrectException {
        PaymentHandler payment=new PaymentHandler();
        assertEquals("card1",payment.debitCard(1234576,100.00));
    }

    @Test
    void expectMoneyNotCorrectExceptionWhilePayingWithDebitCard() {
        Throwable exception = assertThrows(MoneyNotCorrectException.class, () -> {
            PaymentHandler payment=new PaymentHandler();
            payment.debitCard(1111,10.00);
        });
        assertEquals("Money is not correct",exception.getMessage());
    }

    @Test
    void expectCard3IdWhen3paymentsAreDoneThroughDebitCard() throws MoneyNotCorrectException {
        PaymentHandler payment=new PaymentHandler();
        payment.debitCard(12345678,100.00);
        payment.debitCard(1234567,100.00);
        assertEquals("card3",payment.debitCard(123456,100.00));
    }
    @Test
    void expectCash3IdWhen2paymentsAreDoneThroughDebitCardAndLastCardThroughCash() throws MoneyNotCorrectException {
        PaymentHandler payment=new PaymentHandler();
        payment.debitCard(12345678,100.00);
        payment.debitCard(1234567,100.00);
        assertEquals("cash3",payment.cash(100.00));
    }
}
