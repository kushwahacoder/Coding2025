package DSA_practice.Basics.Fibonacci;

import java.util.Scanner;

public class Fibonacci_Optimal {
    public static void main(String[] args){
        System.out.println("Fibonacci Nos.");

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int c=0;
        for (int i=0;i<n;i++){
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }
    }
}
