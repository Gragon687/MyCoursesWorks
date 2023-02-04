import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;

import java.util.ArrayList;

import java.util.List;


public class Main {
    public static void main(String[] args) {


    }

    public static List<Flight> findPlanesLeavingInTheNextTwoHours(Airport airport) {
        //TODO Метод должден вернуть список рейсов вылетающих в ближайшие два часа.

        List<Flight> flights = new ArrayList<>();

        airport.getTerminals().forEach(terminal -> terminal.getFlights().stream()
                .filter(flight -> (flight.getDate().getTime() - System.currentTimeMillis() <= 7_200_000)
                        && (flight.getDate().getTime() > System.currentTimeMillis()))
                .filter(flight -> flight.getType().equals(Flight.Type.DEPARTURE)).forEach(flights::add));

        return flights;
    }

}