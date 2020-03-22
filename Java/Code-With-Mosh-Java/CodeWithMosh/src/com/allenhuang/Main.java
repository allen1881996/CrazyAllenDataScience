package com.allenhuang;
/* How to run java in terminal
   Right click Mian.java, select open in terminal, javac Mian.java
   Then we got Mian.class, use cd .. and cd .. to the src. Then java com.allenhuang.Main (JVM) */
import java.awt.*;
import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
        printNum(2);
        // reference type, allocate memory
        Date today = new Date();
        System.out.println(today);
        // Point
        Point point = new Point(1,2);
        point.x = 2;
        System.out.println(point.x);
        // String and shortcut
        String message = new String("Hello");
        String message1 = "World";
        System.out.println(message+message1);
        // String method
        System.out.println(message.endsWith("o"));
        System.out.println(message.length());
        System.out.println(message1.indexOf("rla"));
        System.out.println(message1.replace("W","M")); // does not modify original string, String is immutable in java
        System.out.println(message1.toLowerCase());
        System.out.println(message1.toUpperCase());
        String withblank = "  Oh  ";
        System.out.println(withblank.trim());
        // Multi-dimensional arrays
        int[][] arr = new int[3][2];
        arr[1][1] = 2;
        System.out.println(Arrays.deepToString(arr));
        int[][] arr3 = new int[][] {{1,2,3},{5,6,7}};
        System.out.println(Arrays.deepToString(arr3));
        // ternary operator, condition ? trueResult : falseResult
        int income = 10_000;
        String className = income > 20_000 ? "first" : "Second";
        System.out.println((className));
        // switch statement, instead of if - else if - else
        String role = "admin";
        switch (role) {
            case "admin":
                System.out.println("Yes");
                break;
            case "moderator":
                System.out.println("No");
                break;
            default:
                System.out.println("-");
        }
        // math, do not need import
        System.out.println(Math.round(1.2F));
        // ceil: find the min number great than 1.3
        System.out.println(Math.ceil(1.3D));
        System.out.println(Math.floor(2.5D));
        System.out.println(Math.max(1,4));
        System.out.println(Math.min(2,10));
        // random number 0-1
        float randomNumber = (float) Math.random() * 100;
        System.out.println(randomNumber);
        // for-each loop, iterate over arrays or collections
        String[] fruit = {"apple","orange","mango"};
        for(String item : fruit){
            System.out.println(item);
        }
        

    }

    public static void printNum(int x){
        int i;
        for(i=0;i<=x;i++){
            System.out.println(i);
        }
    }
}
