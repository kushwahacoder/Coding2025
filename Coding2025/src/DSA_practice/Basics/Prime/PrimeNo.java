package DSA_practice.Basics.Prime;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        System.out.println("Prime or Not Prime");
        System.out.println("Enter a no.");
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            int check = 0;
            if(n==1){
                check=1;
                System.out.println("Niether Prime Nor Consecutive");
            }
            else {
                for (int i = 2; i * i <= n; i++) {

                    if (n % i == 0) {
                        check = 1;
                        System.out.println("Non Prime");
                        break;
                    }
                }
            }
            if (check == 0) {
                System.out.println("Prime");
            }
        }
    }
}