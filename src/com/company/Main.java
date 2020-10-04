/*************************
 * Author: Travis Ashcraft
 *
 * Speed Converter
 *
 * Travisashcraft.github.io
 */

package com.company;
import java.lang.Math;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the kilometers per hour you want to convert to miles per hour: ");
        long conversion = scanner.nextLong();
        printConversion(conversion);
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
