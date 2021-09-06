package Git.Rits;

import java.util.*;
public class find_duplicat_count {

    static int  test(ArrayList<Integer> numbers){

        int count =0;
        int [] arr = new int[100000];

        for (Integer number : numbers) {
            arr[number]++;
        }

        for(int x:arr){
            if(x>=2){
                count++;
            }
        }

        return count;
    }






    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        ArrayList<Integer> list= new ArrayList<>();

        for(int i =0;i<len;i++){
            list.add(sc.nextInt());
        }

        int res = test(list);

        System.out.println(res);


    }
}
