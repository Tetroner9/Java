package com.java8.colg.exp_7_8.Main;
import java.util.*;

public class  Temperature_Conversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double c,f,k,ans;
        int choice;
        char cam='y';
        System.out.println("Enter Celsius, Fahrenheit & Kelvin");
        c=sc.nextFloat();
        f=sc.nextFloat();
        k=sc.nextFloat();

        while(cam=='y')
        {
            System.out.println("Enter your choice:\n1.Celsius-->Fahrenheit\n2.Celsius-->Kelvin\n3.Fahrenheit-->Celsius\n4.Fahrenheit-->Kelvin\n5.Kelvin-->Celsius\n6.Kelvin-->Fahrenheit");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    ans=(c*9/5)+32;
                    System.out.println("\nAnswer="+ans);
                    break;
                case 2:
                    ans=c+273.15;
                    System.out.println("\nAnswer="+ans);
                    break;
                case 3:
                    ans=(f-32)*5/9;
                    System.out.println("\nAnswer="+ans);
                    break;
                case 4:
                    ans=(f-32)*5/9+273.15;
                    System.out.println("\nAnswer="+ans);
                    break;
                case 5:
                    ans=k-273.15;
                    System.out.println("\nAnswer="+ans);
                    break;
                case 6:
                    ans=(k-273.15)*9/5+32;
                    System.out.println("\nAnswer="+ans);
                    break;
                default:
                    System.out.println("\nWrong Choice");
                    break;
            }
            System.out.println("Do you wish to proceed? y or n");
            cam=sc.next().charAt(0);
        }
    }
}
