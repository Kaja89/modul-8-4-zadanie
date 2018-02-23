package com.kodilla.modul84zadanie.test;

import java.util.HashMap;

public class FlightSearcher {
    public void findFlight(Flight flight) throws RouteNotFoundException {
        HashMap<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("Barcelona", true);
        flightMap.put("Warszawa", true);
        flightMap.put("Rzym", true);
        flightMap.put("Neapol", true);

        if (flightMap.containsKey(flight.getDepartureAirport())) {
            System.out.println("Your flight is available");
        } else {
            throw new RouteNotFoundException("Your flight not found");
        }
    }
}
