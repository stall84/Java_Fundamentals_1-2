package com.mstallingsprac;

public class Main {

    public static void main(String[] args) {
	TextBox textBox1 = new TextBox();
	textBox1.setText("Box 1");
        System.out.println(textBox1.text.toUpperCase());
    textBox1.clear();
        System.out.println();

        // Java allocates memory on two diff parts of the system's memory. The HEAP and the STACK
        // Objects are stored on the Heap, and primitives (and variable references to those heap objects
        // are stored on the Stack. So for instance when we write:   var textBox1 = new TextBox();  => Java
        // first creates a new TextBox object (right side of assignment) and stores it on the Heap. Then the left
        // side is evaluated, and the variable reference to that object is stored on the Stack.

    // Below is an example of Procedural Programming (Before OOP).
        // Basically variables and procedures (functions)
    int baseSalary = 50_000;
    int extraHours = 10;
    int hourlyRate = 20;

    // function (baseSalary, extraHours, hourlyRate) { //.. do something }
        // Procedural programming like this is fine for this type of example. But extending it later on will several
        // bloat the main method.. which is where OOP comes in to make things easier.
        // Aside from procedural's issues with extension and debugging.. There is a major constraint on
        // re-usability of the code.. Everything is tied together in it's instance.. OOP overcomes this with
        // modularity and inheritance

    var employee = new Employee();      // From here on I'll be using var in new object instantiation to slim-down code size
                                        // This is of course the same as Employee employee = new Employee();


        employee.set_hourlyRate(25);
        employee.setBaseSalary(53_090);
    int wage = employee.calculateWage(20);
        System.out.println(wage);
        System.out.println("Base Salary: " + employee.get_baseSalary());

    }


}
