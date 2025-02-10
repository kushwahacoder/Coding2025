package DSA_practice.Basics.LCM_HCF;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        System.out.println("Enter 1st No. ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        System.out.println("Enter 2nd No. ");
        int n2 = sc.nextInt();
        int large=0;
        int small=0;
        int gcd=0;
        if(n1>n2){
            large=n1;
            small=n2;
        }
        else {
            large = n2;
            small = n1;
        }
        int rem=1;
        while(rem!=0){
            rem=large%small;
            large=(large/small)*small;
            gcd=small;
            small=rem;
        }
        System.out.println("GCD is "+gcd);
    }
}
