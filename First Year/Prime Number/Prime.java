import java.util.*;

        class prime {
            public static void main(String arg[]) {
                int number = 19, m, i;
                m = number / 2;
                for (i = 2; i < number; i++) {
                    if (number % i == 0) {
                        m = 3;
                        System.out.println(i);
                    }

                }
                if (m == 3)
                    System.out.println("its is not prime");

                else
                    System.out.println("it is prime" +number);
            }
        }