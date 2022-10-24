package com.java8.colg.exp_10.tasks;
import java.util.*;

class Employee
{
    String employee_name;
    int employee_id;
    Scanner sc = new Scanner(System.in);
    void get_employee_info()
    {

        System.out.println("Enter Employee Name: ");
        employee_name = sc.nextLine();
        System.out.println("Enter ID: ");
        employee_id = sc.nextInt();
        sc.nextLine();
    }
    void print_employee_info()
    {
        System.out.println("Name: "+employee_name+"\nID: "+employee_id);
    }
}
class Department extends Employee
{
    String department_name;
    int department_no;
    void get_department_info()
    {

        System.out.println("Enter Department Name: ");
        department_name = sc.nextLine();
        System.out.println("Number: ");
        department_no = sc.nextInt();
        sc.nextLine();
    }
    void print_department_info()
    {
        System.out.println("Name: "+department_name+"\nNo: "+department_no);
    }
}

public class task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Department d1 = new Department();

        int choice;
        char ch='y';

        while (ch=='y')
        {
            System.out.println("Enter your choice:\n1.Enter Department Info\n2.Enter Employee Info\n3.Print Department Info\n4.Print Employee Info");
            choice = sc.nextInt();
            switch (choice)
            {
                case 1:
                    d1.get_department_info();
                    break;
                case 2:
                    d1.get_employee_info();
                    break;
                case 3:
                    d1.print_department_info();
                    break;
                case 4:
                    d1.print_employee_info();
                    break;
                default:
                    System.out.println("Wrong Choice!");
            }
            System.out.println("Would you like to continue? y or n");
            ch = sc.next().charAt(0);
        }
    }
}
