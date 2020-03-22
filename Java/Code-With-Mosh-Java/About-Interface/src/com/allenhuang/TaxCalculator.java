package com.allenhuang;
// 这里表达的就是 TaxCalculator执行的是这个interface所表示的功能
public class TaxCalculator implements CanTaxCalculator {
    // fields
    private double taxableIncome;
    // Constructor
    public TaxCalculator(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    @Override
    // this method is a implementation of interface method
    public double calculateTax(){
        // tight coupling means if we change 0.3 here,
        // all of the class that depend on this class need to be redeployed
        // and recompiled
        // Therefore, we need to decouple these two class
        return taxableIncome * 0.3;
    }
}
