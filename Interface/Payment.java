interface Payment {
    void processPayment(double amount);
}

class CreditCard implements Payment {
    public void processPayment(double amount) {
        System.out.println("Credit Card Payment of $" + amount + " processed.");
    }
}

class PayPal implements Payment {
    public void processPayment(double amount) {
        System.out.println("PayPal Payment of $" + amount + " processed.");
    }
}

public class InterfaceExample1 {
    public static void main(String[] args) {
        Payment payment1 = new CreditCard();
        payment1.processPayment(150.75);

        Payment payment2 = new PayPal();
        payment2.processPayment(200.50);
    }
}
