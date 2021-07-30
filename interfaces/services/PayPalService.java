package interfaces.services;

public class PayPalService implements OnlinePaymentService {

    private static final double PAYMENT_FEE = 0.02; //Taxa de juros de 2%.
    private static final double MONTHLY_INTEREST = 0.01; //Juro mensal.

    @Override
    public Double paymentFee(Double amount) {
        return amount * PAYMENT_FEE;
    }

    @Override
    public double interest(double amount, int months) {
        return amount * months * MONTHLY_INTEREST;
    }

}
