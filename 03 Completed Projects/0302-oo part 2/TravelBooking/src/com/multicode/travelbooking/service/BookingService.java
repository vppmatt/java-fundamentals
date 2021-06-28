package com.multicode.travelbooking.service;

import com.multicode.travelbooking.domain.PlaneTicket;
import com.multicode.travelbooking.domain.TravelTicket;

import java.util.ArrayList;

public class BookingService {

    private ArrayList<TravelTicket> bookings;

    public BookingService() {
        this.bookings = new ArrayList<>();
    }

    public void placeBooking(TravelTicket ticket) {
        bookings.add(ticket);
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
