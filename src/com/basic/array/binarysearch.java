package com.basic.array;
import java.util.*;

public class binarysearch {
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int n,temp;
        System.out.println("Enter no. of elements for your array");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.printf("Enter %d elements:\n",n);
        for (int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("Ascending Order:");
        for (int i=0;i<n-1;i++)
        {
            System.out.print(a[i]+",");
        }
        System.out.print(a[n-1]);

        int srch,li=0,hi=a.length-1,mi=(li+hi)/2;
        System.out.println("\nEnter element to search\n");
        srch = sc.nextInt();
        while(li<=hi)
        {
            if(a[mi]==srch)
            {
                System.out.println("Element is at "+mi+" index position");
                break;
            }
            else if(a[mi]<srch)
            {
                li=mi+1;
            }
            else
            {
                hi=mi-1;
            }
            mi=(li+hi)/2;

        }
        if(li>hi)
        {
            System.out.println("Element not found");
        }
    }
}
