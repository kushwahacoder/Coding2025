package DSA_practice.Basics.Prime;

import java.util.Scanner;

public class PrimeNo_InRange {
    public static void main(String[] args){
        System.out.println("Find all Prime Nos in Range");
        Scanner sc=new Scanner(System.in);
        System.out.println("Upper limit");
        int low=sc.nextInt();
        System.out.println("Lower limit");
        int high=sc.nextInt();
        int check=0;
        int i;
        for(i=low;i<=high;i++){
            for(int j=2;j*j<=i;j++){
                if(i%j==0){
                    check++;
                    break;
                }
            }
            if(check==0){
                System.out.println(i);
            }
            check=0;
        }

    }
}
