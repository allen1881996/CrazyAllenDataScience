package com.allenhuang;

public class TaxReport2 {

    private CanTaxCalculator calculator;

    public TaxReport2(CanTaxCalculator calculator) {
        // constructor injection
        // use interface to set this field
        this.calculator = calculator;
    }

    // shift-option-down
    // use setter injection to change the dependency of class
    public void setCalculator(CanTaxCalculator calculator) {
        this.calculator = calculator;
    }

    public void show() {
        System.out.println(calculator.calculateTax());
    }
}
