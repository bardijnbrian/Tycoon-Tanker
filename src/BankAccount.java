import java.util.Locale;
public class BankAccount {

    private String cardNumber;
    private double balance;
    private boolean isBlocked;
    private Bank bank;

    public BankAccount(Bank bank){
        this.bank = bank;
        cardNumber = bank.setCardNumber();
        balance = 3.5;
        isBlocked = false;
    }

    public String getCardNumber(){
        return cardNumber;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(int value){
        balance += value;
    }

    public void setBlocked(boolean block){
        isBlocked = block;
    }

    public String toString(){
        String balanceString = String.format(Locale.US, "%.2f", getBalance());
        String s =  "Card Information:\nBank: " + bank.getName() +"\nCard Number: " + cardNumber + "\nBalance: $" + balanceString;
        if (isBlocked){
            s += "\nBLOCKED";
        }
        return s;
    }

}
