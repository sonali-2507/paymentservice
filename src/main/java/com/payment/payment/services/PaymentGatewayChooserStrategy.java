package com.payment.payment.services;


import com.payment.payment.services.paymentgateway.PaymentGateway;
import com.payment.payment.services.paymentgateway.RazorpayPaymentGateway;
import com.payment.payment.services.paymentgateway.StripePaymentGateway;
import org.springframework.stereotype.Service;

@Service
public class PaymentGatewayChooserStrategy {
    private RazorpayPaymentGateway razorpayPaymentGateway;
    private StripePaymentGateway stripePaymentGateway;

    public PaymentGatewayChooserStrategy(RazorpayPaymentGateway razorpayPaymentGateway,
                                         StripePaymentGateway stripePaymentGateway) {
        this.razorpayPaymentGateway = razorpayPaymentGateway;
        this.stripePaymentGateway = stripePaymentGateway;
    }

    public PaymentGateway getBestPaymentGateway() {
        // Some logic to chooese the best payment gateway
//        return razorpayPaymentGateway;
        return stripePaymentGateway;
    }
}
