package DSA_practice.Basics.Patterns.NumberPattern;

import java.util.Scanner;
/*
Method/formula : iC(j+1)=iCj*(i-j)/(j+1)

1
1	1
1	2	1
1	3	3	1
1	4	6	4	1

*/

public class Pattern13_II {
    public static void main(String[] args){
        System.out.println("This is Pattern 13 optimization");
        System.out.println("Enter no. of row");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            int icj=1;
            for (int j=0;j<=i;j++){
                System.out.print(icj+"\t");
                int icjp=(icj*(i-j))/(j+1);
                icj=icjp;
            }
            System.out.println();
        }
    }
}
