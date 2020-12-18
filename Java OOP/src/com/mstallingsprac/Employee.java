package com.mstallingsprac;

public class Employee {

    private int _baseSalary;        // Below is the archetypal way of using getters and setters .
    private int _hourlyRate;         // The 'this' keyword can be used instead of snake-casing the fields

    public void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be 0 or less");
        _baseSalary = baseSalary;       // If snake_cased field/property not used: this.baseSalary = baseSalary is used
    }
    public int get_baseSalary() {
        return _baseSalary;
    }

    public void set_hourlyRate(int hourlyRate) {
        if (hourlyRate <= 0)
            throw new IllegalArgumentException("Hourly rate must be a positive integer");
        _hourlyRate = hourlyRate;
    }
    public int get_hourlyRate() {
        return _hourlyRate;
    }

    public int calculateWage(int extraHours) {
        return _baseSalary + (_hourlyRate * extraHours);
    }


}
