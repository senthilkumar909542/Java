package Git.ionixx;
import java.util.*;
public class ionixx_5 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int len =sc.nextInt();
        int count =len*2 -1;
        int in =count;
        int x =0;
        int [] [] arr = new int[count][count];

        while( count>0) {
            for (int i = x; i < count; i++) {
                for (int j = x; j < count; j++) {
                    if (i == x) {
                        arr[i][j] = len;
                    } else if (j == x) {
                        arr[i][j] = len;
                    } else if (j == count - 1) {
                        arr[i][j] = len;
                    } else if (i == count - 1) {
                        arr[i][j] = len;
                    }
                }
            }
            len--;
            x++;
            count--;
        }


        for(int i =0;i< in;i++){
            for(int j =0;j< in;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

}


// sample input : 7

// 7 7 7 7 7 7 7 7 7 7 7 7 7
// 7 6 6 6 6 6 6 6 6 6 6 6 7
// 7 6 5 5 5 5 5 5 5 5 5 6 7
// 7 6 5 4 4 4 4 4 4 4 5 6 7
// 7 6 5 4 3 3 3 3 3 4 5 6 7
// 7 6 5 4 3 2 2 2 3 4 5 6 7
// 7 6 5 4 3 2 1 2 3 4 5 6 7
// 7 6 5 4 3 2 2 2 3 4 5 6 7
// 7 6 5 4 3 3 3 3 3 4 5 6 7
// 7 6 5 4 4 4 4 4 4 4 5 6 7
// 7 6 6 6 6 6 6 6 6 6 6 6 7
// 7 7 7 7 7 7 7 7 7 7 7 7 7

// sample input : 4

// 4 4 4 4 4 4 4
// 4 3 3 3 3 3 4
// 4 3 2 2 2 3 4
// 4 3 2 1 2 3 4 
// 4 3 2 2 2 3 4
// 4 3 3 3 3 3 4
// 4 4 4 4 4 4 4
