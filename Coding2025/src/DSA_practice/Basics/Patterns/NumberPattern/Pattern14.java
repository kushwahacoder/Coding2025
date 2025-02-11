package DSA_practice.Basics.Patterns.NumberPattern;

import java.util.Scanner;

/*

		1
	2	3	2
3	4	5	4	3
	2	3	2
		1

*/

public class Pattern14 {
   public static void main(String[] args){
       System.out.println("Pattern 14");
       System.out.println("Enter no of rows");
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int sp=n/2;
       int st=1;
       int num=1;
       int temp=num;
       for (int i=0;i<n;i++){
//           System.out.println(sp+" "+st);
           for (int j=0;j<sp;j++){
               System.out.print("\t");
           }
           for (int j=0;j<st;j++){
               System.out.print(num+"\t");
               temp=num;
               if(j<st/2){
                   num++;
               }
               else {
                   num--;
               }
           }
           num=temp;
           if(i<n/2){
               sp--;
               st=st+2;
               num++;
           }
           else {
               sp++;
               st=st-2;
               num--;
           }
           System.out.println();
       }
   }
}
