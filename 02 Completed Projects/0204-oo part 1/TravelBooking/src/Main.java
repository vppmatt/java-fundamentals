import com.multicode.travelbooking.domain.*;

import java.math.*;
import java.time.*;

public class Main {

    public static void main(String[] args) {
        BusTicket busTicket = new BusTicket(1241L, "Amsterdam", "Rotterdam",
                new BigDecimal("17.99"), LocalDateTime.of(2021,9,4,15,25),
                LocalDateTime.of(2021,9,4,16,37), new String[] {"Holland Tours", "Netherlands Bus"});

                busTicket.setPrice( new BigDecimal("18.99"));

        PlaneTicket planeTicket = new PlaneTicket(1241L, "New York", "Dubai",
                new BigDecimal("17.99"), LocalDateTime.of(2021,9,4,15,25),
                LocalDateTime.of(2021,9,5,9,0), 2, 27, 0);

        planeTicket.setStopOvers(1);

        busTicket.reschedule();
        planeTicket.reschedule();

        // TravelTicket ticket = new TravelTicket();
    }
}
