package DSA_practice.Basics.DigitPrint;

import java.util.Scanner;
import java.lang.Math;

public class PrintDigitsL2R {
    public static void main(String[] args){
        System.out.println("Print Digits L2R");

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int digit_count=0;
        int digit=0;
        int n_cpy=n;

        while (n_cpy>0){
            n_cpy=n_cpy/10;
            digit_count++;
        }

        for(int i=0;i<digit_count;i++){
            digit=(int)(n/Math.pow(10,digit_count-1-i));
            System.out.print(digit+" ");
            n=n%(int)Math.pow(10,digit_count-1-i);
        }
    }
}
