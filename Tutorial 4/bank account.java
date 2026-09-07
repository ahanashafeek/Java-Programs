mport java.util.Scanner;

class BankAccount
{
    String accountNumber;
    String accountHolder;
    double balance;

    // Constructor
    BankAccount(String number, String holder, double bal)
    {
        accountNumber = number;
        accountHolder = holder;
        balance = bal;
    }

    // Deposit method
    void deposit(double amount)
    {
        balance = balance + amount;
        System.out.println("Amount deposited successfully.");
    }

    // Display account details
    void displayDetails()
    {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        String number = sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String holder = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double bal = sc.nextDouble();

        BankAccount account = new BankAccount(number, holder, bal);

        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();

        account.deposit(amount);

        System.out.println("\nAccount Details:");
        account.displayDetails();
    }
}
