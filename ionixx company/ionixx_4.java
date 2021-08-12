package Git.ionixx;
import java.util.*;
public class ionixx_4 {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int len =sc.nextInt();



        int count=0;

        for(int i=0;i<len;i++){
            ++count;

            for(int j =len-i;j<=len;j++){
                System.out.print(count);
                if(j==len){
                    break;
                }
                System.out.print("*");
            }
            System.out.println();



        }


        count =len;
        for(int i=0;i<len;i++) {

            for (int j = len - i; j > 0; j--) {

                System.out.print(count);
                if (j == 1) {
                    break;
                }
                System.out.print("*");
            }
            System.out.println();
            --count;
        }


    }
}


// sample input: 5
// 1
// 2*2
// 3*3*3
// 4*4*4*4
// 5*5*5*5*5
// 5*5*5*5*5
// 4*4*4*4
// 3*3*3
// 2*2
// 1



// sample input : 3
// 1
// 2*2
// 3*3*3
// 3*3*3
// 2*2
// 1