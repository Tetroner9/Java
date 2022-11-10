package com.java8.colg.exp_12.tasks;
import java.awt.*;
import java.applet.*;


public class House extends Applet {
    public void paint(Graphics g)
    {
        g.setColor(Color.red);
        int[] xs = {100,160,220};
        int[] ys = {100,50,100};
        Polygon poly=new Polygon(xs,ys,3);
        g.fillPolygon(poly);

        // Draw the body of house
        g.setColor(Color.blue);
        g.fillRect(100,100,120,120);

        // draw the door
        g.setColor(Color.white);
        g.fillRect(145,160,30,60);

        // draw sun
        g.setColor(Color.yellow);
        g.fillOval(240,30,50,50);

        //draw chimney
        g.setColor(Color.black);
        g.fillRect(120,55,10,30);
    }
}
/*<applet code ="House" width=600 height=600>
</applet>*/
