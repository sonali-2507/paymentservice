package com.payment.payment.services;

import com.razorpay.RazorpayException;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    private PaymentGatewayChooserStrategy paymentGatewayChooserStrategy;

    public PaymentService(PaymentGatewayChooserStrategy paymentGatewayChooserStrategy) {
        this.paymentGatewayChooserStrategy = paymentGatewayChooserStrategy;
    }
    //make a call to order service to get the order detailsn and then call the payment gateway to initiate the payment
    public String initiatePayment() throws RazorpayException {
        return paymentGatewayChooserStrategy
                .getBestPaymentGateway()
                .generateLink();
    }


}
