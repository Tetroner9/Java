package com.java8.colg.exp_9.tasks;
import java.util.*;

 class Employee
{
    Scanner sc = new Scanner(System.in);
    public int Emp_ID;
    public float Emp_salary;
    public String Emp_name;

    void displaydata()
    {
        System.out.println("Employee Info\nID:"+Emp_ID);
        System.out.println("Name:"+Emp_name);
        System.out.println("Salary:"+Emp_salary);
    }
    Employee(String name,float salary,int ID)
    {
        System.out.println("Enter Employee Info");
        System.out.println("ID");
        Emp_ID=sc.nextInt();
        System.out.println("Name");
        Emp_name=sc.next();
        System.out.println("Salary");
        Emp_salary=sc.nextFloat();
    }

}


public class task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee e1 = new Employee(null,0,0);
        e1.displaydata();
        sc.close();
    }
}
