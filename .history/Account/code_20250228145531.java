import java.util.*;
import java.time.*;
public class code{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Double d1 = 2.0;
        Integer it = 2;

        if(d1.equals(it)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        // System.out.println(args[0]);
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        LocalDate date1 = LocalDate.of(new Date);
        LocalDate date2 = LocalDate.of(new Date);
        



        double d2 = 234.0;
        int it1 = 234;

        if(d2 == it1){
            System.out.println("equal");
        }else{
            System.out.println("false");
        }



        // if(d1 == it){
        //     System.out.println("true");
        // }else{
        //     System.out.println("false");
        // }
    }
}