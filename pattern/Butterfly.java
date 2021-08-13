import java.util.Scanner;

public class Butterfly {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int r = sc.nextInt();
        int space = 0;


        for(int i =0;i<r;i++){
            for(int j =0;j<=i;j++){
                System.out.print("*");
            }
            for(int z = i+2 ;z <r*2-i;z++){
                System.out.print(" ");
            }
            for(int x=0;x<=i;x++){
                System.out.print("*");
            }
            System.out.println();
        }


        for(int i=0;i<r-1;i++){
            for(int j =i;j<r-1;j++){
                System.out.print("*");
            }


            for(int z=0;z<=i+i+1;z++){

                System.out.print(" ");
            }
            for(int x =i;x<r-1;x++){
                System.out.print("*");
            }
            space++;
            System.out.println();

        }

    }
}
