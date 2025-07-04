public class c{

     public String first = "instance";
    
     public c() {
    
     first = "constructor";
    
     }
    
     { first = "block"; }
    
     public void print() {
    
     System.out.println(first);
    
     }
    
     public static void main(String... args) {
    
     new InitOrder().print();
    
     }
    
     }