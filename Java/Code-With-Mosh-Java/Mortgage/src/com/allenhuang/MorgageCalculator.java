package com.allenhuang;

public class MorgageCalculator {
    // constants
    private final static byte MONTHS_IN_YEAR = 12;
    private final static byte PERCENT = 100;

    private int principal;
    private float annualInterest;
    private int years;

    public MorgageCalculator(int principal, float annualInterest, int years) {
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;
    }

    /* This method use 3 parameters, but here we can put it on the attribute of
         our class, and then build a constructor about these parameters */

    public double calculateMortgage() {

        float monthlyInterest = getMonthlyInterest();

        double totalNumberOfPayments = getTotalNumberOfPayments();

        // calculate the monthly interest per month
        double paymentsPerMonth = Math.pow(1 + monthlyInterest, totalNumberOfPayments);
        // calculate the mortgage value
        double mortgage =  principal * (monthlyInterest * paymentsPerMonth) / (paymentsPerMonth - 1);

        return mortgage;
    }

    public double calculateBalance(double numberOfPaymentsMade) {

        float monthlyInterest = getMonthlyInterest();

        double totalNumberOfPayments = getTotalNumberOfPayments();

        double balance = principal
                * ( Math.pow(1 + monthlyInterest, totalNumberOfPayments)
                - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1+ monthlyInterest, totalNumberOfPayments) - 1);

        return balance;
    }

    public double[] getRemainingBanlances() {
        double [] balances = new double[getTotalNumberOfPayments()];
        for (int month = 1; month <= getTotalNumberOfPayments(); month++) {
            balances[month - 1] = calculateBalance(month);

        }
        return balances;
    }

    private int getTotalNumberOfPayments() {
        return years * MONTHS_IN_YEAR;
    }

    private float getMonthlyInterest() {
        return annualInterest / PERCENT / MONTHS_IN_YEAR;
    }

}
