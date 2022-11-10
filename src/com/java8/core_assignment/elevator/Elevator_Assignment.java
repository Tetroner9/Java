package com.java8.core_assignment.elevator;

import java.util.ArrayList;

class Elevator extends Thread
{

    public void run()
    {
        ArrayList <String> e1 = new ArrayList<>();
        e1.add("Elevator at Floor 1");
        e1.add("Elevator at Floor 2");
        e1.add("Elevator at Floor 3");
        e1.add("Elevator at Floor 4");
        e1.add("Elevator at Floor 5");
        e1.add("Elevator at Floor 6");
        e1.add("Elevator at Floor 7");
        e1.add("Elevator at Floor 8");
        e1.add("Elevator at Floor 9");
        e1.add("Elevator at Floor 10");

        for (String s : e1) {
            System.out.println(s);
            try {
                sleep(2000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
