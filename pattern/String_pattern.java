package Git.pattern;
import java.util.*;

public class String_pattern {


        public static void main(String [] args){
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            int len = s.length();
            int len1 = len/2 ;




            if(len % 2==1){

                String str = s.substring(len1).concat(s.substring(0,len1));

                for(int i =0;i<len;i++){

                    for(int j=i+1;j<len;j++){
                        System.out.print(" ");
                    }

                    for(int z =0;z<=i;z++){
                        System.out.print(str.charAt(z));
                    }
                    System.out.println();

                }
            }else{

                System.out.println("EVEN LENGTH");
            }
        }
    }

