import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Bank {

    private String cardNumber;
    private double balance;
    private boolean isBlocked;


    public Bank(){
        setCardNumber();
        balance = 0;
        isBlocked = false;
    }

    public void setBalance(int value){
        balance += value;
    }

    public void setBlocked(boolean block){
        isBlocked = block;
    }

    public void setCardNumber(){
        Random r = new Random();
        StringBuilder number = new StringBuilder();
        for(int i = 0; i < 3; i++){
            for (int j = 0; j < 4; j++){
                number.append(r.nextInt(10));
            }
            if (i < 2){
                number.append('-');
            }
        }
        cardNumber = number.toString();
    }

    public String toString(){
        String s =  "Card Information:\nCard Number: " + cardNumber + "\nBalance: " + balance;
        if (isBlocked){
            s += "\nBLOCKED";
        }
        return s;
    }

}
