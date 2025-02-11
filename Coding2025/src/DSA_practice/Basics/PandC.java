package DSA_practice.Basics;

import java.util.Scanner;

public class PandC {
    public static void main(String[] args){
        System.out.println("Permutation");
        System.out.println("Enter n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter r");
        int r=sc.nextInt();
        int nfact=1;
        int rfact=1;
        int p=1;
        int c=1;
        int n_minum_r_fact=1;
        for (int i=n;i>=1;i--){
            nfact=nfact*i;
        }
        for (int i=r;i>=1;i--){
            rfact=rfact*i;
        }
        for (int i=n-r;i>=1;i--){
            n_minum_r_fact=n_minum_r_fact*i;
        }
        p=nfact/rfact;
        System.out.println("Permutation = "+p);
        c=nfact/(rfact*n_minum_r_fact);
        System.out.println("Combination = "+c);
    }
}

