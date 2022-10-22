package com.java8.colg.exp_7_8.tasks_7;
import java.util.*;

abstract class Shape{
    float a,b;
    abstract public void printarea();
    Scanner sc=new Scanner(System.in);
}
class Square extends Shape{

    public float area_sq;
    public void printarea() {
        System.out.println("Enter side of square:");
        a=sc.nextFloat();
        area_sq=a*a;
        System.out.printf("Area of Square with side %.2f is %.2f",a,area_sq);
    }
}

class Rectangle extends Shape{
    public float area_rec;


    public void printarea() {
        System.out.println("\nEnter length and breadth of rectangle:");
        a=sc.nextFloat();
        b=sc.nextFloat();
        area_rec=a*b;
        System.out.printf("Area of Rectangle with length %.2f & breadth %.2f is %.2f",a,b,area_rec);
    }
}

class Circle extends Shape{
    public double area_cir;

    @Override
    public void printarea() {
        System.out.println("\nEnter radius of circle:");
        a=sc.nextFloat();
        area_cir=Math.PI*a*a;
        System.out.printf("Area of Circle with radius %.2f is %.2f",a,area_cir);
    }
}

public class task_1 {
    public static void main(String[] args) {
        Square s = new Square();
        Rectangle r = new Rectangle();
        Circle c = new Circle();
        s.printarea();
        r.printarea();
        c.printarea();

    }
}
