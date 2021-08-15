package Git.varum;

import java.util.*;

public class pattern_sum {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int size = sc.nextInt();
        System.out.print("Enter the vaules:");
        int [ ] arr = new int[size];
        int [ ] arr1 = new int[size];

        int in =0;


        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int len = size/2;

        int last =0;
        int dec=0;
        if(size%2 !=0){
            last =arr[size-1];
            dec =1;

        }
        int z3=size/2;

        for(int i =0;i<len-1 ;i++){
            int j1=0;
            int z1 =0;



            for(int j =0;j<(size-dec)-in;j+=2){
                arr1[j1]= arr[j]+arr[j+1];
                j1++;
            }
            System.out.println();

            for(int z =0;z<z3;z++){
                arr[z1]=arr1[z1];
                    System.out.print(arr[z1]+" ");

                z1++;
            }
            if(dec==1){
                System.out.print(last);
            }

            z3 = z3/2;
            in+=2;

        }
        System.out.println();
        if(dec==1){
            System.out.println(arr[0]+last);
        }
    }
}
