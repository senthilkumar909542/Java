package Datastructure;
import java.util.*;

public class selection_sort {

    static void test(int [] arr,int len){

        for (int i=0;i<len-1;i++){

            int min_index=i;
            int j=0;

            for(j =i+1;j<len;j++){
                if(arr[min_index] > arr[j]){
                    min_index=j;
                }
            }
            int temp = arr[min_index];
            arr[min_index]=arr[i];
            arr[i]=temp;
        }
        for(int k:arr){
            System.out.print(k+" ");
        }
    }
    public  static  void main(String [] args){

        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int [] arr = new int[len];

        for(int i=0;i<len;i++)
        {
            arr[i]=sc.nextInt();
        }
        test(arr,len);
    }
}
