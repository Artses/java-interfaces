package Service;

public interface OnlinePaymentService{
    double paymentFee(double amount);
    double interest(double amount, int months);
}
