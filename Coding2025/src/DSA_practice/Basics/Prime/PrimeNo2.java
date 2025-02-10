package DSA_practice.Basics.Prime;

import java.util.Scanner;

public class PrimeNo2 {
    public static void main(String[] aarg) {
        System.out.println("Prime or Not Prime");
        System.out.println("Enter a No.");
        while (true) {
            Scanner sc = new Scanner(System.in);
            int count = 0;
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println("Prime");
            } else {
                System.out.println("Non Prime");
            }
        }

    }
}
