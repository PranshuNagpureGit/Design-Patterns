package adapter;

import dto.PaymentRequest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PaymentProviderTest {

    PaymentProvider paymentProvider;

    @Before
    public void setUp() {
        paymentProvider = new StripePaymentAdapter();
    }

    @Test
    public void testLink() {
        Assert.assertEquals("https://www.stripe.com/aUhDlk", paymentProvider.link());
    }

    @Test
    public void testPay() {
        String actualPaymentID = paymentProvider.pay(PaymentRequest.builder()
                .amount(100)
                .email("pn@gmail.com")
                .build());

        Assert.assertEquals("stripe-payment-id", actualPaymentID);

    }

}