public class Test {

    public static void main(String[] args) {
        Bank b = new Bank("KBC");
        BankAccount ba = new BankAccount(b);
        System.out.println(ba.getCardNumber());
    }

}
