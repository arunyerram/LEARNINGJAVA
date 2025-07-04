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
        acc a1 = new acc("Arun",12345678,1234);
        acc a2 = new acc("Aru",123456789,1234);

        if(a1.balance == a2.balance){
            
        }

    }
    
}