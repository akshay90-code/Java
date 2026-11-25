interface Payable {
    void pay(double amount);
}

class UpiPayment implements Payable {
    private String upiId;

    UpiPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " via UPI (" + upiId + ")");
    }
}

class CardPayment implements Payable {
    private String cardLast4;

    CardPayment(String cardLast4) {
        this.cardLast4 = cardLast4;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " via Card ending in " + cardLast4);
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        Payable p1 = new UpiPayment("student@okaxis");
        Payable p2 = new CardPayment("4821");

        p1.pay(499.0);
        p2.pay(1250.0);
    }
}