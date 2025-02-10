package DSA_practice.Basics.DigitPrint;

import java.util.Scanner;
import java.lang.Math;

public class PrintDigitL2R_2 {
    public static void main(String[] args){
        System.out.println("Print Digit L2R");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int digit=0;
        int temp=n;
        int digit_count=0;
        while (temp>0){
            temp=temp/10;
            digit_count++;
        }
        int div=(int)Math.pow(10,digit_count-1);
        while(div>0){
            digit=n/div;
            System.out.print(digit+" ");
            n=n%div;
            div=div/10;
        }
    }
}
