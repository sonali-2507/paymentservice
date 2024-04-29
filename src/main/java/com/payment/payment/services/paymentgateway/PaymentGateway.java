package com.payment.payment.services.paymentgateway;

import com.razorpay.RazorpayException;

public interface PaymentGateway {
    public String generateLink() throws RazorpayException;
}
