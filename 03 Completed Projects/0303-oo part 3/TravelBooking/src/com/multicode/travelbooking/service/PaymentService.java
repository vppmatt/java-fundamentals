package com.multicode.travelbooking.service;

import com.multicode.travelbooking.domain.TravelTicket;

import java.math.BigDecimal;

public interface PaymentService {

    public void addTicket(TravelTicket ticket);
    public BigDecimal getTotalIncludingTaxesAndFees();
    public void requestPayment();

}
