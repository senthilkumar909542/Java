package Git.Sorting_And_Searching;
import  java.util.*;
public class quick_sort {

        static int test(int [] arr, int start, int end){
            int pivot = arr[start];
            int i =start+1;

            for(int j =start+1;j<=end;j++){

                if(arr[j]<pivot){
                    int temp = arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                    i++;
                }
            }

            int temp = arr[start];
            arr[start]= arr[i-1];
            arr[i-1]=temp;

            return i-1;




        }


        static void quicksort(int [] arr ,int start,int end){
            if(start<end){
                int pivot = test(arr, start, end);
                quicksort(arr,start, pivot-1);
                quicksort(arr,pivot+1 , end);
            }
        }



        public static void main(String [] args){
            Scanner sc = new Scanner(System.in);
            int size_Of_array=sc.nextInt();
            int [] arr = new int[size_Of_array];

            for(int i=0;i<size_Of_array;i++){
                arr[i]=sc.nextInt();
            }
            quicksort(arr,0,size_Of_array-1);
            for(int u:arr){
                System.out.print(u+" ");
            }


        }
    }
