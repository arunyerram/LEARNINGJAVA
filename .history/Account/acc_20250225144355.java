public class Acc {
    private int number;
    private String name;
    private Double balance;

    // Constructor
    Acc(String name, int number, Double balance) {
        this.name = name;
        this.number = number;
        this.balance = balance;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public Double getBalance() {
        return balance;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    // Overriding equals() to compare objects
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Check if same reference
        if (obj == null || getClass() != obj.getClass()) return false;

        Acc acc = (Acc) obj;
        return number == acc.number && name.equals(acc.name) && balance.equals(acc.balance);
    }

    public static void main(String[] args) {
        Acc a1 = new Acc("Arun", 12345678, 1234.45);
        Acc a2 = new Acc("Aru", 12345678, 1234.4);

        // == Comparison (only checks references)
        if (a1.getBalance() == a2.getBalance()) {
            System.out.println(true + " by == ");
        } else {
            System.out.println(false + " by ==");
        }

        // .equals() comparison for Double
        if (a1.getBalance().equals(a2.getBalance())) {
            System.out.println(true + " by equals");
        } else {
            System.out.println(false + " by equals");
        }

        // Object-level comparison
        if (a1.equals(a2)) {
            System.out.println("Objects are equal");
        } else {
            System.out.println("Objects are not equal");
        }
    }
}
