package DSA_practice.Basics.Patterns;

import java.util.Scanner;
/*

  *
     *
        *
           *
              *

 */

public class Pattern7 {
    public static void main(String[] args){
        System.out.print("This is Pattern7");
        System.out.println("Enter no. of rows");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i =0;i<n;i++){
            for (int j=0;j<n;j++){
                if(i==j){
                    System.out.print("*\t");
                }
                else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
