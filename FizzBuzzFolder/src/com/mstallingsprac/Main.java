package com.mstallingsprac;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // If number input is divisible by 5, print "Fizz" on console
        // If number input is divided by 3, print "Buzz" on console
        // If number is divisible by both 3 and 5, print "FizzBuzz" on console
        // If number is not divisible by either 3 or 5, print that number on console

    FizzBuzz();

    }

    public static void FizzBuzz() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Welcome to FizzBuzz Purgatory, Enter a number: ");
        int intInput = scanner.nextInt();


        if (intInput % 5 == 0 && intInput % 3 == 0) {
            System.out.println("FizzBuzz");
        }
        else if (intInput % 5 == 0) {
            System.out.println("Fizz");
        }
        else if (intInput % 3 == 0) {
            System.out.println("Buzz");
        }
        else
            System.out.println(intInput);
    }
}
