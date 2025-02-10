package DSA_practice.Basics.Rotate_No;

import java.util.Scanner;

public class RotateNo_left {
    public static void main(String[] args){
        System.out.println("Rotate a number left by k");

        System.out.println("Input no. ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Rotate Left by");
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
            digit=n/(int)Math.pow(10,digit_count-1);
            n=n%(int)Math.pow(10,digit_count-1);
            n=n*10+digit;
        }
        System.out.println("output no."+n);
    }
}
