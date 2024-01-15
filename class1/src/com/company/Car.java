package com.company;

public class Car {
    private String make;
    private String model;
    private int year;

    // Default constructor
    public Car() {
        this.make = "Unknown";
        this.model = "Unknown";
        this.year = 0;
    }

    // Constructor with all attributes
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Constructor with make and model, default year
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
        this.year = 0; // default value
    }

    // Overridden toString method
    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

}
