import com.multicode.travelbooking.domain.*;
import com.multicode.travelbooking.exceptions.*;
import com.multicode.travelbooking.service.BookingService;
import com.multicode.travelbooking.service.CreditCardPaymentService;
import com.multicode.travelbooking.service.PaymentService;
import com.multicode.travelbooking.service.PaypalPaymentService;

import java.math.*;
import java.time.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        BusTicket busTicket = null;
        try {
            busTicket = new BusTicket(1241L, "Amsterdam", "Rotterdam",
                    new BigDecimal("17.99"), LocalDateTime.of(2021,9,6,15,25),
                    LocalDateTime.of(2021,9,6,16,37), new String[] {"Holland Tours", "Netherlands Bus"});
        } catch (InvalidTravelDurationException e) {
            System.out.println("Oh dear - it looks like you will arrive before you depart!");
            return;
        }

        busTicket.setPrice( new BigDecimal("18.99"));

        PlaneTicket planeTicket = null;
        try {
            planeTicket = new PlaneTicket(1242L, "New York", "Dubai",
                    new BigDecimal("17.99"), LocalDateTime.of(2021,9,3,15,25),
                    LocalDateTime.of(2021,9,4,15,33), 2, 27, 0);
        } catch (InvalidTravelDurationException e) {
            System.out.println("Oh dear - it looks like you will arrive before you depart!");
            return;
        }

        planeTicket.setStopOvers(1);

        busTicket.reschedule();
        planeTicket.reschedule();

        // TravelTicket ticket = new TravelTicket();

        System.out.println(planeTicket);
        System.out.println(busTicket);

        PlaneTicket planeTicket2 = null;
        try {
            planeTicket2 = new PlaneTicket(1243L, "New York", "Dubai",
                    new BigDecimal("17.99"), LocalDateTime.of(2021,9,4,15,25),
                    LocalDateTime.of(2021,9,5,9,0), 2, 27, 1);
        } catch (InvalidTravelDurationException e) {
            System.out.println("Oh dear - it looks like you will arrive before you depart!");
            return;
        }

        System.out.println(planeTicket == planeTicket2);
        System.out.println(planeTicket.equals(planeTicket2));

//        ArrayList<TravelTicket> travelTickets = new ArrayList<>();
//        travelTickets.add(planeTicket);
//        travelTickets.add(busTicket);
//        for (TravelTicket ticket : travelTickets) {
//            System.out.println(ticket);
//        }
//
//        TravelTicket firstTicket = travelTickets.get(0);
//
//        if (firstTicket instanceof PlaneTicket) {
//            System.out.println("It's a train ticket");
//            int travelClass = ((PlaneTicket) firstTicket).getTravelClass();
//            System.out.println("travel class is " + travelClass);
//        }

        BookingService bookingService = new BookingService();
        bookingService.placeBooking(planeTicket);
        bookingService.placeBooking(busTicket);

        List<PlaneTicket> planeTickets = bookingService.getAllPlaneTickets();

        for(PlaneTicket t : planeTickets) {
            System.out.println(t);
        }

        PaymentService paypal = new PaypalPaymentService();
        PaymentService creditCard = new CreditCardPaymentService();

        System.out.println("Total cost if paying by paypal");
        System.out.println(bookingService.getTotalCost(paypal));

        System.out.println("Total cost if paying by credit card");
        System.out.println(bookingService.getTotalCost(creditCard));

        bookingService.sortBookings();;

        bookingService.printAllTickets();

    }
}
