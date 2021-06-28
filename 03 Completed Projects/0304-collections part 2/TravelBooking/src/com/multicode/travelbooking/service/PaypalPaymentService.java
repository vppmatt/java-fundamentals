package com.multicode.travelbooking.service;

import com.multicode.travelbooking.domain.TravelTicket;

import java.math.BigDecimal;

public class PaypalPaymentService implements PaymentService {


    private BigDecimal ticketTotal;
    private BigDecimal fixedFee;
    private BigDecimal discountThreshold;
    private BigDecimal discountRate;

    public PaypalPaymentService() {
        ticketTotal = BigDecimal.ZERO;
        fixedFee = new BigDecimal("1.56");
        discountThreshold = new BigDecimal("100");
        discountRate = new BigDecimal("0.995");
    }

    @Override
    public void addTicket(TravelTicket ticket) {
        ticketTotal = ticketTotal.add(ticket.getPrice());
    }

    @Override
    public BigDecimal getTotalIncludingTaxesAndFees() {
        if ((ticketTotal.subtract(discountThreshold)).doubleValue() >= 0) {
            BigDecimal discountedTotal = ticketTotal.multiply(discountRate);
            return (fixedFee.add(discountedTotal));
        }
        else {
            return ticketTotal.add(fixedFee);
        }
    }

    @Override
    public void requestPayment() {
        System.out.println("Payment was taken by Paypal");
    }
}
