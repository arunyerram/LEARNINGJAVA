public class acc{
    Long number;
    String name;
    Double balance;

    acc(String name,Long number,Double balance){
        name = this.name;
        number = this.number;
        balance = this.balance;
    }

    public static void main(String[] args){
        acc a1 = new acc("Arun",123456789,1234);
        acc a2 = new acc("Aru",1234567,536);

        

    }
    
}