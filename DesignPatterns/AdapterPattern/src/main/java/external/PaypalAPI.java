package external;

import external.enums.PaypalPaymentStatus;
import external.model.PaypalPaymentRequest;

public class PaypalAPI {

    public String makeLink() {
        return "https://www.paypal.com/aUhDlk";
    }

    public String processPayment(PaypalPaymentRequest payUPaymentRequest) {
        System.out.println("Paypal payment");
        return "paypal-payment-id";
    }

    public PaypalPaymentStatus getPaymentStatus(String paymentID) {
        return PaypalPaymentStatus.OK;
    }

}
