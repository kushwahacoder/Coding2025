package DSA_practice.Basics.Patterns.StarPattern;

import java.util.Scanner;

//*	*	*	*	*
//	*	*	*	*
//		*	*	*
//			*	*
//				*

public class Pattern4 {

    public static void main(String[] args){
        System.out.println("Pattern 4 ");

        System.out.println("Enter no of rows");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sp=0;
        int st=n;

        for (int i=0;i<n;i++){
//            System.out.println(sp+" , "+st);
            for (int j=0;j<sp;j++){
                System.out.print("\t");
            }
            for (int j=0;j<st;j++){
                System.out.print("*\t");
            }
            System.out.println();
            sp++;
            st--;
        }
    }
}
