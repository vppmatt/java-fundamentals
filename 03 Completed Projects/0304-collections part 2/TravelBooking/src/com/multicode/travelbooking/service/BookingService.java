package com.multicode.travelbooking.service;

import com.multicode.travelbooking.domain.PlaneTicket;
import com.multicode.travelbooking.domain.TravelTicket;

import java.math.BigDecimal;
import java.util.*;

public class BookingService {

    private Map<Long, TravelTicket> bookings;

    public BookingService() {
        this.bookings = new HashMap<>();
    }

    public void placeBooking(TravelTicket ticket) {
        bookings.put(ticket.getBookingRef(), ticket);
    }

    public void requestPayment(PaymentService paymentService) {
        paymentService.requestPayment();
    }

    public BigDecimal getTotalCost(PaymentService paymentOption) {
        for (TravelTicket travelTicket : bookings.values()) {
            paymentOption.addTicket(travelTicket);
        }
        return paymentOption.getTotalIncludingTaxesAndFees();
    }

    public ArrayList<PlaneTicket> getAllPlaneTickets() {
        ArrayList<PlaneTicket> results = new ArrayList<>();
        for (TravelTicket t : bookings.values()) {
            if (t instanceof PlaneTicket) {
                results.add((PlaneTicket)t);
            }
        }
        return results;
    }

    public void sortBookings() {
        //Collections.sort(bookings);
        System.out.println(bookings);
    }

    public void printAllTickets() {
        for(Long l : bookings.keySet()) {
            System.out.println(bookings.get(l));
        }
    }

}
