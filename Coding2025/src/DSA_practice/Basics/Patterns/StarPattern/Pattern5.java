package DSA_practice.Basics.Patterns.StarPattern;

import java.util.Scanner;

//		*
//	*		*
//*		*		*
//	*		*
//		*

public class Pattern5 {
    public static void main(String[] args){
        System.out.println("This is Pattern5");
        System.out.println("Enter no of rows");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int sp=n/2;
        int st=1;
        for (int i=0;i<n;i++){
//            System.out.println(sp+" , "+st);
            for(int j=0;j<sp;j++){
                System.out.print("\t");
            }
            for(int j=0;j<st;j++){
                System.out.print("*\t\t");
            }
            if(i<n/2){
                sp--;
                st++;
            }else {
                sp++;
                st--;
            }
            System.out.println();
        }

    }

}
