package com.ee;

public class RecursiveFunctions {
    public static void main(String[] args) {
        System.out.println(fibonnachi(7));
        System.out.println(factorial(4));
    }

    /**
     * RETURN XTH FIBBONAHI NUMBER
     * @param x
     * @return
     */
    public static int fibonnachi(int x){
        if(x > 1){
            return fibonnachi(x - 1) + fibonnachi(x - 2);
        }
        else{
            return x;
        }
    }

    public static int factorial(int base){
        if(base == 0){
            return 1;
        }
        else{
            return base * factorial(base - 1);
        }
    }
}
