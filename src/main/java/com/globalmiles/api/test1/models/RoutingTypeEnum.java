/*
 * GlobalMilesAirlineAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.test1.models;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public enum RoutingTypeEnum {
    ONE_WAY, //One way trip indicator.
    ROUND_TRIP; //Round trip indicator.

    private static TreeMap<String, RoutingTypeEnum> valueMap = new TreeMap<String, RoutingTypeEnum>();
    private String value;

    static {
        ONE_WAY.value = "one_way";
        ROUND_TRIP.value = "round_trip";

        valueMap.put("one_way", ONE_WAY);
        valueMap.put("round_trip", ROUND_TRIP);
    }

    /**
     * Returns the enum member associated with the given string value
     * @return The enum member against the given string value */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static RoutingTypeEnum fromString(String toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the string value associated with the enum member
     * @return The string value against enum member */
    @com.fasterxml.jackson.annotation.JsonValue
    public String value() {
        return value;
    }
        
    /**
     * Get string representation of this enum
     */
    @Override
    public String toString() {
        return value.toString();
    }

    /**
     * Convert list of RoutingTypeEnum values to list of string values
     * @param toConvert The list of RoutingTypeEnum values to convert
     * @return List of representative string values */
    public static List<String> toValue(List<RoutingTypeEnum> toConvert) {
        if(toConvert == null)
            return null;
        List<String> convertedValues = new ArrayList<String>();
        for (RoutingTypeEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 