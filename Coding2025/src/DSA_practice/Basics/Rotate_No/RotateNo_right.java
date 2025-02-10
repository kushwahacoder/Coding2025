package DSA_practice.Basics.Rotate_No;

import java.util.Scanner;
import java.lang.Math;

public class RotateNo_right {
    public static void main(String[] args){
        System.out.println("Rotate a number right by k");

        System.out.println("Input no. ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Rotate Right by");
        int k=sc.nextInt();
        int temp=n;
        int digit_count=0;
        int digit=0;
        while (temp>0){
            temp=temp/10;
            digit_count++;
        }
        k=k%digit_count;
        System.out.println("input no."+n);
        for(int i=0;i<k;i++){
            digit=n%10;
            n=n/10;
            n=n+digit*(int)Math.pow(10,digit_count-1);
        }
        System.out.println("output no."+n);
    }
}

