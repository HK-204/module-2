public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Minh");
        BankAccount account2 = new BankAccount("Tri");

        account1.deposit(500);
        System.out.println(account1.getOwnerName() + " have " + account1.getBalance());
        account1.withdraw(5000);
        account2.withdraw(500);
    }
}