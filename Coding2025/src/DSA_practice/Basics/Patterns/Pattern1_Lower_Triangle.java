package DSA_practice.Basics.Patterns;

import java.util.Scanner;

//*
//*  *
//*  *  *
//*  *  *  *
//*  *  *  *  *

public class Pattern1_Lower_Triangle {
    public static void main(String[] args){
        System.out.println("This is Pattern1 Lower Triangle ");
        System.out.println("Enter no of rows");
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

}


// for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                if(i>=j){
//                System.out.print("*  ");
//                }
//            }
//            System.out.println();
//        }