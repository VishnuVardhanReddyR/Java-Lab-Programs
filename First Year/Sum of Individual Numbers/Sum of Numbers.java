import java.util.*;

class sum {

//    public static void main(String arg[])
//    {
//
// //   System.out.println("Enter the numbers");
////    Scanner product= new Scanner(System.in);
////    int n= product.nextInt();
//     int n=123;
//    int temp=0,res=0;
//    while(n>0)
//    {
//    res=n/10;
//    temp=res+temp;
//    n=n%10;
//    }
//    System.out.println("Sum is " + temp);
//    }
//    }




    public static void main(String[] args) {
        int num = 321345;
        int sum = 0;
        while (num > 0) {
            sum = (sum + num) % 10;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
