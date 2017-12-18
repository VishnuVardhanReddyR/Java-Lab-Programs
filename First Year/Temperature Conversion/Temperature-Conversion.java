import java.util.*;
class Celcius
{

    public static void main(String arg[])

    {
        float Resultant-Teamperatue;
        System.out.println("enter the temperature value");
        System.out.println("enter the 1.cecius 2.farenheight");
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        int n=reader.nextInt();
        System.out.println("Enter Temperatue ");
        float temperature=reader.nextInt();

        if(n==1)
        {
              Resultant-Teamperatue=((temperature)*1.8)+32;
            System.out.println("Temperatuer is"+ Resultant-Teamperatue);
        }
        else
        {
            Resultant-Teamperatue=((temperature-32)*5)/9;
            System.out.println("Temperature is " + Resultant-Teamperatue);
        }
    }
}
