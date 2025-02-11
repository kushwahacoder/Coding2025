package DSA_practice.DataStructures.Arrays;


//Java is always call by reference.


import java.util.Scanner;

public class Array_Intro {
    public static void main(String[] args){
        System.out.println("Hello Array");
        int[] arr={1,2,3,4,5,6,7,8,9};

        System.out.println("Print Array");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int[] arr2=new int[10];
        arr2[0]=1;
        arr2[1]=2;
        arr2[2]=3;
        arr2[3]=4;
        arr2[4]=5;

        for (int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }

        int arr3[]=new int[10];
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<arr3.length;i++){
            arr3[i]=sc.nextInt();
        }
        System.out.println("Arr3");
        for (int i=0;i<arr3.length;i++){
            System.out.print(arr3[i]+"  ");
        }


    }
}
