package com.multicode.travelbooking.domain;

import com.multicode.travelbooking.exceptions.*;

import java.math.*;
import java.time.*;
import java.util.*;

public class PlaneTicket extends TravelTicket {
    private int travelClass;
    private int seatNumber;
    private int stopOvers;

    public PlaneTicket(long bookingRef, String origin, String destination, BigDecimal price, LocalDateTime departureTime, LocalDateTime arrivalTime, int travelClass, int seatNumber, int stopOvers) throws InvalidTravelDurationException {
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

    @Override
    public String toString() {
        return "PlaneTicket{" +
                "bookingRef=" + super.getBookingRef() +
                ", origin='" + super.getOrigin() + '\'' +
                ", destination='" + super.getDestination() + '\'' +
                ", price=" + super.getPrice() +
                ", departureTime=" + super.getDepartureTime() +
                ", arrivalTime=" + super.getArrivalTime() +
                "travelClass=" + travelClass +
                ", seatNumber=" + seatNumber +
                ", stopOvers=" + stopOvers +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PlaneTicket that = (PlaneTicket) o;
        return travelClass == that.travelClass &&
                seatNumber == that.seatNumber &&
                stopOvers == that.stopOvers;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), travelClass, seatNumber, stopOvers);
    }
}
