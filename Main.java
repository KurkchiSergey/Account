public class Main {
    static void main() {
        SimpleAccount simpleAccount = new SimpleAccount(2000,0);
        CreditAccount creditAccount = new CreditAccount(2000,0,-3000);
        simpleAccount.add(1000);
        simpleAccount.pay(2000);
        creditAccount.pay(4000);
        System.out.println(creditAccount.getBalance());

    }
}
