package com.java8.colg.exp_10.P1;

public class A extends Thread {
    public void run()
    {
        int[] arr1 = {1,3,5,7,9};
        for(int i=0; i<5; i++)
        {
            System.out.println(arr1[i]);
            try
            {
                sleep(1000);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
