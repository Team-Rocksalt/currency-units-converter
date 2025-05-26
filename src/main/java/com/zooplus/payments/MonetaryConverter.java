package com.zooplus.payments;

import java.math.BigDecimal;

/**
 * A converter for monetary values.
 */
public interface MonetaryConverter {

    /**
     * Converts the given {@code value} to minor units using definition based on {@code currency}.
     *
     * @param value a value as {@code String} type representing the monetary amount to be converted
     * @param currency the target currency
     * @return the input value converted to minor units representation for the target currency
     */
    int convertToMinorUnits(String value, String currency);

    /**
     * Converts the given {@code value} to minor units using definition based on {@code currency}.
     *
     * @param value a value as {@code double} type representing the monetary amount to be converted
     * @param currency the target currency
     * @return the input value converted to minor units representation for the target currency
     */
    int convertToMinorUnits(double value, String currency);

    /**
     * Converts the given minor units {@code value} to major units representation using definition based on {@code currency}.
     *
     * @param value a value as {@code int} type representing in minor units the monetary amount to be converted
     * @param currency the target currency
     * @return the input value converted to major units representation for the target currency
     */
    BigDecimal convertToMajorUnits(int value, String currency);
}
