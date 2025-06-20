# Currency minor and major units

## Context

In payments and finance domain, it is very common to represent monetary values in different formats. Typical examples are:

* _major unit_, the representation using fractions of the currency unit. The numerical representation typically used for currencies. E.g, USD 20.99.
* _minor unit_, the smallest unit of a currency, according to the number of decimals. E.g., 2099 (representing USD 20.99)

## Task description

The task is to implement the logic that converts a given amount value and a target currency to the proper unit representation.
Whenever rounding is needed, use the half up rounding strategy.

1. Implement the `MonetaryConverter` interface.
2. make sure that your implementation is covered by unit tests.

## Examples

* Examples for `convertToMinorUnits()`

| Input           | Output    | Comment                       |
|-----------------|-----------|-------------------------------|
| "2311", "JPY"   | 2311      | no fraction digits            |                         
| "10", "BHD"     | 10000     | 3 fraction digits             |
| 66.750, "BHD"   | 66750000  | 3 fraction digits             |
| 23.9977, "USD"  | 2400      | 2 fraction digits, rounded up | 
| 100, "JPY"      | 100       | no fraction digits            | 

* Examples for `convertToMajorUnits()`

| Input           | Output  |
|-----------------|---------|
| 2311, "JPY"     | "2311"  |
| 9, "EUR"        | "0.09"  |
| 9999, "ISK"     | "9999"  |

## Helpful links

* https://www.mathsisfun.com/numbers/rounding-methods.html
* https://en.wikipedia.org/wiki/ISO_4217, description of currencies and fraction digits
* https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Currency.html
