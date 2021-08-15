package Git.varum;

import java.util.*;

public class insert_given_value_in_given_integer {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int s = sc.nextInt();
        System.out.print("Enter the position:");
        int s1 = sc.nextInt();
        System.out.print("Enter the number:");
        int ins = sc.nextInt();

        String str = String.valueOf(s);
        int [] arr = new int[str.length()+1];
        int y=0;

        for(int i=0;i<str.length();){
            if(i == s1-1){
                arr[i]= ins;

                s1 = -1;
                y =1;
            }else{
                int res = Integer.parseInt(String.valueOf(str.charAt(i)));
                arr[i+y]=res;

                i++;

            }
        }
        for(int i=0;i<str.length()+1;i++){
            System.out.print(arr[i]);
        }
    }
}
