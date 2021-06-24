package com.multicode.travelbooking.domain;

import java.math.*;
import java.time.*;

public class PlaneTicket extends TravelTicket {
    private int travelClass;
    private int seatNumber;
    private int stopOvers;

    public PlaneTicket(long bookingRef, String origin, String destination, BigDecimal price, LocalDateTime departureTime, LocalDateTime arrivalTime, int travelClass, int seatNumber, int stopOvers) {
        super(bookingRef, origin, destination, price, departureTime, arrivalTime);
        this.travelClass = travelClass;
        this.seatNumber = seatNumber;
        this.stopOvers = stopOvers;
    }

    public int getTravelClass() {
        return travelClass;
    }

    public void setTravelClass(int travelClass) {
        this.travelClass = travelClass;
    }

    public int getStopOvers() {
        return stopOvers;
    }

    public void setStopOvers(int stopOvers) {
        this.stopOvers = stopOvers;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void upgrade() {

    }

    public void addStopOver() {

    }

    @Override
    public void reschedule() {
        super.reschedule();
        System.out.println("Rescheduling a plane ticket.");
    }
}
