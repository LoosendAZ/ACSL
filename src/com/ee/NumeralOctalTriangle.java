package com.ee;

public class NumeralOctalTriangle {
    public static void main(String[] args){
        // Testing sumOfDigits
        System.out.println(sumOfDigits(5)); //Expecting 5
        System.out.println(sumOfDigits((125))); //Exp-ecting 8
        System.out.println(sumOfDigits(1234567890)); // expecting 55

        octalTriangle(2, 3, 5);
        octalTriangle(Integer.parseInt("221", 8),2,4);
        octalTriangle(1, 4, 20);
        octalTriangle(Integer.parseInt("10", 8), Integer.parseInt("10", 8), 10);
        octalTriangle(Integer.parseInt("3245", 8), 5, 11);
        octalTriangle(Integer.parseInt("4567", 8), 7, 65);
        octalTriangle(Integer.parseInt("3141", 8), 5, 26);
        octalTriangle(Integer.parseInt("765", 8), Integer.parseInt("43", 8), 21);
        octalTriangle(Integer.parseInt("704", 8), Integer.parseInt("1776", 8), 20);
        octalTriangle(Integer.parseInt("77", 8), 7, 100);
    }

    public static void octalTriangle(int start, int delta, int rows) {
        int sum = 0;
        int current = start;
        System.out.println(String.format("%o", current));
        for(int x = 2; x <= rows; x++){
            for(int y = 1; y <= x; y++){
                current += delta;
                String octal = String.format("%o", current);
                if(x == rows) {
                    sum += sumOfDigits(Integer.parseInt(octal));
                }
                System.out.print(octal + " ");
            }
            System.out.println();
        }

        System.out.println("The sum of digits is: " + sum);
    }

    /**
     * Given an integer, return the sum of its digits.
     */
    public static int sumOfDigits(int num){
        int result = 0;
        int quotient = num/10;
        int remainder = num%10;
        result = remainder;

        while(quotient > 0){
            remainder = quotient % 10;
            quotient /= 10;
            result += remainder;
        }

        return result;
    }
}
