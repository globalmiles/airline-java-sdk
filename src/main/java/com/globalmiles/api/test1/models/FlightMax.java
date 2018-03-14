/*
 * GlobalMilesAirlineAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.test1.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class FlightMax 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5125234549769823120L;
    private String airline;
    private String cabinType;
    private String flightNumber;
    private String pnr;
    private String ticketNumber;
    private String departureAirport;
    private String arrivalAirport;
    private String departureDateTime;
    private String arrivalDateTime;
    private Amount totalAmount;
    private Integer distance;
    /** GETTER
     * IATA code for airline company.
     */
    @JsonGetter("airline")
    public String getAirline ( ) { 
        return this.airline;
    }
    
    /** SETTER
     * IATA code for airline company.
     */
    @JsonSetter("airline")
    public void setAirline (String value) { 
        this.airline = value;
    }
 
    /** GETTER
     * Cabin type of the flight.
     */
    @JsonGetter("cabin_type")
    public String getCabinType ( ) { 
        return this.cabinType;
    }
    
    /** SETTER
     * Cabin type of the flight.
     */
    @JsonSetter("cabin_type")
    public void setCabinType (String value) { 
        this.cabinType = value;
    }
 
    /** GETTER
     * Number of the flight.
     */
    @JsonGetter("flight_number")
    public String getFlightNumber ( ) { 
        return this.flightNumber;
    }
    
    /** SETTER
     * Number of the flight.
     */
    @JsonSetter("flight_number")
    public void setFlightNumber (String value) { 
        this.flightNumber = value;
    }
 
    /** GETTER
     * Passenger name record of the flight.
     */
    @JsonGetter("pnr")
    public String getPnr ( ) { 
        return this.pnr;
    }
    
    /** SETTER
     * Passenger name record of the flight.
     */
    @JsonSetter("pnr")
    public void setPnr (String value) { 
        this.pnr = value;
    }
 
    /** GETTER
     * Ticket number of the passenger.
     */
    @JsonGetter("ticket_number")
    public String getTicketNumber ( ) { 
        return this.ticketNumber;
    }
    
    /** SETTER
     * Ticket number of the passenger.
     */
    @JsonSetter("ticket_number")
    public void setTicketNumber (String value) { 
        this.ticketNumber = value;
    }
 
    /** GETTER
     * IATA code for the departure airport.
     */
    @JsonGetter("departure_airport")
    public String getDepartureAirport ( ) { 
        return this.departureAirport;
    }
    
    /** SETTER
     * IATA code for the departure airport.
     */
    @JsonSetter("departure_airport")
    public void setDepartureAirport (String value) { 
        this.departureAirport = value;
    }
 
    /** GETTER
     * IATA code for the  arrival airport.
     */
    @JsonGetter("arrival_airport")
    public String getArrivalAirport ( ) { 
        return this.arrivalAirport;
    }
    
    /** SETTER
     * IATA code for the  arrival airport.
     */
    @JsonSetter("arrival_airport")
    public void setArrivalAirport (String value) { 
        this.arrivalAirport = value;
    }
 
    /** GETTER
     * ISO 8601 date and time in UTC for departure time.
     */
    @JsonGetter("departure_date_time")
    public String getDepartureDateTime ( ) { 
        return this.departureDateTime;
    }
    
    /** SETTER
     * ISO 8601 date and time in UTC for departure time.
     */
    @JsonSetter("departure_date_time")
    public void setDepartureDateTime (String value) { 
        this.departureDateTime = value;
    }
 
    /** GETTER
     * ISO 8601 date and time in UTC for arrival time.
     */
    @JsonGetter("arrival_date_time")
    public String getArrivalDateTime ( ) { 
        return this.arrivalDateTime;
    }
    
    /** SETTER
     * ISO 8601 date and time in UTC for arrival time.
     */
    @JsonSetter("arrival_date_time")
    public void setArrivalDateTime (String value) { 
        this.arrivalDateTime = value;
    }
 
    /** GETTER
     * A complex object for the amount of the flight including currency and value.
     */
    @JsonGetter("total_amount")
    public Amount getTotalAmount ( ) { 
        return this.totalAmount;
    }
    
    /** SETTER
     * A complex object for the amount of the flight including currency and value.
     */
    @JsonSetter("total_amount")
    public void setTotalAmount (Amount value) { 
        this.totalAmount = value;
    }
 
    /** GETTER
     * The distance between departure and arrival airports.
     */
    @JsonGetter("distance")
    public Integer getDistance ( ) { 
        return this.distance;
    }
    
    /** SETTER
     * The distance between departure and arrival airports.
     */
    @JsonSetter("distance")
    public void setDistance (Integer value) { 
        this.distance = value;
    }
 
}
 