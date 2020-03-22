package com.allenhuang;

public class Main {

    // main method
    public static void main(String[] args) {

        final int PRINCIPAL_MIN = 1000;
        final int PRINCIPAL_MAX = 1_000_000;

        int principal = (int) Console.readNumber("Principal: ", PRINCIPAL_MIN, PRINCIPAL_MAX);

        float annualInterest = (float) Console.readNumber("Annual Interest Rate: ", 1, 30);
        int years = (int) Console.readNumber("Period (Years): ", 1, 30);

        var calculator = new MorgageCalculator(principal, annualInterest, years);
        var report = new MorgageReport(calculator);

        report.printMortgage();
        report.printPaymentSchedule();
    }

}