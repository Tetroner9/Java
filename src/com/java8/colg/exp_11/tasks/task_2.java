package com.java8.colg.exp_11.tasks;
import java.util.*;

class Student
{
    Scanner sc = new Scanner(System.in);
    String student_name;
    int student_no;
    void get_student_info()
    {
        System.out.println("Name: ");
        student_name = sc.nextLine();
        System.out.println("Number: ");
        student_no = sc.nextInt();
    }
    void print_student_info()
    {
        System.out.println("\nName: "+student_name+"\nNo. "+student_no);
    }
}
class Marks extends Student
{
    float physics_marks,chemistry_marks;
    void get_subjects_info()
    {
        System.out.println("Physics Marks: ");
        physics_marks = sc.nextFloat();
        System.out.println("Chemistry Marks: ");
        chemistry_marks = sc.nextFloat();
    }
    void print_subjects_info()
    {
        System.out.println("\nPhysics: "+physics_marks+"\nChemistry: "+chemistry_marks);
    }
}
class FinalTotal extends Marks
{
    float percentage;
    void print_final_marks()
    {
        percentage = chemistry_marks + physics_marks;
        System.out.println("\n------------------------------\nFinal: "+percentage);
    }
}

public class task_2 {
    public static void main(String[] args) {
        FinalTotal s = new FinalTotal();
        s.get_student_info();
        s.get_subjects_info();
        s.print_student_info();
        s.print_subjects_info();
        s.print_final_marks();
    }
}
