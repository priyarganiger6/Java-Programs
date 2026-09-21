class BankAccount {
    String account_holder_name;
    double balance;

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited amount = " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn amount = " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void checkBalance() {
        System.out.println("Current Balance = " + balance);
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount();

        b.account_holder_name = "Ashritha";
        b.balance = 5000;

        System.out.println("Account Holder = " + b.account_holder_name);

        b.deposit(2000);
        b.checkBalance();

        b.withdraw(1500);
        b.checkBalance();
    }
}
