package com.org;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        while (true) {
            System.out.print("Enter an integer between 1 and 10: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid integer.");
                scanner.next();
                continue;
            }

            number = scanner.nextInt();
            if (number >= 1 && number <= 10) {
                break;
            }

            System.out.println("The integer must be between 1 and 10.");
        }

        System.out.println(number + "! = " + factorial(number));
    }

    public static long factorial(int number) {
        if (number < 1 || number > 10) {
            throw new IllegalArgumentException("Number must be between 1 and 10.");
        }

        long result = 1;
        for (int current = 2; current <= number; current++) {
            result *= current;
        }
        return result;
    }
}
