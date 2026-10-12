class Bank{
   
    String HolderName;
    int AccountNumber;
    double Balance;

    // Constructor
    Bank(String HolderName, int AccountNumber, double Balance) {
        this.HolderName = HolderName;
        this.AccountNumber = AccountNumber;
        this.Balance = Balance;
    }

    // Display Method
    void display() {
        System.out.println("Holder Name: " + HolderName);
        System.out.println("Account Number: " + AccountNumber);
        System.out.println("Balance: " + Balance);
    }

    // Withdraw Method
    void withdraw(double amount) {
        if (amount <= Balance) {
            Balance = Balance - amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    // Deposit Method
    void deposit(double amount) {
        Balance = Balance + amount;
    }


    public static void main(String[] args) {
        Bank b1 = new Bank("A", 123, 23.2);
        Bank b2 = new Bank("B", 445, 698);
        Bank b3 = new Bank("C", 589, 7860);

        double amount1 = 234;
        double amount2 = 68;

        b1.withdraw(amount1);
        b1.display();
    }}


