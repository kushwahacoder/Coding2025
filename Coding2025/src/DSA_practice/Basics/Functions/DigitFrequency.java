package DSA_practice.Basics.Functions;

import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args){
        System.out.println("count the frequency of a particular digit");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int n=sc.nextInt();
        System.out.println("Enter Digit");
        int d=sc.nextInt();
        int freq=Freq(n,d);
        System.out.println("frequency = "+freq);
    }
    public static int Freq(int n,int d){
        int count=0;
        while (n>0){
            int digit=n%10;
            n=n/10;
            if(d==digit){
                count++;
            }
        }
        return count;
    }
}
