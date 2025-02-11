package DSA_practice.Basics.Patterns.StarPattern;

import java.util.Scanner;

//*  *  *  *  *
//*  *  *  *
//*  *  *
//*  *
//*

public class Pattern2_LeftUpperTriangle {
    public static void main(String[] args){
        System.out.println("Pattern2 LeftUpperTriangle");
        System.out.println("Enter no of rows");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i =0;i<n;i++){
            for (int j=0;j<n-i;j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}

