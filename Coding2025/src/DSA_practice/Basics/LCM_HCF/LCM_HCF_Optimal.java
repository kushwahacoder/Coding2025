package DSA_practice.Basics.LCM_HCF;

import java.util.Scanner;

public class LCM_HCF_Optimal {
    public static void main(String[] args){
        System.out.println("Optimal Lcm Hcf");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st No. ");
        int n1=sc.nextInt();
        System.out.println("Enter 2nd No. ");
        int n2=sc.nextInt();
        int gcd=0;
        int lcm=0;
        int temp_n2=n2;
        int temp_n1=n1;
        while (n1%n2!=0){
            int rem=n1%n2;
            n1=n2;
            n2=rem;
        }
        gcd=n2;
        System.out.println("GCD is "+gcd);

//        we know that Lcm*hcf=n1*n2;
        lcm=(temp_n2*temp_n1)/gcd;

        System.out.println("LCM is "+lcm);

    }
}
