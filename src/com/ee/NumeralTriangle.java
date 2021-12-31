package com.ee;

public class NumeralTriangle {
    public static void main(String[] args) {
        System.out.println(sumOfDigitss(99));
        System.out.println(sumOfDigitss(1234));


        numeralTriangleXd(2,3,5);
        numeralTriangleXd(221,2,4);
        numeralTriangleXd(184,231,35);
        numeralTriangleXd(71,5,27);
        numeralTriangleXd(1,24,100);
        numeralTriangleXd(599,23,43);
        numeralTriangleXd(4326,1234,80);
        numeralTriangleXd(704,1776,200);
        numeralTriangleXd(6283,59,31);
        numeralTriangleXd(3141,59,26);
    }

    public static void numeralTriangleXd(int start, int delta, int rows) {
        int sum = 0;
        int current = start;
        System.out.println(sumOfDigitss(current));

        for (int row = 2; row <= rows; row++) {
            for (int col = 1; col <= row; col++) {
                current += delta;
                int num = sumOfDigitss(current);
                System.out.print(num + " ");

                if(row == rows){
                    sum += num;
                }
            }
            System.out.println();
        }

        System.out.println("The sum of all numbers on the " + rows + "'th row is " + sum);
    }

    private static int sumOfDigitss(int num) {
        int result = 0;

        while (num > 0) {
            int remainder = num % 10;
            result += remainder;
            num /= 10;
        }

        if (result < 10) {
            return result;
        } else {
            return sumOfDigitss(result);
        }
    }
}
