class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String message){
        super(message);
    }
}
class Bank{
    private double balance;
    void deposit(int amount) throws InsufficientBalanceException {
        if(amount>0) {
            balance+=amount;
            System.out.println("Balance is : "+balance);
        }
        else throw new InsufficientBalanceException("amount can't be zero or negative");
         
    }
    void withdraw(int amount) throws InsufficientBalanceException{
        if(amount<=balance){
            balance-=amount;
            System.out.println("Amount withrawed: "+amount+"\nBalance: "+balance);
        }else if(balance<0){
            throw new InsufficientBalanceException("low balance");
        }else if(amount>balance){
            throw new InsufficientBalanceException("bank balance is insufficient to withdraw amount: "+amount+". Where the balance is : "+balance);
        }
    }
}

public class ThrowsEx {
    public static void main(String[] args) throws InsufficientBalanceException {
        Bank b=new Bank();
        try {
            b.deposit(20);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            b.deposit(-100);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            b.withdraw(10);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
             b.withdraw(100);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
       

    }
}
