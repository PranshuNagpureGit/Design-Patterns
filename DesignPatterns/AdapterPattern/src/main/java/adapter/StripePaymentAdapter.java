package adapter;

import dto.PaymentRequest;
import model.PaymentStatus;
import external.StripeAPI;
import external.enums.StripePaymentStatus;

public class StripePaymentAdapter implements PaymentProvider {

    StripeAPI stripeAPI = new StripeAPI();

    @Override
    public String link() {
        return stripeAPI.generateLink();
    }

    @Override
    public String pay(PaymentRequest paymentRequest) {
        return stripeAPI.createPayment(paymentRequest.getEmail(), paymentRequest.getAmount());
    }

    @Override
    public PaymentStatus status(String paymentID) {
        return toStatus(stripeAPI.checkPaymentStatus(paymentID));
    }

    private PaymentStatus toStatus(StripePaymentStatus paymentStatus) {
        switch (paymentStatus) {
            case SUCCESS:
                return PaymentStatus.COMPLETED;
            case FAILURE:
                return PaymentStatus.FAILED;
        }
        throw new RuntimeException("Incompatible stripe payment status");

    }
}
