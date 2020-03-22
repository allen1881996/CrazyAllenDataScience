package com.allenhuang;

public class TaxReport {
    // tightly depend on TaxCalculator
    private TaxCalculator calculator;

    // constructor
    public TaxReport() {
        // dependency injection
        calculator = new TaxCalculator(10_000);
    }

    public void show() {
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }
}
