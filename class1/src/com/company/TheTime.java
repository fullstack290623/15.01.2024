package com.company;

public class TheTime {

    private int UTC;

    public TheTime(int UTC) {
        this.UTC = UTC;
    }

    public int getTimeByTimezone() {
        int timezone = 3;
        return UTC + timezone;
    }

    @Override
    public String toString() {
        return "TheTime{" +
                "UTC=" + UTC +
                '}';
    }
}
