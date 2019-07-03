package java_industrial.chapter_001;


import java.awt.*;
import java.util.Calendar;

public class FirstApplet extends javax.swing.JApplet {

    private Calendar calendar;

    public void init()
    // TODO Auto-generated method stub
    {
        calendar = Calendar.getInstance();
        setSize(250,80);
    }

    public void paint(Graphics g) {
        g.drawString("Àïïëåò çàïóùåí:", 20, 15);
        g.drawString(calendar.getTime().toString(), 20, 35);

    }


}
