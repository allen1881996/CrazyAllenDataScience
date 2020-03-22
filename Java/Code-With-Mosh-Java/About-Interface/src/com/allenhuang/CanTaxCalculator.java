package com.allenhuang;

public interface CanTaxCalculator {
    // do not have any fields
    // only have method declarations that determine what need to be done
    // a public contract

    // method declaration, must be public

    // the field of interface：static，final
    float minimumTax = 100;
    double calculateTax();

}
