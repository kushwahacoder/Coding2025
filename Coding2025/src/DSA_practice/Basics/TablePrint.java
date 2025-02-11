package DSA_practice.Basics;

import java.util.Scanner;

public class TablePrint {
    public static void main(String[] args) {
        System.out.print("Print table");
        System.out.println("Table Of ? ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+" X "+i+" = "+n*i);
        }
    }
}
