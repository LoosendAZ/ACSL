package com.ee;

import java.util.Scanner;

public class nim {
    public static void main(String[] args) {
        // System.out.println("ee?");
        // String test = scanMethod();
        //System.out.println(test);
        System.out.println("Welcome to nim! How many cards do you want in total? ");
        String numOfCards = scanMethod();
        System.out.println(numOfCards);
        int cards = Integer.parseInt(numOfCards);

        System.out.println("Would you like to go first? (y/n) ");
        String turn = scanMethod();
        System.out.println(turn);
        String goFirst = "";

        if (turn.equals("y")) {
            goFirst = "y";
        } else if (turn.equals("n")) {
            goFirst = "n";
        }

        while (cards > 0) {
            if (goFirst == "n") {
                // COMPUTER PICKING

                int min = 1;
                int max = 2;
                int choice = (int) Math.floor(Math.random() * (max - min + 1) + min);
                System.out.println("Computer chose " + String.valueOf(choice) + " cards.");
                if (cards <= 2) {
                    System.out.println("COMPUTER WINS");
                    return;
                }
                cards -= choice;
                System.out.println("There are " + String.valueOf(cards) + " cards left.");
                if (cards <= 0) {
                    System.out.println("COMPUTER WINS");
                    return;
                }

                // USER PICKING

                System.out.println("");
                System.out.println("How many cards would you like to take? ");
                String take = scanMethod();
                System.out.println(take);
                int take2 = Integer.parseInt(take);
                while (take2 != 1 && take2 != 2) {
                    System.out.println("YOU CAN'T DO THAT, YOU CAN't TAKE MORE THAN TWO CARD!");
                    System.out.println("How many cards would you like to take? ");
                    take = scanMethod();
                    System.out.println(take);
                    take2 = Integer.parseInt(take);

                }
                System.out.println("You have taken " + take2 + " cards.");
                cards -= take2;
                System.out.println("There are " + String.valueOf(cards) + " cards left.");
                if (cards <= 0) {
                    System.out.println("PLAYER WINS");
                    return;
                }
            }

            if (goFirst == "y") {
                // USER PICKING

                System.out.println("");
                System.out.println("How many cards would you like to take? ");
                String take = scanMethod();
                System.out.println(take);
                int take2 = Integer.parseInt(take);
                while (take2 != 1 && take2 != 2) {
                    System.out.println("YOU CAN'T DO THAT, YOU CAN't TAKE MORE THAN TWO CARD!");
                    System.out.println("How many cards would you like to take? ");
                    take = scanMethod();
                    System.out.println(take);
                    take2 = Integer.parseInt(take);
                }
                System.out.println("You have taken " + take2 + " cards.");
                cards -= take2;
                System.out.println("There are " + String.valueOf(cards) + " cards left.");
                if (cards <= 0) {
                    System.out.println("PLAYER WINS");
                    break;
                }
                // COMPUTER PICKING

                int min = 1;
                int max = 2;
                int choice = (int) Math.floor(Math.random() * (max - min + 1) + min);
                System.out.println("Computer chose " + String.valueOf(choice) + " cards.");
                cards -= choice;
                System.out.println("There are " + String.valueOf(cards) + " cards left.");
                if (cards <= 0) {
                    System.out.println("COMPUTER WINS");
                    break;
                }
            }
        }
    }

    public static String scanMethod() {
        String result = "";
        Scanner scan = new Scanner(System.in);
        result = scan.nextLine();
        return result;
    }
}

