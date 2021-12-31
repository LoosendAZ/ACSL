package com.ee;

public class Recursiestuff {
    public static void main(String[] args) {
        System.out.println(f(10));
    }

    public static int f(int x){
        int result = 0;

        if (x <= 2) {
            x *= 2;
            x += 2;
            result = x;
        }
        else{
            int e = (x - 1);
            int a = (x - 2);
            result = f(e) - f(a);
        }




        return result;
    }
}



