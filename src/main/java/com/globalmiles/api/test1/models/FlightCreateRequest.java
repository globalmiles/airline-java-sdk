/*
 * GlobalMilesAirlineAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.test1.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.ALWAYS)
public class FlightCreateRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = -433342979782184478L;
    private AwardMilesRules awardMilesRules;
    private PassengerMax passenger;
    private RoutingTypeEnum routingType;
    private List<FlightMax> flights;
    /** GETTER
     * A complex object for definition of the award mile calculation logic.
     */
    @JsonGetter("award_miles_rules")
    public AwardMilesRules getAwardMilesRules ( ) { 
        return this.awardMilesRules;
    }
    
    /** SETTER
     * A complex object for definition of the award mile calculation logic.
     */
    @JsonSetter("award_miles_rules")
    public void setAwardMilesRules (AwardMilesRules value) { 
        this.awardMilesRules = value;
    }
 
    /** GETTER
     * A complex object for representing a passenger.
     */
    @JsonGetter("passenger")
    public PassengerMax getPassenger ( ) { 
        return this.passenger;
    }
    
    /** SETTER
     * A complex object for representing a passenger.
     */
    @JsonSetter("passenger")
    public void setPassenger (PassengerMax value) { 
        this.passenger = value;
    }
 
    /** GETTER
     * Routing type of the flights.
     */
    @JsonGetter("routing_type")
    public RoutingTypeEnum getRoutingType ( ) { 
        return this.routingType;
    }
    
    /** SETTER
     * Routing type of the flights.
     */
    @JsonSetter("routing_type")
    public void setRoutingType (RoutingTypeEnum value) { 
        this.routingType = value;
    }
 
    /** GETTER
     * An array of flights. We are expecting one flight for one way trip and two flights for round trip.
     */
    @JsonGetter("flights")
    public List<FlightMax> getFlights ( ) { 
        return this.flights;
    }
    
    /** SETTER
     * An array of flights. We are expecting one flight for one way trip and two flights for round trip.
     */
    @JsonSetter("flights")
    public void setFlights (List<FlightMax> value) { 
        this.flights = value;
    }
 
}
