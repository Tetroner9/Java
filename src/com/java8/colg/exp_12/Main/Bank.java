package com.java8.colg.exp_12.Main;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Bank extends Applet implements ActionListener {
    Label FullName,Gender,Age,MobileNo,ResidentialAddress,PanNo,AccountType,AccountNo,status;
    TextField tFullName,tGender,tAge,tMobileNo,tResidentialAddress,tPanNo,tAccountType,tAccountNo;
    Button submit;
    public void init()
    {
        FullName=new Label("Enter your name: ");
        Gender=new Label("Enter your gender:");
        Age=new Label ("Enter your age:");
        MobileNo=new Label("Enter your mobile number:");
        ResidentialAddress=new Label("Enter your Residential Address:");
        PanNo= new Label("Enter your Pan No:");
        AccountType= new Label("Enter your Accoutnt type:");
        AccountNo= new Label("Enter your Account no:");
        status=new Label();
        tFullName=new TextField();
        tGender=new TextField();
        tAge=new TextField();
        tMobileNo=new TextField();
        tResidentialAddress=new TextField();
        tPanNo=new TextField();
        tAccountType=new TextField();
        tAccountNo=new TextField();
        submit=new Button("Submit");
        add(FullName);
        add(tFullName);
        add(Gender);
        add(tGender);
        add(Age);
        add(tAge);
        add(MobileNo);
        add(tMobileNo);
        add(ResidentialAddress);
        add(tResidentialAddress);
        add(PanNo);
        add(tPanNo);
        add(AccountType);
        add(tAccountType);
        add(AccountNo);
        add(tAccountNo);
        add(submit);
        add(status);
        submit.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String s=e.getActionCommand();
        if(s.equals("Submit"))
            status.setText("Submitted!");
    }
}
/* <applet code="BankForm.class" width=400 height=400> </applet> */