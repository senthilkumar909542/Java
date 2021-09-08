package Git.HackerRank;


import java.io.*;

public class Strings_Making_anagrams {



    public static int makeAnagram(String a, String b) {
        int [] arr = new int[128];
        int [] arr1 = new int[128];

        for(int i =0;i<a.length();i++){
            arr[a.charAt(i)]++;
        }
        for(int i=0;i<b.length();i++){
            arr1[b.charAt(i)]++;
        }

        int count=0;



        for(int i=65;i<128;i++){
            int res =0;


            if(arr[i]!=arr1[i]){
                res = Math.abs(arr[i]-arr1[i]);
                count += res;
            }
        }


        return count;



    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = bufferedReader.readLine();

        String b = bufferedReader.readLine();

        int res = Strings_Making_nagrams.makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();


    }
}
