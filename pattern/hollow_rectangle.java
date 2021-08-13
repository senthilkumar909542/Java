import java.util.Scanner;

public class hollow_rectangle {

    static void hollow(int r ,int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==0 || j ==0 || i == r-1 || j== c-1) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println( );
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows:");
        int row = sc.nextInt();
        System.out.print("Enter the colummn:");
        int column = sc.nextInt();


        hollow(row,column);
    }
}
