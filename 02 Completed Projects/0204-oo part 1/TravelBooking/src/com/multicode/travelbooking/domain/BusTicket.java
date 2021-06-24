package com.multicode.travelbooking.domain;

import java.math.*;
import java.time.*;

public class BusTicket extends TravelTicket {
    private String[] permittedProviders;

    public BusTicket(long bookingRef, String origin, String destination, BigDecimal price, LocalDateTime departureTime, LocalDateTime arrivalTime, String[] permittedProviders) {
        super(bookingRef, origin, destination, price, departureTime, arrivalTime);
        this.permittedProviders = permittedProviders;
    }

    public String[] getPermittedProviders() {
        return permittedProviders;
    }

    public void setPermittedProviders(String[] permittedProviders) {
        this.permittedProviders = permittedProviders;
    }
}
