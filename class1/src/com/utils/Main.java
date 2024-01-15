package com.utils;

import com.company.Circle;
import com.company.TheTime;

public class Main {

    public static void main(String[] args) {
        Circle c = new Circle(4f);
        c.radius = 12;

        TheTime time = new TheTime(239485739);
        // time.UTC // cannot
        time.getTimeByTimezone();
    }

}
