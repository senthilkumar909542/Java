package Datastructure;
import  java.util.*;
public class bubble_Sort {

    static void test(int [] arr,int len){

        for(int i=0;i<len;i++){
            for(int j =0;j<len-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1]= arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i:arr){
            System.out.print(i+" ");
        }

    }



    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int size_Of_array=sc.nextInt();
        int [] arr = new int[size_Of_array];

        for(int i=0;i<size_Of_array;i++){
            arr[i]=sc.nextInt();
        }
        test(arr,size_Of_array);

    }
}
