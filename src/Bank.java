import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Bank {

    private ArrayList<String> cardNumbers = new ArrayList<>();
    private String name;

    public Bank(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public String setCardNumber(){
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
        if (!cardNumbers.contains(number.toString())){
            cardNumbers.add(number.toString());
            //niggaaaa
            return number.toString();
        } else {
            return setCardNumber();
        }

    }
}
