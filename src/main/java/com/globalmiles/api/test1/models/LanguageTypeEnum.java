/*
 * GlobalMilesAirlineAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.test1.models;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public enum LanguageTypeEnum {
    EN, //for English
    TR; //for Turkish

    private static TreeMap<String, LanguageTypeEnum> valueMap = new TreeMap<String, LanguageTypeEnum>();
    private String value;

    static {
        EN.value = "en";
        TR.value = "tr";

        valueMap.put("en", EN);
        valueMap.put("tr", TR);
    }

    /**
     * Returns the enum member associated with the given string value
     * @return The enum member against the given string value */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static LanguageTypeEnum fromString(String toConvert) {
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
     * Convert list of LanguageTypeEnum values to list of string values
     * @param toConvert The list of LanguageTypeEnum values to convert
     * @return List of representative string values */
    public static List<String> toValue(List<LanguageTypeEnum> toConvert) {
        if(toConvert == null)
            return null;
        List<String> convertedValues = new ArrayList<String>();
        for (LanguageTypeEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 