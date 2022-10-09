package com.java8.colg.exp_9_tasks;
import java.util.*;

class Area
{
    Area(float s)
    {
        float area = (float) Math.pow(s,2);
        System.out.println("Area of Square: "+area);
    }
    Area(float w,float l)
    {
        float area = w*l;
        System.out.println("Area of Rectangle: "+area);
    }
}

public class task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of square");
        float s = sc.nextFloat();
        System.out.println("Enter width and length of rectangle");
        float w = sc.nextFloat();
        float l = sc.nextFloat();
        new Area(s);
        new Area(w,l);
        sc.close();

    }
}
