package DSA_practice.Basics.Patterns.NumberPattern;

import java.util.Scanner;

// Fibonacci Triangle
//0
//1  1
//2  3  5
//8  13  21  34
//55  89  144  233  377



public class Pattern12 {
    public static void main(String[] args){
        System.out.println("This is Pattern 12");
        System.out.println("Enter No of Rows");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int c;
        for(int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                System.out.print(a+"  ");
                c=a+b;
                a=b;
                b=c;
            }
            System.out.println();

        }
    }
}
