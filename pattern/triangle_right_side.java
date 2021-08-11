package Git.pattern;
import java.util.*;
//triangle right side
public class triangle_right_side {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        int rows = sc.nextInt();
        for (int i = 0; i < rows; i++)
        {
            System.out.print(" "); //print space

            for (int j = 0; j <= i; j++) //inner loop for number of columns
            {
                System.out.print("* "); //print star
            }

            System.out.println(); //ending line after each row
        }

        for(int i=0;i<rows-1;i++)
        {

            System.out.print(" ");

            for(int j=i;j<rows-1;j++)
            {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
