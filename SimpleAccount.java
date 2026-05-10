//обычный счёт, с которого можно платить, пока на нём есть деньги, и пополнять сколько угодно раз.
public class SimpleAccount extends Account {

    public SimpleAccount(long amount, long balance) {
        super( amount, balance);
    }

    @Override
    public boolean add(long amount) {
        if (amount > 0) {
            balance += amount;// пополняем баланс

            return true; // пополнение успешно
        }
        return false;
    }

    @Override
    public boolean pay(long amount) {
        if (amount > 0 && balance > 0) {
            balance -= amount;//  списываем с баланса
            return true;
        }
        return false;
    }


}



