package DSA_practice.Basics.Functions.NumberConversion;

import java.util.Scanner;

public class Anybase_to_Decimnal{
    public static void main(String[] args){
        System.out.println("Any base to decimal number conversion");
        System.out.println("Enter Number");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("Enter Base");
        int b=sc.nextInt();
        int num=Convert(n,b);
        System.out.println(num);
    }
    public static int Convert(int n,int b){
        int p=1;
        int digit=0;
        while (n>0){
            digit=digit+(n%10)*p;
            n=n/10;
            p=p*b;
        }
        return digit;
    }
}
