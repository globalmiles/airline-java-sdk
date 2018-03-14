/*
 * GlobalMilesAirlineAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.test1.models;

import java.util.*;

public class AmountBuilder {
    //the instance to build
    private Amount amount;

    /**
     * Default constructor to initialize the instance
     */
    public AmountBuilder() {
        amount = new Amount();
    }

    /**
     * ISO 4217 currency code of the amount.
     */
    public AmountBuilder currencyCode(String currencyCode) {
        amount.setCurrencyCode(currencyCode);
        return this;
    }

    /**
     * A decimal value with two decimals in the string representation of amount.
     */
    public AmountBuilder value(double value) {
        amount.setValue(value);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Amount build() {
        return amount;
    }
}