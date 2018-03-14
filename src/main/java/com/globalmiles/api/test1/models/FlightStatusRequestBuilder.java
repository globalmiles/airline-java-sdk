/*
 * GlobalMilesAirlineAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.test1.models;

import java.util.*;

public class FlightStatusRequestBuilder {
    //the instance to build
    private FlightStatusRequest flightStatusRequest;

    /**
     * Default constructor to initialize the instance
     */
    public FlightStatusRequestBuilder() {
        flightStatusRequest = new FlightStatusRequest();
    }

    /**
     * A complex object for representing passenger.
     */
    public FlightStatusRequestBuilder passenger(PassengerMin passenger) {
        flightStatusRequest.setPassenger(passenger);
        return this;
    }

    /**
     * A complex object for flight.
     */
    public FlightStatusRequestBuilder flight(FlightMin flight) {
        flightStatusRequest.setFlight(flight);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public FlightStatusRequest build() {
        return flightStatusRequest;
    }
}