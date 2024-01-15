package com.company;

public class MobilePhone {

    // data
    private String number;
    private String color;
    private float size;
    private boolean isOn = false;

    public MobilePhone(String number, String color, float size) {
        this.setNumber(number);
        this.setColor(color);
        this.setSize(size);
    }

    public MobilePhone(String number, String color) {
        this.setNumber(number);
        this.setColor(color);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        if (number.length() == 10) {
            this.number = number;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        switch (color.toUpperCase()) {
            case "BLACK":
            case "PINK":
            case "WHITE":
            case "BLUE":
                this.color = color;
                break;
            default:
                System.out.println("Illegal color " + color + ". setting to black");
                this.color = "black";
        }
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        if (size >= 4.0 && size <= 12.0) {
            this.size = size;
        }
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public void turnOnPhone() {
        if (!this.isOn) {
            this.isOn = true;
        } else {
            System.out.println("phone already turned on!");
        }
    }

    public void turnOffPhone() {
        if (this.isOn) {
            this.isOn = false;
        } else {
            System.out.println("phone already turned off!");
        }
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "number='" + number + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size + " inches" +
                ", phone is " + (isOn ? "turned on" : "turned off") +
                '}';
    }

}
