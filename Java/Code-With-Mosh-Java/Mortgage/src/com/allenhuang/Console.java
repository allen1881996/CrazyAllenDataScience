package com.allenhuang;
import java.util.Scanner;

// the class is public, so we can call this class from the outside
public class Console {
    private static Scanner scanner = new Scanner(System.in);

    // this method is static, so we can use it without create a object of console
    public static double readNumber(String prompt, double min, double max) {
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextFloat();
            if(value >= min && value <= max) {
                break;
            }
            System.out.println("Enter a value between " + min + " and " + max);
        }
        return value;
    }
    public static double readNumber(String prompt){
        System.out.print(prompt);
        return scanner.nextFloat();
    }
}
