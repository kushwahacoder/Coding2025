package DSA_practice.Basics.Patterns;

import java.util.Scanner;

/*

 *
    *
        *
            *
                *

 */

public class Pattern7_II {

    public static void main(String[] args){
        System.out.print("This is Pattern7_II");
        System.out.println("Enter no. of rows");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sp=0;
        for (int i =0;i<n;i++){
//            System.out.println(sp+" , "+"*");
            for (int j=0;j<sp;j++){
                System.out.print("\t");
            }
            System.out.print("*");
            sp++;
            System.out.println();
        }
    }
}
