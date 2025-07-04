import java.util.*;
import java.util.Date;
import java.time.*;
public class string{
    public static void main(String[] args){
        LocalDate d=LocalDate.of(2017,Month.JANUARY, 5);

	  d=d.plusDays(2);

	  LocalDate d1=LocalDate.of(2017,Month.JANUARY, 5);

  	  d1=d1.plusDays(2);

	       if(d==d1)

			   System.out.println(1);

		   else if(d.equals(d1))

			System.out.println(2);

		   else

   			System.out.println(3);

	}
}

