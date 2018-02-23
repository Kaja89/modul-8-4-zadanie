package com.kodilla.modul84zadanie.test;

public class FlightApp {
    public static void main(String[] args) {
        Flight flight1 = new Flight("Barcelona", "Rzym");
        Flight flight2 = new Flight("Warszawa", "Majorka");
        Flight flight3 = new Flight("Moskwa", "Seszele");

        FlightSearcher searcher = new FlightSearcher();
        try {
            searcher.findFlight(flight1);
        } catch (RouteNotFoundException e) {
            System.out.println(e);
        }

        try {
            searcher.findFlight(flight2);
        } catch (RouteNotFoundException e) {
            System.out.println(e);
        }

        try {
            searcher.findFlight(flight3);
        } catch (RouteNotFoundException e) {
            System.out.println("We are sory, choosen flight is not available. " + e);
        }
    }
}
