package DSA_practice.Basics.Prime;

import java.util.Scanner;

public class PrimeNo3_Optimised {
    public static void main(String[] args) {
        System.out.println("Optimised Prime");
        System.out.println("Enter No.");
        while (true) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            if (n == 1) {
                System.out.println("Niether");
            } else {
                int count = 0;
                for (int i = 2; i * i <= n; i++) {
                    if (n % i == 0) {
                        count++;
                        break;
                    }
                }
                if (count == 0) {
                    System.out.println("Prme");
                } else {
                    System.out.println("Non prime");
                }
            }
        }
    }
}

/*36
* 1*36          36*1
* 2*18          18*2
* 3*12          12*3
* 4*9           9*4
* 6*6
* if not divided till root then its prime
* */