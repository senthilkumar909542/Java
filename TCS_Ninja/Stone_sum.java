package Git.TCS_Ninja;



import java.util.*;
public class Stone_sum {

    public static void main(String[] args) {


        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        int [] arr= new int[x];

        for(int i=0;i<x;i++){
            arr[i]=sc.nextInt();
        }
        int flag=1;
        for(int i=0;i<x;i++){
            int temp=0;
            for(int j=0;j<x;j++){
                if(i!=j){
                    temp+=arr[j];
                }
            }
            if(arr[i]==temp){
                flag=0;
            }
        }
        System.out.println((flag==0)?"True":"False");
    }
}
