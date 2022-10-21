import java.applet.*;
import java.awt.*;
public class gg extends Applet
{
    public void init()
    { Frame f=new Frame("Control Example");
        Button b=new Button("Click Here");
        b.setBounds(50,100,80,30);
        f.add(b);

        Label l1=new Label("First Label.");
        l1.setBounds(50,150, 100,30);
        f.add(l1);



        TextField t1=new TextField();
        t1.setBounds(50,200, 200,30);
        f.add(t1);

        TextArea area=new TextArea();
        area.setBounds(50,250, 200,100);
        f.add(area);

        Checkbox checkbox1 = new Checkbox("C");
        checkbox1.setBounds(200,100, 50,20);
        Checkbox checkbox2 = new Checkbox("Java", true);
        checkbox2.setBounds(200,150, 50,20);
        f.add(checkbox1);
        f.add(checkbox2);



        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox checkBox1 = new Checkbox("Applet", cbg, false);
        checkBox1.setBounds(300,100, 100,20);
        Checkbox checkBox2 = new Checkbox("Application", cbg, true);
        checkBox2.setBounds(300,150, 100,20);
        f.add(checkBox1);
        f.add(checkBox2);

        Choice c=new Choice();
        c.setBounds(50,400, 75,75);
        c.add("Item 1");
        c.add("Item 2");
        c.add("Item 3");
        f.add(c);


        List l=new List();
        l.setBounds(150,400, 75,75);
        l.add("Item 1");
        l.add("Item 2");
        l.add("Item 3");
        l.add("Item 4");
        f.add(l);
        f.setSize(500,500); //setting size of frame
        f.setLayout(null); //setting layout of frame
        f.setVisible(true);
    }
}
/*<applet code="ControlExample.class" width="300" height="400"> </applet> */