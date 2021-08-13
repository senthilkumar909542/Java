import java.util.Scanner;

public class palindrome_triangle {

    static void  palindrome_(int r){
        int a=0;

        for(int i=0;i<r;i++){
            int s=0;
            for(int z =i;z<r;z++){
                System.out.print("  ");
            }
            for(int j=0;j<=i+a;j++){

                if(j-1 == a){
                    int x;

                    for(x = 1;x<j;x++) {
                        System.out.print(--s+" ");

                    }
                    j = j+x;
                }else {

                    System.out.print(++s + " ");
                }

            }
            a++;
            System.out.println();
        }




    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        palindrome_(r);

    }
}
