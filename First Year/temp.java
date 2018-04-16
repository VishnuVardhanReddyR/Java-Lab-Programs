import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class TextRead extends JFrame{

    public TextRead() throws IOException
    {
        setSize(400,700);

        //FlowLayout f= new FlowLayout();
        //setLayout(f);
        GridLayout g=new GridLayout(0,3);
        setLayout(g);


        FileInputStream fin= new FileInputStream("https://192.168.0.9/hell.txt");
        Scanner sc =new Scanner(fin).useDelimiter(",");
        //System.out.println(sc);
        String arry[];
        String s2;
        while(sc.hasNextLine())
        {

            s2=sc.nextLine();
            arry=s2.split(",");
            for(String i:arry)
            {
                JLabel jb=new JLabel(i);

                add(jb);

            }//for
        }//while


        pack();
        setVisible(true);

    }//read()



}



public class TestDemo {

    public static void main(String x[]) throws IOException
    {

        TextRead tr= new TextRead();

    }
}

