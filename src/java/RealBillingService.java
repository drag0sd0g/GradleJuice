import com.google.inject.Inject;

public class RealBillingService implements BillingService {

    private final CreditCardProcessor processor;
    private final TransactionLog transactionLog;

    @Inject
    RealBillingService(CreditCardProcessor processor,
                       TransactionLog transactionLog) {
        this.processor = processor;
        this.transactionLog = transactionLog;
    }

    @Override
    public Receipt chargeOrder(PizzaOrder order, CreditCard creditCard) {
        processor.processCreditCard();
        transactionLog.doLogTransaction();
        return null;
    }
}