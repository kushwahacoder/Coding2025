package DSA_practice.DataStructures.Arrays;

public class Find_Element {
    public static void main(String[] args){

        int[] arr={1,2,3,4,5,6,7,8,9};
        int[] arr2 = {12, 9, 35, 6, 4, 8, 97, 65, 13, 155, 4};

        System.out.println("Print Array");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        int i=find(arr2,1555);
        System.out.println("index is "+i);

    }

    public static int find(int[] arr,int d){
        for (int i=0;i<arr.length;i++){
            if(arr[i]==d){
                return i;
            }
        }
        return -1;
    }
}
