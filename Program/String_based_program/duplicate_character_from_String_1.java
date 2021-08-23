package Git.string_based_programs;
import java.util.*;


public class duplicate_character_from_String_1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count=0;

        ArrayList<Character> list = new ArrayList<>();

        for(int i =0;i<s.length();i++){

            char c = s.charAt(i);

            for(int j =0;j<s.length();j++){
                if(c == s.charAt(j)){
                    count++;
                }
            }

            if(!list.contains(c)){
                System.out.println("Character :"+c +" count: "+count+" times.");
                list.add(c);
            }

            count =0;
        }


    }
}
