public class BankAccount {
    private double checkingBalance = 0;
    private double savingsBalance = 0;
    private static int numAccounts = 0;
    private static double overallBalance = 0;

    public BankAccount() {
        numAccounts += 1;
    }

    public void numAccounts() {
        System.out.println(numAccounts);
    }

    public void overallBalance() {
        System.out.println(overallBalance);
    }

    public double getChecking() {
        return this.checkingBalance;
    }

    public double getSavings() {
        return this.savingsBalance;
    }

    public void deposit(String account, double amount) {
        if (account == "c") {
            this.checkingBalance += amount;
            overallBalance += amount;
            System.out.println(this.checkingBalance);
        } else if(account == "s") {
            this.savingsBalance += amount;
            overallBalance += amount;
            System.out.println(this.checkingBalance);
        } else {
            System.out.println("Please use c for checking or s for savings.");
        }
    }

    public void withdraw(String account, double amount) {
        if (account == "c") {
            if (this.checkingBalance - amount >= 0) {
                this.checkingBalance -= amount;
                overallBalance -= amount;
                System.out.println(this.checkingBalance);
            } else {
                System.out.println("Insufficient Funds");
            }
        }
        else if (account == "s") {
            if (this.savingsBalance - amount >= 0) {
                this.savingsBalance -= amount;
                overallBalance -= amount;
                System.out.println(this.savingsBalance);
            } else {
                System.out.println("Insufficient Funds");
            }
        }
        else {
            System.out.println("Please use c for checking or s for savings.");
        }
    }

    public void viewCheckingBalance() {
        System.out.println(this.checkingBalance);
    }

    public void viewSavingsBalance() {
        System.out.println(this.savingsBalance);
    }

    public void totalBalance() {
        double balance = this.checkingBalance + this.savingsBalance;
        System.out.println(balance);
    }
    
}
