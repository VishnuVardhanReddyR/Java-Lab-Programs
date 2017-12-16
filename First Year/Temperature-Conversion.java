import java.util.*;
class Celcius
{

    public static void main(String arg[])

    {
        float c;
        System.out.println("enter the temperature value");
        System.out.println("enter the 1.cecius 2.farenheight");
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        int n=reader.nextInt();
        System.out.println("Enter Temperatue ");
        float temperature=reader.nextInt();

        if(n==1)
        {
              c=((temperature)*1.8)+32;
            System.out.println("Temperatuer is"+ c);
        }
        else
        {
            c=((temperature-32)*5)/9;
            System.out.println("Temperature is " + c);
        }
    }
}
