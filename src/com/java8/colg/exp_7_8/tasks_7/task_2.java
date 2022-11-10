package com.java8.colg.exp_7_8.tasks_7;
import java.util.*;

interface Rectangle1{
    void print_cal();
    Scanner sc = new Scanner(System.in);
}
class Area implements Rectangle1{
    public float w,l;
    public float area;

    public void print_cal() {
        System.out.println("Enter width and length:");
        w=sc.nextFloat();
        l=sc.nextFloat();
        area=w*l;
        System.out.printf("Area of Rectangle with width %.2f and length %.2f is %.2f",w,l,area);
    }
}
class Perimeter implements Rectangle1{
    public float w,l;
    public float area;

    public void print_cal() {
        System.out.println("\nEnter width and length:");
        w=sc.nextFloat();
        l=sc.nextFloat();
        area=2 * (l+w);
        System.out.printf("Perimeter of Rectangle with width %.2f and length %.2f is %.2f",w,l,area);
    }
}

public class task_2 {
    public static void main(String[] args) {
        Area a = new Area();
        Perimeter p = new Perimeter();
        a.print_cal();
        p.print_cal();
    }
}
