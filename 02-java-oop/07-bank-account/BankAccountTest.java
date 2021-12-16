public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount mikey = new BankAccount();
        mikey.numAccounts();
        mikey.overallBalance();
        mikey.deposit("c", 1000);
        mikey.deposit("s", 2000);
        mikey.withdraw("c", 500);
        mikey.withdraw("c", 1000);
        mikey.withdraw("s", 200);
        mikey.withdraw("s", 5000);
        mikey.totalBalance();
    }
}
