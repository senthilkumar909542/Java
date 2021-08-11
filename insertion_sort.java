package Datastructure;
import java.util.*;
public class insertion_sort {

    static void test(int [] arr,int len){

        for (int i=1;i<len;i++){
            int key = arr[i];
            int j =i-1;
            while(j>=0  && arr[j]>key ){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
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
