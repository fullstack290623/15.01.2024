package com.company;

public class Main {

    public static void main(String[] args) {
        // class - template
        // object/instance --> the car after new
        // new --> calls the ctor.
        Car car1 = new Car("Toyota", "Camry", 2021);
        Car car2 = new Car("Honda", "Civic");
        Car car3 = new Car();

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

        Person danny = new Person("danny", 18);
        Person ronni = new Person("ronni");

        //danny.age = -1; //blocked
        danny.setAge(-1);

        // class MobilePhone
        // data: String number, String color, float size, boolean isOn = false
        // getters and setters -
        //      number should be 10 digits
        //      color could be only "black", "pink", "white", "blue"
        //      size could be only between 4.0 to 12.0
        // ctor1: String number, String color, float size
        // ctor2: String number, String color
        // function turnOnPhone -> isOn = true
        // function turnOffPhone -> isOn = false
        // toString which print everything [auto]
        // create 3 phones
        // turn them on
        // turn 1 off
        // try to change the color to "green"
        // try to change the size to 0.5
        // try to change the number to "1234"
        // print the phones before and after

        System.out.println(danny);

    }
}
