package DSA_practice.Basics.LCM_HCF;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        System.out.println("Enter 1st No. ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int temp_n1=n1;
        System.out.println("Enter 2nd No. ");
        int n2 = sc.nextInt();
        int temp_n2=n2;

        while (true) {
            if (n1 > n2) {
                n1 = n1 +temp_n1;
                if (n1 % n2 == 0) {
                    System.out.println(n1);
                    break;
                }
            }
            if (n2 > n1) {
                n2 = n2 +temp_n2;
                if (n2 % n1 == 0) {
                    System.out.println(n2);
                    break;
                }
            }
        }
    }
}