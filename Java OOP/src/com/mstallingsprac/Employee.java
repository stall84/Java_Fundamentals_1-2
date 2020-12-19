package com.mstallingsprac;

public class Employee {

    private int _baseSalary;        // Below is the archetypal way of using getters and setters .
    private int _hourlyRate;         // The 'this' keyword can be used instead of snake-casing the fields

    public static int numberOfEmployees;           // A Static field. This will be available on the Class
                                                    // instead of just on an instance of. e.g. Employee.numberOfEmployees
    public Employee(int baseSalary) {
        setBaseSalary(baseSalary);
        set_hourlyRate(0);
        numberOfEmployees ++;
    }
    // Constructors can also be overloaded
    public Employee(int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary);
        set_hourlyRate(hourlyRate);
        numberOfEmployees ++;       // Increment our static field on every new employee creation
    }


    public static void printNumberOfEmployees() {                                   // A Static method. Available by accessing the class directly
        System.out.println("Number of Employees: " + numberOfEmployees);          // instantiation not required e.g. Employee.printNumberOfEmployees();
    }

    private void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be 0 or less");
        _baseSalary = baseSalary;       // If snake_cased field/property not used: this.baseSalary = baseSalary is used
    }
    private int get_baseSalary() {
        return _baseSalary;
    }

    private void set_hourlyRate(int hourlyRate) {
        if (hourlyRate < 0)
            throw new IllegalArgumentException("Hourly rate must be a positive integer");
        _hourlyRate = hourlyRate;
    }
    private int get_hourlyRate() {
        return _hourlyRate;
    }

    public int calculateWage(int extraHours) {
        return _baseSalary + (_hourlyRate * extraHours);
    }

    public int calculateWage() {                                // Here we are overloading the calculateWage method
        return _baseSalary + _hourlyRate;
    }

}
