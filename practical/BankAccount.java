public class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(12345, "Alice", 1000.50);
        BankAccount account2 = new BankAccount(67890, "Bob", 2500.75);

        account1.display();
        System.out.println();
        account2.display();
    }
}
