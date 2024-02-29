package adapter;

import dto.PaymentRequest;
import external.model.PaypalPaymentRequest;
import model.PaymentStatus;
import external.PaypalAPI;
import external.enums.PaypalPaymentStatus;

public class PaypalPaymentAdapter implements PaymentProvider {

    PaypalAPI paypalAPI = new PaypalAPI();

    @Override
    public String pay(PaymentRequest paymentRequest) {
        return paypalAPI.processPayment(toRequest(paymentRequest));
    }

    @Override
    public String link() {
        return paypalAPI.makeLink();
    }

    @Override
    public PaymentStatus status(String paymentID) {
        return toStatus(paypalAPI.getPaymentStatus(paymentID));
    }

    private PaypalPaymentRequest toRequest(PaymentRequest paymentRequest) {
        return new PaypalPaymentRequest(paymentRequest.getEmail(), paymentRequest.getPhone(), paymentRequest.getAmount());
    }

    private PaymentStatus toStatus(PaypalPaymentStatus paymentStatus) {
        switch (paymentStatus) {
            case OK:
                return PaymentStatus.COMPLETED;
            case ERROR:
                return PaymentStatus.FAILED;
        }
        throw new RuntimeException("Incompatible paypal payment status");
    }


}
