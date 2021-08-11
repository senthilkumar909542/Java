package Git.pattern;
import java.util.*;
//right triangle
public class right_triangle{


    public static void main(String[] args) {
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
    }
}






