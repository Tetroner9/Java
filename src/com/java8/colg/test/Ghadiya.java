package com.java8.colg.test;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Ghadiya extends Applet implements ActionListener {
    Label title, name, address, status, DOB, gender, aadhaar_no ;
    TextField t1,t2;
    Button submit;
    public void init()
    {
        title=new Label("Bank Registration Form");
        name=new Label("Name:");
        address=new Label ("Address:");
        status=new Label();
        TextArea t1 = new TextArea();
        t2=new TextField();
        submit=new Button("Submit");



        add(title);
        add(name);
        t1.setBounds(20,200,200,10);
        add(t1);
        add(address);
        add(t2);
        add(submit);
        add(status);
        submit.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        String s=e.getActionCommand();
        if(s.equals("Submit"))
            status.setText("Welcome "+t1.getText()+"!! ");
    }
}
/* <applet code="GUI.class" width=400 height=400> </applet> */