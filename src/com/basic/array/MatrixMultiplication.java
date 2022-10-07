package com.basic.array;
import java.util.*;

public class MatrixMultiplication {
    public static void main(String args[]) {
        int sum=0,i,j,k;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows and columns for first matrix\n");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int a[][]= new int[m][n];


        System.out.println("Enter first matrix\n");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter no. of rows and columns for second matrix\n");
        int p=sc.nextInt();
        int q=sc.nextInt();



        if (n!=p)
        {
            System.err.println("\nMatrix cannot be multiplied");
        }
        else
        {
            int b[][]= new int [p][q];
            int ans[][]= new int [m][q];
            System.out.println("\nEnter second matrix\n");

            for(i=0;i<p;i++)
            {
                for(j=0;j<q;j++)
                {
                    b[i][j]=sc.nextInt();
                }
            }

            for(i=0;i<m;i++)
            {
                for(j=0;j<q;j++)
                {
                    for(k=0;k<p;k++)
                    {
                        sum = sum + a[i][k]*b[k][j];
                    }
                    ans[i][j]=sum;
                    sum=0;
                }
            }
            System.out.println("Multiplication of matrix is");
            for (i=0;i<m;i++)
            {
                for(j=0;j<q;j++)
                {
                    System.out.print(ans[i][j]+"\t");


                }
                System.out.print("\n");
            }
        }

    }
}
