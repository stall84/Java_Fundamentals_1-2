package com.mstallingsprac;

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
    }
}
