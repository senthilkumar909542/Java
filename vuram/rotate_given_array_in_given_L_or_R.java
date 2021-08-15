package Git.varum;

import java.util.*;

public class rotate_given_array_in_given_L_or_R{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String to rotate:");
        String s = sc.nextLine();
        System.out.print("Enter the direction to rotate:");
        String s1 = sc.nextLine();
        System.out.print("Enter  how many times to rotate:");
        int count =sc.nextInt();
        int len = s.length();
        char [] arr = new char[len];

        for(int i =0;i<len;i++){
            arr[i]=s.charAt(i);
        }

        if(s1.equalsIgnoreCase("L")){
            for(int i =0;i<count;i++){

                char last = arr[0];

                for(int j=1;j<=len-1;j++){
                    arr[j-1]=arr[j];
                }
                arr[len-1]=last;

            }

            }
        if(s1.equalsIgnoreCase("R")) {
            for (int i = 0; i < count; i++) {


                char first = arr[len - 1];

                for (int j = len - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = first;
            }
        }

        String res ="";

        for(char x:arr){
            res=res.concat(String.valueOf(x));
        }
        System.out.println(res);



    }
}