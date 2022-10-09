package com.java8.colg.exp_9_10_main;
import java.util.*;
import java.text.*;

class Product{
    public long ID;
    public String prod_name;
    public int prod_quant;
    public float rate;
    public float tot_qty;

    public Product(long iD2, String prod_name2, int prod_quant2, float rate2, float tot_qty2) {
        ID = iD2;
        prod_name = prod_name2;
        prod_quant = prod_quant2;
        rate  = rate2;
        tot_qty = tot_qty2;
        // TODO Auto-generated constructor stub
    }
    void displayhead() {
        System.out.println("ID\t\t\t|\t\t\tName\t\t\t|\t\t\tQty.\t\t\t|\t\t\tRate\t\t\t|\t\tTot.Amount");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------");


    }
    void displayProduct() {
        System.out.println(ID+"\t\t\t\t"+prod_name+"\t\t\t\t\t\t\t"+prod_quant+"\t\t\t\t\t\t\t"+rate+"\t\t\t\t\t\t\t\t"+tot_qty+"\t\t\t\t\t\t");

    }
}

public class ShopBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product p = new Product(1, null, 0, 0, 0);


        char ch = 'y';
        ArrayList <Product> p1= new ArrayList<>();
        float final_am=0;
        long ID = 0;
        String prod_name;
        int prod_quant;
        float rate;
        float tot_qty;

        do {


            ID=ID + 1;
            System.out.println("ID: "+ID);
            System.out.println("Enter product name");
            prod_name=sc.next();
            System.out.println("Enter product quantity");
            prod_quant=sc.nextInt();
            System.out.println("Enter rate");
            rate = sc.nextFloat();

            tot_qty=rate * prod_quant;

            p1.add(new Product(ID,prod_name,prod_quant,rate,tot_qty));
            final_am+=tot_qty;


            System.out.println("Do you want to add new product? y or n");
            ch = sc.next().charAt(0);

        }
        while(ch=='y');


        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println("Date: "+formatter.format(date));

        p.displayhead();
        for(Product pr : p1) {
            pr.displayProduct();
        }
        System.out.println("-------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\nFinal(Without Tax):"+final_am);


        double final_amount = (final_am * 0.15) + final_am;

        System.out.println("\nFinal(With 15% Tax):"+final_amount);
        sc.close();
    }
}
