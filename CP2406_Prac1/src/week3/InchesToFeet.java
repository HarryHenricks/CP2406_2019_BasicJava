package week3;

import java.util.Scanner;

public class InchesToFeet {
    public static void main(String[] args) {

        int inches = 86;

        int feet = java.lang.Math.round(inches/ 12);
        int remainder = inches%12;

        System.out.println(feet + " Feet and " + remainder + " Inches");

    }
 }

