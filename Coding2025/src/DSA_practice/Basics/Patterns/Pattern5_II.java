package DSA_practice.Basics.Patterns;

import java.util.Scanner;
//		*
//	*		*
//*		*		*
//	*		*
//		*

public class Pattern5_II {
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
                System.out.print("*\t");
            }
            if(i<n/2){
                sp--;
                st=st+2;
            }else {
                sp++;
                st=st-2;
            }
            System.out.println();
        }

    }
}
