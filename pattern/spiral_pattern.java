package Git.pattern;
import java.util.*;
public class spiral_pattern {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int len_2= len;
        int [] [] arr = new int[len][len];
        int in =1;
        int count =0;




        while(len>=0) {

            boolean flag=true;
            int temp=0;
            int col = (len*4 -4)*(count+1);

            for (int i = count; i < len; i++) {
                for (int j = count; j < len; j++) {


                    if (i == count) {
                        arr[i][j]=in++;
                    } else if (j == count && i != len - 1) {
                        if(flag) {
                            temp = col;
                            flag=false;
                        }

                        arr[i][j]=col--;

                    } else if (j == len - 1 && i != len - 1) {
                        arr[i][j]=in++;
                    } else if (i == len - 1) {
                        arr[i][j]=col--;
                    }
                }
            }

            len--;
            count++;
            in =++temp;

        }




        for(int i=0;i<len_2;i++){
            for(int j =0;j<len_2;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
