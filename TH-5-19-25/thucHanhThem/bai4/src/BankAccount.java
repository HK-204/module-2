public class BankAccount {
    private String ownerName;
    private double balance = 0;

    BankAccount(String ownerName) {
        this.ownerName = ownerName;
    }

    public double deposit(double amount) {
        balance += amount;
        return balance;
    }

    public double withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds");
        }
        balance -= amount;
        return balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getOwnerName() {
        return ownerName;
    }
}
