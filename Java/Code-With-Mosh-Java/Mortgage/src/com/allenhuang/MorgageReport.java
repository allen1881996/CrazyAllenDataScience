package com.allenhuang;

import java.text.NumberFormat;

public class MorgageReport {

    private final NumberFormat currency;
    private MorgageCalculator calculator;

    public MorgageReport(MorgageCalculator calculator) {
        this.calculator = calculator;
        currency = NumberFormat.getCurrencyInstance();
    }

    public void printPaymentSchedule() {
        System.out.println("\nPAYMENT SCHEDULE \n------------");
        for(double balance : calculator.getRemainingBanlances())
            System.out.println(currency.format(balance));
    }

    public void printMortgage() {
        // calculate the mortgage value
        double mortgage = calculator.calculateMortgage();

        System.out.println("\nMORTGAGE \n----------");
        System.out.println("Monthly Payments: " + currency.format(mortgage));
    }
}
