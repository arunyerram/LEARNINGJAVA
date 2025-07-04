import java.util.*;
import java.util.Date;
import java.time.*;
public class string{
    public void calculateResult(Integer candidateA, Integer candidateB) {

        //  boolean process = candidateA == null || candidateA.intValue() < 10;
        
        //  boolean value = candidateA && candidateB;
        
        //  System.out.print(process || value);
        
        //  }
        
        //  public static void main(String[] unused) {
        
        //  new Election().calculateResult(null,203);

        LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);

Period p = Period.ofDays(1).ofYears(2);

d = d.minus(p);

DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);

System.out.println(f.format(d));
        
         }
}

