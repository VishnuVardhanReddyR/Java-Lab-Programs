import java.util.*;
class sol{
    public static void main(String arg[])
    {
        Scanner sol=new Scanner(System.in);
        System.out.println("enter the First Variable");
        int Firstval=sol.nextInt();
        System.out.println("Enter the Second Value");
        int Secondval=sol.nextInt();
        float R;
        System.out.println("Enter your CHoice");

        int Choice=sol.nextInt();
        switch (Choice)
        {
            case 1:R=Firstval+Secondval;
                System.out.println(R);
        break;
            case 2:R=Firstval-Secondval;
                System.out.println(R);
        break;
            case 3:R=Firstval*Secondval;
                System.out.println(R);
                break;
            case 4:R=Firstval/Secondval;
                System.out.println(R);
                break;
        default:
            System.out.println("Invalid");
        }
    }
}