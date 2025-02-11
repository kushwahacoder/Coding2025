package DSA_practice.Basics.Functions.NumberConversion;

import java.util.Scanner;

public class DecimalToAnyBase {
    public static void main(String[] args){
        System.out.println("Number Conversion");
        System.out.println("Enter no in base 10");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter base");
        int b=sc.nextInt();
        int num=Convert(n,b);
        System.out.println(num);

    }
    /*
    public static int Convert(int n,int b){
        int digits=0;
        int i=0;
        int num=0;
        while (n>0){
            digits=n%b;
            num=digits*(int)Math.pow(10,i++)+num;
            n=n/b;
        }
        return num;
    }
*/
    public static int Convert(int n,int b){
        int digits=0;
        int p=1;
        int num=0;
        while (n>0){
            digits=n%b;
            num=digits*p+num;
            n=n/b;
            p=p*10;
        }
        return num;
    }

}
