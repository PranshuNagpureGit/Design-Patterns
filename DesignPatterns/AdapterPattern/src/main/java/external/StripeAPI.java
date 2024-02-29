package external;

import external.enums.StripePaymentStatus;

public class StripeAPI {

    public String generateLink() {
        return "https://www.stripe.com/aUhDlk";
    }
    public String createPayment(String email, double amount) {
        System.out.println("Stripe payment");
        return "stripe-payment-id";
    }

    public StripePaymentStatus checkPaymentStatus(String paymentID) {
        return StripePaymentStatus.SUCCESS;
    }

}
