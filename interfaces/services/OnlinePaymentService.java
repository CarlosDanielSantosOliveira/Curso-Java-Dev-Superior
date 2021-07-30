package interfaces.services;

public interface OnlinePaymentService {

    //Na interface nós apenas declaramos as assinaturas dos métodos, para depois implementar.

    Double paymentFee(Double amount);
    double interest(double amount, int months);

}
