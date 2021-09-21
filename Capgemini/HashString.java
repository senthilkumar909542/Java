package Git.Capgemini;




import java.util.*;

public class HashString
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int in =0;
        char []arr = s.toCharArray();

        for(int i=0;i<s.length();i++){
            int x = s.charAt(i);
            if( !(x>=65 && x<=90 || x>=97 && x <=122)){

                char first = s.charAt(i);
                for (int j = i ; j > in; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[in] = first;
                in++;
            }
        }
        for(char value:arr){
            System.out.print(value);
        }

    }
}
