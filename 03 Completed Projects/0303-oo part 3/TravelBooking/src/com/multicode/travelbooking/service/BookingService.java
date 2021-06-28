package com.multicode.travelbooking.service;

import com.multicode.travelbooking.domain.PlaneTicket;
import com.multicode.travelbooking.domain.TravelTicket;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BookingService {

    private List<TravelTicket> bookings;

    public BookingService() {
        this.bookings = new ArrayList<>();
    }

    public void placeBooking(TravelTicket ticket) {
        bookings.add(ticket);
    }

    public void requestPayment(PaymentService paymentService) {
        paymentService.requestPayment();
    }

    public BigDecimal getTotalCost(PaymentService paymentOption) {
        for (TravelTicket travelTicket : bookings) {
            paymentOption.addTicket(travelTicket);
        }
        return paymentOption.getTotalIncludingTaxesAndFees();
    }

    public ArrayList<PlaneTicket> getAllPlaneTickets() {
        ArrayList<PlaneTicket> results = new ArrayList<>();
        for (TravelTicket t : bookings) {
            if (t instanceof PlaneTicket) {
                results.add((PlaneTicket)t);
            }
        }
        return results;
    }

}
