package com.company;

public class Person {

    // data
    private String name;
    private int age;

    // Setters and Getters
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 4) {
            this.name = name;
        }
    }

    // ctors.
    public Person(String name) {
        this.name = name;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // functions
    public void sayMyName() {
        System.out.println("My name is " + this.name);
    }

    // toString
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
