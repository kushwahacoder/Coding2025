package DSA_practice.Basics.Fibonacci;

import java.util.Scanner;

public class fibonacci {

    public static void main(String[] args){
        System.out.println("N Fibonacci NOs");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int c=0;
        if(n==1){
            System.out.println(a);
        }
        else {
            System.out.println(a);
            System.out.println(b);
            for (int i = 0; i < n - 2; i++) {
                c=a+b;
                a=b;
                b=c;
                System.out.println(c);
            }
        }
    }
}
