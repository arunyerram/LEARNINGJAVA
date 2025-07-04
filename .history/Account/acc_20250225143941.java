public class acc{
    int number;
    String name;
    Double balance;

    acc(String name,int number,Double balance){
        name = this.name;
        number = this.number;
        balance = this.balance;
    }

    public static void main(String[] args){
        acc a1 = new acc("Arun",12345678,1234.45);
        acc a2 = new acc("Aru",12345678,1234.45);

        if(a1.balance == a2.balance){
            System.out.println(true + "by ==");
        }else {
            System.out.println(false + "by ==");
        }

        try{
        
            if(a1.balance.equals(a2.balance)){
                System.out.println(true + "by equals");
            }else{
                System.out.println(false + "by equals");
            }
        }catch(Exception e){
            System.out.println(e + "by equals");
        }
    }
}