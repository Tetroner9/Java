package com.java8.colg.exp_10.P2;

public class B extends Thread {
    public void run()
    {
        int[] arr2 = {2,4,6,8,10};
        for(int i=0; i<5; i++)
        {
            System.out.println(arr2[i]);
            try
            {
                sleep(1200);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
