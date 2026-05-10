/*кредитный счёт, который может уходить в минус до кредитного лимита,
 указанного в конструкторе, но не может уходить в плюс.*/
public class CreditAccount extends Account {
    private final long CREDIT_LIMIT;

    public CreditAccount(long amount, long balance, long CREDIT_LIMIT) {
        super(amount, balance);
        this.CREDIT_LIMIT = CREDIT_LIMIT;

    }

    @Override
    public boolean add(long amount) {
        return false;
    }

    @Override
    public boolean pay(long amount) {
        long newBalance = balance - amount;
        if (amount > 0 && newBalance >= (-CREDIT_LIMIT) ) {
            balance -= amount;//  списываем с баланса
            return true;
        }
        return false;
    }


}
