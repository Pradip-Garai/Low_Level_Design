// History Constrain Rule
class BankAccount{
   protected double balance=0;

   protected void deposite(double balance){
      if(balance < 0) 
        throw new RuntimeException("Inavalid Deposite Amount");
      this.balance+= balance;
      System.out.println("Rs."+balance+" Deposite Successfull");
      System.out.println("New Account balance "+this.balance);
   }
}

// here history contrain breaks
class CashAccount extends BankAccount{

    @Override
    protected void deposite(double balance){
      if(balance < 0) 
      throw new RuntimeException("Inavalid Deposite Amount");
      this.balance+= (balance*2);
      System.out.println("Rs."+balance+" Deposite Successfull");
      System.out.println("New Account balance "+this.balance);
    }

}

public class Property_HistoryConstrain {
    public static void main(String as[]){
        BankAccount account=new BankAccount();
        account.deposite(100);

        CashAccount account2 = new CashAccount();
        account2.deposite(100);
    }
}
