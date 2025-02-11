package DSA_practice.Basics.Patterns;

import java.util.Scanner;

/*

        *
    *	   	*
 *				*
    *	    *
        *


*/

public class Pattern10 {
    public static void main(String[] args){
        System.out.println("This is Pattern5");
        System.out.println("Enter no of rows");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int sp=n/2;
        int sp2=0;
        for (int i=0;i<n;i++) {
//            System.out.print(sp + " , " + "*" + " , " + sp2);

            for (int j=0;j<sp;j++){
                System.out.print("\t");
            }
            System.out.print("*");
            for (int j=0;j<sp2;j++){
                System.out.print("\t");
            }
            if (i != 0 && i != n - 1) {
                System.out.print("*");
            }

            if(i<n/2){
                sp--;
                sp2=sp2+2;
            }
            else {
                sp++;
                sp2=sp2-2;
            }
            System.out.println();
        }
    }
}
