package DSA_practice.Basics.Patterns.StarPattern;

import java.util.Scanner;

//            *
//         *  *
//      *  *  *
//   *  *  *  *
//*  *  *  *  *

public class Pattern3_II {
    public static void main(String [] args){
        System.out.println("This is Pattern3 by sp st method");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sp=n-1;
        int st=1;
        for(int i=0;i<n;i++){
            for (int j=0;j<sp;j++){
                System.out.print("   ");
            }
            for (int j=0;j<st;j++){
                System.out.print("*  ");
            }
            System.out.println();
            sp--;
            st++;
        }
    }
}
