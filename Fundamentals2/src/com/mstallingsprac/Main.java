package com.mstallingsprac;

import java.io.InputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Comparison Operators

        int x = 1;
        int y = 1;
        boolean result = x == y;
        System.out.println(result);
        // Prints true
        // Java like C# and unlike only Javascript (because Java is strongly typed inherently)
        // only uses double equals for comparison (instead of triple equals for 'strict' js comp)
        int b = 50;
        int c = 20;
        boolean result2 = b <= c;
        // False
        // Other operators are != not equals, >= greater-than-equal-to, less & greater than
    // Logical Operators
    int temp = 22;
    boolean isWarm = temp > 20 && temp < 30;
    System.out.println(isWarm);
    // Prints true .. Like other languages both conditions must be true to pass true on a logical-and (&&)
    boolean hasHighIncome = true;
    boolean hasGoodCredit = true;
    boolean hasCriminalRecord = false;
    boolean isEligble = hasHighIncome || hasGoodCredit;
    System.out.println(isEligble);
    // Prints true .. Either part of the expression that is true returns true for the whole expression
    // Not Operator = !. Expressions can be grouped with parenthesis to make more complex ones ex:
    boolean isEligible = (hasHighIncome && hasGoodCredit) && !hasCriminalRecord;
    System.out.println(isEligible);
    // Prints true

    // If Statements
    // Very similar to other languages
    // Curly braces are not required with single expressions.. stylistic choice
        int temp2 = 15;
        if (temp2 > 20 && temp2 < 30) {
            System.out.println("It's nice outside if in metric-using country");
        } else {
            System.out.println("Good luck .. it's not great outside");
        }
        // You'll need to declare the boolean hasHighInc outside of the code block to make it's scope
        // available globally. Simplifying this if-else statement to show no-brace example
        boolean hasHighInc;
        int income = 92000;
        if (income > 100000)
            hasHighInc = true;
        else
            hasHighInc = false;
        System.out.println(hasHighInc);

        // This is a way of greatly reducing/simplifying and professionalizing the above code example
        int income2 = 105000;
        boolean hasHighIncClean = income2 > 100000;
        System.out.println(hasHighIncClean);
        // true

        // TERNARY OPERATOR
        // Again, Similar to many other C-based languages
        int income3 = 120_000;
        String className;

//        if (income3 > 100_000) {
//            className = "First";
//        }
//        else {
//            className = "Economy";
//        }
        // Above is long-form 'amateur' if-else for the 'pro' version below:
        className = (income3 > 100_000) ? "First Class" : "Economy Class";
        System.out.println(className);
        byte x1 = 3;
        String ternReturn = x1 == 3 ? "It's There" : "It's Not";
        System.out.println(ternReturn);

        // SWITCH STATEMENTS
        // Pretty much exactly similar to javascript

        //Switcher();

        // FOR LOOPS
        // Slightly more detailed than javascript because the counter variable has to bye typed
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello World! " + i);
        }

        // WHILE LOOPS
        // Same as js

        Whiler();

        // DO WHILE LOOP
        // Same as while loop except guarantees run at least once

    }

    public static void Switcher() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter role: ");
        String inputString = scanner.nextLine();

        switch (inputString) {
            case "admin":
                System.out.println("You're an Administrator");
                break;
            case "moderator":
                System.out.println("You're a Moderator");
                break;
            default:
                System.out.println("You're a guest");
        }
    }
    public static void Whiler() {
        String input = "";
        Scanner scanner = new Scanner(System.in);
        // While input does not equal 'quit' : do
        // Changed to while:true to simplify.
        // NOTE: Always add a Break statement to prevernt infinite loop

        while (true) {
            System.out.print("Enter a number or 'quit': ");
            input = scanner.next().toLowerCase();
            // This if-check checks to see if the input is 'quit',
            // this way quit doesn't get printed when it's entered.
            // Break-statement ignores everything following it and jumps out of code
            if (input.equals("pass")) {
                // Continue allows the code to continue, but without executing any further/lower blocks
                continue;
            }
            if (input.equals("quit")) {
                break;
            }
            System.out.println(input);

        }
    }
}
