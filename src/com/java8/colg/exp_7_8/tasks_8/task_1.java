package com.java8.colg.exp_7_8.tasks_8;
import java.util.*;

class MethodOverloading{
    void area(float s){
        System.out.printf("\nArea of Square with side %.2f is %.2f",s,(s*s));
    }

    void area(float w, float l){
        System.out.printf("\nArea of Rectangle with width %.2f & length %.2f is %.2f",w,l,(w*l));
    }
}

public class task_1 {
    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of square");
        float s=sc.nextFloat();
        mo.area(s);
        System.out.println("\nEnter width and length of rectangle");
        float w=sc.nextFloat();
        float l= sc.nextFloat();
        mo.area(w,l);
    }
}
