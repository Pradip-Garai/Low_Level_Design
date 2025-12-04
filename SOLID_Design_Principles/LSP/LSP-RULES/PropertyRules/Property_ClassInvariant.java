// Class Invariants Rule

class SavingAccount{

    protected double balance;

    public SavingAccount(double balance){
        if(balance < 0)
            throw new RuntimeException("Invalid Balance Amount");
        this.balance = balance;
    }

    public void withdrawl(double amount){
        if(balance - amount < 0)
            throw new RuntimeException("Insufficient Balance");
        balance-=amount;
        System.out.println("Rs."+amount+" withdrawl Successfully");
        System.out.println("New Account Balance "+(balance-amount));
    }
}

class CheatAccount extends SavingAccount{

    public CheatAccount(double b){
        super(b);
    }

    @Override
    public void withdrawl(double amount){
        balance-=amount;
        System.out.println("Rs."+amount+" withdrawl Successfully");
        System.out.println("New Account Balance "+(balance-amount));
    }
}

public class Property_ClassInvariant {
   public static void main(String as[]){
    SavingAccount account = new SavingAccount(100);
    account.withdrawl(10);

    CheatAccount account2 = new CheatAccount(100);
    account2.withdrawl(1000);

   }
}
