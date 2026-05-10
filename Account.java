public abstract class Account {
    private long amount;
   // Account account;
    protected long balance;

    public Account(long amount, long balance) {
        this.amount = amount;
      //  this.account = account;
        this.balance = balance;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public abstract boolean add(long amount);//пополнение счёта на amount, возвращает true, если пополнение успешно, и false, если иначе;

    public abstract boolean pay(long amount);//покупка со счёта на amount, возвращает true, если пукупка успешна, и false, если иначе;


    boolean transfer(Account account, long amount) {
        if (account != null && amount > 0 && this.pay(amount)) {
            account.add(amount);
            return true;
        }
        return false;
    }


}

