public class PayPalCreditCardProcessor implements CreditCardProcessor {
    @Override
    public void processCreditCard() {
        System.out.println("Processing credit card using PayPal");
    }
}
