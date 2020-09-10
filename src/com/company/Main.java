package com.company;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {

        printConversion(0);
    }

    public static long toMilesPerHour(double kilometersPerHour){
        double miles = 1.609;
        double milesPerHour;
        if(kilometersPerHour < 0){
            return -1;
        }
        else {
            milesPerHour = kilometersPerHour/miles;
            long IntValue = Math.round(milesPerHour);

            return IntValue;
        }
    }

    public static void printConversion(double kilometersPerHour){
        toMilesPerHour(kilometersPerHour);
        if(kilometersPerHour < 0){
            System.out.println("Invalid Value");
        }
        else
            System.out.printf(kilometersPerHour+ " km/h = " +toMilesPerHour(kilometersPerHour)+"  mi/h");

        
        
    }


}
