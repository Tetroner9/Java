package com.java8.colg.exp_11;
import java.util.*;

class InvalidException extends Exception
{
    InvalidException(String s)
    {
        super(s);
    }
}
class AgeVerification
{
    static Scanner sc = new Scanner(System.in);
    void AgeVoting(int age) throws InvalidException
    {
        if(age<18)
            throw new InvalidException("Age not valid for voting");
        else
            System.out.println("Welcome to vote");
    }
    void AgeDegree(int age) throws InvalidException
    {
        if(age<17)
            throw new InvalidException("Age not valid for degree");
        else
            System.out.println("Welcome");
    }
    void AgeMarriage(int age) throws InvalidException
    {
        System.out.println("Enter your gender:\n1.Male\n2.Female");
        int choice;
        choice=sc.nextInt();
        if((choice==1&&age<21)||(choice==2&&age<18))
            throw new InvalidException("Age not valid");
        else
            System.out.println("Welcome");
    }
}
public class AgeVoting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age,choice;
        AgeVerification av = new AgeVerification();
        System.out.println("Enter your age:");
        age=sc.nextInt();
        System.out.println("\nEnter your choice:\n1.Voting\n2.Degree\n3.Marriage");
        choice = sc.nextInt();
        switch(choice)
        {
            case 1:
                try
                {
                    av.AgeVoting(age);
                }
                catch(Exception w)
            {
                System.out.println("Exception occurred" +w);
            }
                break;
            case 2:
                try {
                    av.AgeDegree(age);
                }
                catch(Exception w)
            {
                System.out.println("Exception occurred" +w);
            }
                break;
            case 3:
                try
                {
                    av.AgeMarriage(age);
                }
                catch(Exception w)
                {
                    System.out.println("Exception occurred" +w);
                }
                break;
            default:
                System.out.println("\nWrong choice");


        }
    }
}
