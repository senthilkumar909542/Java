import java.util.Scanner;

public class _matrix_4_8 {


    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Square matrix:");
        int r = sc.nextInt();
        int rc = r/4+1;
        int a =1;
        int space = rc -2;
        int c=r;
        int last=0;
        int last1 =0;
        int s = r;

        for(int i=0;i<rc;i++) {


            for (int j = 0; j < rc; j++) {
                if (i == 0) {
                    System.out.print(a + " ");
                    last1 = a;
                    a++;
                }else if (j == 0 && i != rc - 1 ) {
                    System.out.print(c + " ");
                    last = c;
                    c--;
                    for (int z = 1; z <= space; z++) {
                        System.out.print("  ");
                    }

                } else if (i == rc - 1) {
                    if(space ==0){
                        System.out.print(s+" ");
                        s--;
                    }else {

                        last--;
                        System.out.print(last + " ");
                    }
                }else if(j == rc -1){
                 last1++;
                 System.out.print(last1+" ");

                // last column
                }
            }
            System.out.println( );
        }



    }
}
