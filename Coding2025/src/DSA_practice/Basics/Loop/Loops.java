package DSA_practice.Basics.Loop;

public class Loops {
    public static void main(String[] args){
        System.out.println("Print no.");

        System.out.println("While Loops");
        int i=1;
        while(i<=10){
            System.out.print(i+"\t");
            i++;
        }
        System.out.println("\n");
        System.out.println("For Loops");
        for(int j=1;j<=10;j++){
            System.out.print(j+"\t");
        }
        System.out.println("\n");
        System.out.println("Do While Loop");
        int k=1;
        do{
            System.out.print(k+"\t");
            k++;
        }while (k<=10);
    }
}
