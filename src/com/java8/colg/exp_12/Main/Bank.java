package com.java8.colg.exp_12.Main;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Bank extends Applet implements ActionListener {
    Label title, name,aadharcard, mobileno,gender,address,email,maritalstatus, nationality,account,status;
    TextField t1,t2,t3,t4,t5,t6,t7;
    Button submit;
    public void init()
    {

        title=new Label("Registration Form");
        name=new Label("Enter your name:");
        account=new Label("Enter your account type:");
        aadharcard=new Label("Enter your aadharcard:");
        mobileno=new Label ("Enter your mobileno:");
        gender=new Label ("Enter your gender:");
        CheckboxGroup cbg1 = new CheckboxGroup();
        Checkbox checkbox1 = new Checkbox("male",cbg1,true);
        checkbox1.setBounds(200,100, 50,20);
        Checkbox checkbox2 = new Checkbox("female",cbg1,false);
        checkbox2.setBounds(200,150, 50,20);

        address=new Label ("Enter your address:");
        email=new Label ("Enter your email:");
        maritalstatus=new Label ("Enter your maritalstatus:");
        CheckboxGroup cbg2 = new CheckboxGroup();
        Checkbox checkbox3 = new Checkbox("married",cbg2,true);
        checkbox3.setBounds(200,200, 50,20);
        Checkbox checkbox4 = new Checkbox("unmarried",cbg2,true);
        checkbox4.setBounds(200,250, 50,20);

        nationality=new Label ("Enter your nationality:");
        CheckboxGroup cbg3 = new CheckboxGroup();
        Checkbox checkbox5 = new Checkbox("Yes",cbg3,true);
        checkbox5.setBounds(200,200, 50,20);
        Checkbox checkbox6 = new Checkbox("No",cbg3,false);
        checkbox6.setBounds(200,250, 50,20);

        status=new Label();
        t1=new TextField();
        t2=new TextField();
        t3=new TextField();
        Checkbox c1=new Checkbox();
        Checkbox c2=new Checkbox();
        t4=new TextField();
        t5=new TextField();
        t6=new TextField();
        t7=new TextField();
        Checkbox c3=new Checkbox();
        Checkbox c4=new Checkbox();

        submit=new Button("Submit");
        add(title);
        add(name);
        add(t1);
        add(aadharcard);
        add(t2);
        add(account);
        add(t3);
        add(mobileno);
        add(t4);
        add(gender);
        add(checkbox1);
        add(checkbox2);
        add(address);
        add(t5);
        add(email);
        add(t6);
        add(nationality);
        add(checkbox5);
        add(checkbox6);
        add(maritalstatus);
        add(checkbox3);
        add(checkbox4);
        add(submit);
        add(status);
        submit.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        String s=e.getActionCommand();
        if(s.equals("Submit"))
            status.setText("Form Submitted ");


    }
}
/*<applet code=Bank.class" width = 500 height = 500>
</applet>
 */
