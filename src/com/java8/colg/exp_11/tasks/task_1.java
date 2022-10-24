package com.java8.colg.exp_11.tasks;
import java.util.*;

class NameLimit extends Exception
{
    public NameLimit(String s)
    {
        super(s);
    }
}
class CustomException
{

    void LetterLimit(String s) throws NameLimit
    {
        int s_length = s.length();
        if (s_length>10)
            System.out.println("Name should be less than 10 letters!");
        else
            System.out.println("Welcome");
    }
}
public class task_1 {
    public static void main(String[] args) throws NameLimit {
        Scanner sc = new Scanner(System.in);
        CustomException ce = new CustomException();
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        ce.LetterLimit(name);
    }
}
