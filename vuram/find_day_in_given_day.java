package Git.varum;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;


public class find_day_in_given_day{
public  static void  main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the testCase:");
    int count = sc.nextInt();



    for(int i=0;i<count;i++){
        System.out.print("Enter the date to find day:");
        String str = sc.next();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("y-M-d",Locale.ENGLISH);
        LocalDate date = LocalDate.parse(str,dtf);
        DayOfWeek dow=date.getDayOfWeek();
        System.out.println(dow);
        //1
        //2021-08-15
        //SUNDAY





    }


}
    }



