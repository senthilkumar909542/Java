package Git.varum;

import java.util.*;

    public class find_given_sum_present_in_array {
        public static void main(String [] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the Number:");
            int sum = sc.nextInt();
            System.out.print("Enter the size of array:");
            int size = sc.nextInt();
            int [] arr = new int[size];
            for(int i =0;i<size;i++){
                arr[i]=sc.nextInt();
            }

            for(int i =0;i<size-1;i++){

                for(int j =i+1;j<=size-1;j++){
                    int x = arr[i]+arr[j];


                    if(sum == x){
                        System.out.println(arr[i]+" "+arr[j]);

                    }



                }
            }
        }
    }

