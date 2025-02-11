package DSA_practice.Basics.Patterns.NumberPattern;

import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args){
        System.out.println("This is number pattern ");
        System.out.println("Enter no of rows");
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int num=1;
        for (int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                System.out.print(num+"\t");
                num++;
            }
            System.out.println();
        }
    }
}
