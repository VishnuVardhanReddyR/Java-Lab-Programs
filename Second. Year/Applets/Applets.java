import java.aws.*;
import java.applet.Applet;
import java.awt.event.*;

public class Applets extends Applets implements ActionListerner
{
    Text Feild =t1,t2;
    Label=l1,l2;
    button=b1;
    int fact=1,n=0,i;
    public void init()
    {
        e=this;
        t1=new TextFeild;
        t2=new TextFeild;
        l1=new Label("Factorial Number");
        l2=new Label("Enter The Number");
        l3=new Label("Factorial is ");
        b1=new Button("Compute");
        add(l1);
        add(t1);add(l2);add(t2);add(b1);add(l3);

    }
}