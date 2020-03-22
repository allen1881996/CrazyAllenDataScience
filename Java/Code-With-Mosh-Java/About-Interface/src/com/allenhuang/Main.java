package com.allenhuang;

public class Main {

    public static void main(String[] args) {
        var report = new TaxReport();
        report.show();
        var calculator = new TaxCalculator(20_000);
        // programming against interfaces: TaxReport only working with an interface
        var report2 = new TaxReport2(calculator);
        report2.show();
        report2.setCalculator(new TaxCalculator2());
        report2.show();
        var report3 = new TaxReport3();
        // method injection
        report3.showInjection(new TaxCalculator2());
    }
}
