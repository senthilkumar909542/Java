import java.util.Scanner;

public class central_change {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int len=sc.nextInt();

        int b =1,c1,c2;


        for(int i=0;i<len;i++){
            int a  = len/2;
            c1 =(len*i)+len;
            c2 = (len*i)+b;

            for(int j =1;j<=len;j++){
                if(j==a+1){
                    System.out.print(c2+" ");
                    c2++;
                    a++;
                }else{
                    System.out.print(c1+" ");
                    c1--;
                }
            }
            System.out.println();

        }
    }
}
