package adapter;

import dto.PaymentRequest;
import model.PaymentStatus;

/**
 * Adapter to manage incompatible interfaces
 * */
public interface PaymentProvider {

    String link();
    String pay(PaymentRequest request);
    PaymentStatus status(String paymentID);
}
