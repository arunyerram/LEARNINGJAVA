import java.util.*;
import java.time.*;
import java.util.stream.Collectors;
class test6 
{
    public static void main(String[] args) 
    {
        List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
         
        String joinedString = listOfStrings.stream()
.collect(Collectors.joining(",", "[" , "]");         
        System.out.println(joinedString);
    }
}


