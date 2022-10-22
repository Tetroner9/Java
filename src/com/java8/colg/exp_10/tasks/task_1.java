package com.java8.colg.exp_10.tasks;

class A
{
    void m1()
    {
        System.out.println("m1 method of Class A");
    }
}
class B extends A
{
    void m1()
    {
        System.out.println("m1 method of Class B");
    }
}
class C extends A
{
    void m1()
    {
        System.out.println("m1 method of Class c");
    }
}

public class task_1 {
    public static void main(String[] args) {
        A a1 = new A();
        B b1 = new B();
        C c1 = new C();
        A ref;
        ref = a1;
        ref.m1();
        ref = b1;
        ref.m1();
        ref = c1;
        ref.m1();

    }
}
