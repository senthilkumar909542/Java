package Git.varum;

import java.util.*;
public  class password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int count = 0;
        int up = 0;
        int digit = 0;
        int lw = 0;

        if (str.length() > 8) {
            for (int i = 0; i < str.length(); i++) {
                char a = str.charAt(i);


                if (Character.isUpperCase(a)) {
                    up++;
                } else if (Character.isDigit(a)) {
                    digit++;
                } else if (String.valueOf(a).matches("[ !@#$%^&*()]")) {
                    count++;
                } else if (Character.isLowerCase(a)) {
                    lw++;
                }

            }
            System.out.println((up>=1 && digit >=1 && count >=1 && lw >=1) ?"Valid Password" : "Not Valid Password");
        } else {
            System.out.println("Please enter the valid password");
        }
    }
}
