package DSA_practice.Basics.Patterns.StarPattern;

import java.util.Scanner;

/*

                 *
            *
        *
    *
 *

 */


public class Pattern8_II {
    public static void main(String[] args){
        System.out.print("This is Pattern8_II");
        System.out.println("Enter no. of rows");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sp=n-1;
        for (int i =0;i<n;i++){
//            System.out.println(sp+" , "+"*");
            for (int j=0;j<sp;j++){
                System.out.print("\t");
            }
            System.out.print("*");
            sp--;
            System.out.println();
        }
    }
}
