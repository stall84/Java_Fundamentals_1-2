package com.mstallingsprac;

import java.text.NumberFormat;
import java.time.Period;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


//        byte age = 30;
//        Date now = new Date();
//        System.out.println("The time is: " + now );
//        int[] num_arr = new int[10];
//        num_arr[0] = 15;
//        num_arr[1] = 25;
//        num_arr[2] = 50;
//
//        System.out.println(Arrays.toString(num_arr));
//
//        Maxxer(14,81);
//        System.out.println(Randomizer(10));
//        Age_Inputter();
//        Echoer();


        Mortgage_Calculator();
    }

    public static void Maxxer(int num, int num2) {
        System.out.println(Math.max(num, num2));
    }

    public static int Randomizer(int num) {
        return ((int)(Math.random()*10) * num);
    }

    public static void Age_Inputter() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        byte ageIn = scanner.nextByte();
        System.out.println("You are " + ageIn + " years old");
    }

    public static void Echoer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some text to ECHO!");
        String echo_text = scanner.nextLine();
        System.out.println(echo_text.toUpperCase() + "!!!!");
    }

    public static void Mortgage_Calculator() {
        final byte MONTHS_YEAR = 12;
        final byte PERCENT = 100;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Principal Amount Borrowed: ");
        int principal = scanner.nextInt();
        System.out.print("Enter APR without % symbol (i.e. 3.5 for 3.5%): ");
        float annual_interest = scanner.nextFloat();
        float monthly_interest = annual_interest / PERCENT / MONTHS_YEAR;
        System.out.print("Enter length of mortgage in years: ");
        byte years = scanner.nextByte();
        int number_of_payments = years * MONTHS_YEAR;

        double mortgage = principal
                * (monthly_interest * Math.pow(1 + monthly_interest, number_of_payments))
                / (Math.pow(1 + monthly_interest, number_of_payments) -1);

        String formatted_mortgage = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Your monthly payment will be: " + formatted_mortgage);

    }

}
