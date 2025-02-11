package DSA_practice.DataStructures.Arrays;

public class SpanOfArray {
    public static void main(String[] args) {
        System.out.println("Span of array");
        int[] arr = {12, 9, 35, 6, 4, 8, 97, 65, 13, 155, 4};
        int span=span(arr);
        System.out.println(span);

    }
    public static int span(int[] array){
        int max=array[0];
        int min=array[0];
        for (int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
            else{
                if(array[i]<min){
                    min=array[i];
                }
            }
        }
        return max-min;
    }
}
