package Git.Genc_Next;

import java.util.*;
public class Distinct_mark {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int [] arr = new int[len];

        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();

        }
        int count=0;
        int res=0;
        int flag =0;
        for(int i=0;i<len-1;i++){

            if( arr[i+1]<arr[i] || flag==1 ){
                if(flag==0){
                    flag=1;
                    count=arr[i];
                }
                res+=++count;

            }else{
                res+=arr[i+1];
            }
        }
        System.out.println(res+arr[0]);
    }
}
