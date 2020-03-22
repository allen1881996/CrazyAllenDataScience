package com.allenhuang;

public abstract class AbstractTaxCalculator implements CanTaxCalculator {
    // it is protected, so we only able it within classes that inheriant from this class
    protected double getTaxableIncome(double income, double expenses) {
        return income - expenses;
    }

}
