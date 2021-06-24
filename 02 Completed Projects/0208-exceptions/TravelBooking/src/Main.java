import com.multicode.travelbooking.domain.*;
import com.multicode.travelbooking.exceptions.*;

import java.math.*;
import java.time.*;

public class Main {

    public static void main(String[] args) {
        BusTicket busTicket = null;
        try {
            busTicket = new BusTicket(1241L, "Amsterdam", "Rotterdam",
                    new BigDecimal("17.99"), LocalDateTime.of(2021,9,4,15,25),
                    LocalDateTime.of(2021,9,4,16,37), new String[] {"Holland Tours", "Netherlands Bus"});
        } catch (InvalidTravelDurationException e) {
            System.out.println("Oh dear - it looks like you will arrive before you depart!");
            return;
        }

        busTicket.setPrice( new BigDecimal("18.99"));

        PlaneTicket planeTicket = null;
        try {
            planeTicket = new PlaneTicket(1241L, "New York", "Dubai",
                    new BigDecimal("17.99"), LocalDateTime.of(2021,9,4,15,25),
                    LocalDateTime.of(2021,9,4,15,23), 2, 27, 0);
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
            planeTicket2 = new PlaneTicket(1241L, "New York", "Dubai",
                    new BigDecimal("17.99"), LocalDateTime.of(2021,9,4,15,25),
                    LocalDateTime.of(2021,9,5,9,0), 2, 27, 1);
        } catch (InvalidTravelDurationException e) {
            System.out.println("Oh dear - it looks like you will arrive before you depart!");
            return;
        }

        System.out.println(planeTicket == planeTicket2);
        System.out.println(planeTicket.equals(planeTicket2));
    }
}
