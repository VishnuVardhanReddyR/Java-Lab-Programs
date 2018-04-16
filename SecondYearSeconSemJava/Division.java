package Javalab;
import java.applet.*;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.*;

public class Factorial extends Applet implements ActionListener

{

    TextField t1,t2,t3;
    Button b;
    Label l1,l2,l3;

    public void init()
    {
        t1 =new TextField(10);
        t2=new TextField(10);
        t3=new TextField(10);
        b=new Button("Calculate");
        l1=new Label("FirstNumber");
        l2=new Label("Second Number");
        l3=new Label("Result");
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b);
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        try{
            int s1=Integer.parseInt(t1.getText());
            int s2=Integer.parseInt(t2.getText());
            String  s3;
            s3=""+s1/s2;

            t3.setText(s3);

        }
        catch(Exception q)
        {
            System.out.print(q);
        }
    }

}
