package Git.ionixx;
import java.util.*;

public class ionixx_3 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();

        int count =0;
        int in =1;

        for(int i =0;i<len;i++){
            in =i;
            count=0;

            for(int j=i+1;j<len;j++){
                System.out.print("  ");
            }
            while(in>=0){

                System.out.print(++count +" ");
                in--;
            }
            in =i;
            while(in >=1 ){
                System.out.print(--count+" ");
                in--;
            }
            System.out.println();

        }
        for(int i =0;i<len-1;i++){
            in =len-1;
            count =1;
            for(int j=len-i;j<len+1;j++){
                System.out.print("  ");
            }
            while(in >i  ){
                System.out.print(count+++" ");
                in--;
            }
            in = len-1;
            while(in > i+1 ){
                System.out.print( --count+" ");
                in--;
            }
            System.out.println();
        }
    }
}


// sample input: 5

// output:

//        1
//      1 2 1
//    1 2 3 2 1
//  1 2 3 4 3 2 1
//1 2 3 4 5 4 3 2 1
//  1 2 3 4 4 3 2
//    1 2 3 3 2
//      1 2 2
//        1


// sample input : 2

//    1
//  1 2 1
//    1