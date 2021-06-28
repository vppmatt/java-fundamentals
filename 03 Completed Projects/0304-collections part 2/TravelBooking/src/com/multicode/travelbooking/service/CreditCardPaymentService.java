package com.multicode.travelbooking.service;

import com.multicode.travelbooking.domain.PlaneTicket;
import com.multicode.travelbooking.domain.TravelTicket;

import java.math.BigDecimal;
import java.util.ArrayList;

public class CreditCardPaymentService implements PaymentService {

   private BigDecimal ticketTotal;
   private BigDecimal feeRate;

   public CreditCardPaymentService() {
       ticketTotal = BigDecimal.ZERO;
       feeRate = new BigDecimal("1.03");
   }

    @Override
    public void addTicket(TravelTicket ticket) {
        ticketTotal = ticketTotal.add(ticket.getPrice());
    }

    @Override
    public BigDecimal getTotalIncludingTaxesAndFees() {
        return ticketTotal.multiply(feeRate);
    }

    @Override
    public void requestPayment() {
        System.out.println("Payment was taken by credit card");
    }
}
