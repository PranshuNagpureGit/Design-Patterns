package dto;

public class PaymentRequest {
    String name;
    String email;
    String phone;
    double amount;

    private PaymentRequest(){};
    private PaymentRequest(PaymentRequest copy) {
        this.name = copy.name;
        this.email = copy.email;
        this.phone = copy.phone;
        this.amount = copy.amount;
    }
    public static PaymentRequestBuilder builder() {
        return new PaymentRequestBuilder();
    }
    public static class PaymentRequestBuilder {
        private PaymentRequest paymentRequestDTO;

        public PaymentRequestBuilder() {
            paymentRequestDTO = new PaymentRequest();
        }
        public PaymentRequestBuilder name(String name) {
            paymentRequestDTO.name = name;
            return this;
        }
        public PaymentRequestBuilder email(String email) {
            paymentRequestDTO.email = email;
            return this;
        }
        public PaymentRequestBuilder phone(String phone) {
            paymentRequestDTO.phone = phone;
            return this;
        }

        public PaymentRequestBuilder amount(double amount) {
            paymentRequestDTO.amount = amount;
            return this;
        }
        public PaymentRequest build(){
            return new PaymentRequest(paymentRequestDTO);
        }
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public double getAmount() {
        return amount;
    }
}
