package external.model;

public class PaypalPaymentRequest {
    String email;
    String phone;
    double amount;

    public PaypalPaymentRequest(String email, String phone, double amount) {
        this.email = email;
        this.phone = phone;
        this.amount = amount;
    }
}
