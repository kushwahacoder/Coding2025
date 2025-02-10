package DSA_practice.Basics.DigitPrint;

import java.util.Scanner;

public class DigitPrintR2L {
    public static void main(String[] args){
        System.out.println("Print Digits R2L");

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int digit=0;
        while (n>0){
            digit=n%10;
            System.out.print(digit+"\t");
            n=n/10;
        }
    }
}