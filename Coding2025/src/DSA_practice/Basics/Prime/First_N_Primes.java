package DSA_practice.Basics.Prime;

import java.util.Scanner;

public class First_N_Primes {
    public static void main(String[] args){
        System.out.println("Print first N prime No.");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("these are first "+n+" Prime NOs.");
        int count=1;
        int check=0;
        int j=2;
        while (count<=n){
            for (int i=2;i*i<=j;i++){
                if(j%i==0){
                    check++;
                    break;
                }
            }
            if(check==0){
                System.out.println(j);
                count++;
            }
            j++;
            check=0;
        }
    }
}
