package Git.pattern;
import java.util.Scanner;

public class triangle_strings_pattern {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int count=0;
        String a = sc.nextLine();
        for(int i=0;i<a.length();i++){
            for(int z = a.length()-i;z>0;z--){
                System.out.print(" ");
            }
            for(int j=0;j<=i+count;j++){
                System.out.print(a.charAt(i));

            }
            count++;
            System.out.println();
        }
    }
}
