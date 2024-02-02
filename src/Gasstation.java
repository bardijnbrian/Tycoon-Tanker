import java.time.LocalDate;

public class Gasstation {

    private LocalDate date = LocalDate.of(2000,1,1);
    private String name;
    private Bank account;


    public Gasstation(String name){
        setName(name);
        account = new Bank();
    }

    public void setName(String name){
        this.name = name;
    }

    public LocalDate getDate(){
        return date;
    }

    public void setDate(LocalDate newDate){
        date = newDate;
    }

    public void printInfo(){
        System.out.println("Welcome to Tanker Tycoon, " + name);
        System.out.println(account.toString());
        System.out.println(getDate());

    }

    public void printPlayerInfo(){
        System.out.println(name);
        System.out.println(date);

    }

}
