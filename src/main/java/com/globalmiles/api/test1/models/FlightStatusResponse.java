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
public class FlightStatusResponse 
        extends Response {
    private static final long serialVersionUID = 1766129703848179639L;
    private FlightStatusTypeEnum flightStatus;
    private FlightMax flight;
    /** GETTER
     * The final status of flight. The possible values are 'used', 'unused' and 'reissued'. For the reissued tickets the following new flight information must provided.
     */
    @JsonGetter("flight_status")
    public FlightStatusTypeEnum getFlightStatus ( ) { 
        return this.flightStatus;
    }
    
    /** SETTER
     * The final status of flight. The possible values are 'used', 'unused' and 'reissued'. For the reissued tickets the following new flight information must provided.
     */
    @JsonSetter("flight_status")
    public void setFlightStatus (FlightStatusTypeEnum value) { 
        this.flightStatus = value;
    }
 
    /** GETTER
     * A complex for the flight. It is only accepted for reissued status.
     */
    @JsonGetter("flight")
    public FlightMax getFlight ( ) { 
        return this.flight;
    }
    
    /** SETTER
     * A complex for the flight. It is only accepted for reissued status.
     */
    @JsonSetter("flight")
    public void setFlight (FlightMax value) { 
        this.flight = value;
    }
 
}
