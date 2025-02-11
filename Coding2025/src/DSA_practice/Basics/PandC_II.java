package DSA_practice.Basics;

import java.util.Scanner;

public class PandC_II {
    public static void main(String[] args){
        System.out.println("Permutation");
        System.out.println("Enter n");
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        System.out.println("Enter r");
        int r=sc.nextInt();
        int rfact=1;
        int p=1;
        int c=1;

        for (int k=m;k>m-r;k--){
            p=p*k;
        }
        for (int k=r;k>=1;k--){
            rfact=rfact*k;
        }
        System.out.println("rfact"+rfact);
        System.out.println("Permutation = "+p);
        c=p/rfact;
        System.out.println("Combination = "+c);
    }

}
