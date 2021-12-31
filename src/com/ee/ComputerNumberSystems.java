package com.ee;

public class ComputerNumberSystems {
    public static void main(String[] args) {
        System.out.println(numOfOnes(22, 32));
        System.out.println(numOfOnes(2021, 2021));

    }
    public static int numOfOnes(int min, int max){
        int result = 0;
        for(int i = min; i <= max; i++){
            String binaryString = Integer.toBinaryString(i);
            System.out.println(binaryString);
            long num = Long.parseLong(binaryString);

            // Find the num of ones in the int
            while(num > 0){
                 long remainder = num % 10;
                if(remainder == 1){
                    result++;
                }
                num /= 10;
            }
        }
        return result;
    }
}
