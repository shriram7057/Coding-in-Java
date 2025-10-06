class account 
{
    private int accno, balance;

    public account(int an, int bl) {
        accno = an;
        balance = bl;
    }

    public void showData() {
        System.out.println("Account No is " + accno);
        System.out.println("Balance is " + balance);
    }

    public void deposit(int amt) {
        balance = balance + amt;
    }

    public void withdraw(int amt) {
        balance = balance - amt;
    }

}

class Bank {
    public static void main(String[] args) {
        account a = new account(4117, 2500);
        a.showData();
        a.deposit(7000);
        a.withdraw(2000);
        a.deposit(4000);
        a.showData();
}
}