package DSA_practice.DataStructures.Arrays;

public class BarChart {
    public static void main(String[] args){
        System.out.println("this is barchar from an array");
        int[] arr={3,1,0,7,5};
        int max=arr[0];
        for (int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        for (int i=0;i<=max;i++){
            if(i==max){
                for (int j=0;j<arr.length;j++){
                    System.out.print(arr[j]+"\t");
                }
            }
            else {
                for (int j = 0; j < arr.length; j++) {
                    if (max - i > arr[j]) {
                        System.out.print("\t");
                    } else {
                        System.out.print("*\t");
                    }
                }
            }
            System.out.println();
        }
    }
}
