package com.payment.payment.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stripeWebhook")
public class StripeWebhookController {

        @PostMapping
        public void stripeWebhook() {
            System.out.println("received webhook url");
        }
}
