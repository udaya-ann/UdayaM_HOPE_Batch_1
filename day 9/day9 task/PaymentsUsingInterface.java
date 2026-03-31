interface PayementMode{
    void processPayment(double amount);


}

public class PaymentsUsingInterface {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        PayementMode creditCardPayment = new CreditCardPayment();
        PayementMode payPalPayment = new PayPalPayment();
        PayementMode bankTransferPayment = new BankTransferPayment();

        paymentProcessor.makePayment(creditCardPayment, 100.0);
        paymentProcessor.makePayment(payPalPayment, 150.0);
        paymentProcessor.makePayment(bankTransferPayment, 200.0);
        
    
}
}
class CreditCardPayment implements PayementMode{
    public void processPayment(double amount){
        System.out.println("Processing credit card payment of: " + amount);
    }
}
class PayPalPayment implements PayementMode{
    public void processPayment(double amount){
        System.out.println("Processing PayPal payment of: " + amount);
    }
}   
class BankTransferPayment implements PayementMode{
    public void processPayment(double amount){
        System.out.println("Processing bank transfer payment of: " + amount);
    }
}
class PaymentProcessor {
    public void makePayment(PayementMode paymentMode, double amount) {
        paymentMode.processPayment(amount);
    }
}