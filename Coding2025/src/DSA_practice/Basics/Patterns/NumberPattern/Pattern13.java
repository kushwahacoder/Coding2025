package DSA_practice.Basics.Patterns.NumberPattern;

import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args){
        System.out.println("This is Pattern 13");
        System.out.println("Enter no. of rows");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                int rfact=1;
                int p=1;
                int c=1;
                for (int k=i;k>i-j;k--){
                    p=p*k;
                }
                for (int k=j;k>=1;k--){
                    rfact=rfact*k;
                }
                c=p/rfact;
                System.out.print(c+"\t");
            }
            System.out.println();
        }
    }
}





