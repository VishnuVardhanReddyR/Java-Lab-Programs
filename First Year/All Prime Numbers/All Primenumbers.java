import java.util.*;

class prime {
    public static void main(String arg[]) {
        int n = 17, i, j,m=0,r=0,s=0,num=0,number=1;
        for(j=1;j<=n;j++)
        {
            number++;
            m=0;
        for (i = 1; i <=number; i++)
        {
            if (number % i == 0)
                {
                    m ++;
                    System.out.println(m);
                }

            }
            if (m ==2) {
                System.out.println("its is not prime" + number);
            }
        }

        }
    }
