package com.multicode.travelbooking.domain;

import java.math.*;
import java.time.*;

public class TrainTicket extends TravelTicket {
    private int travelClass;
    private int carriageNumber;
    private int seatNumber;

    public TrainTicket(long bookingRef, String origin, String destination, BigDecimal price, LocalDateTime departureTime, LocalDateTime arrivalTime, int travelClass, int carriageNumber, int seatNumber) {
        super(bookingRef, origin, destination, price, departureTime, arrivalTime);
        this.travelClass = travelClass;
        this.carriageNumber = carriageNumber;
        this.seatNumber = seatNumber;
    }

    public int getTravelClass() {
        return travelClass;
    }

    public void setTravelClass(int travelClass) {
        this.travelClass = travelClass;
    }

    public int getCarriageNumber() {
        return carriageNumber;
    }

    public void setCarriageNumber(int carriageNumber) {
        this.carriageNumber = carriageNumber;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void upgrade() {

    }

    @Override
    public void reschedule() {
        System.out.println("Rescheduling a train ticket.");
    }
}
