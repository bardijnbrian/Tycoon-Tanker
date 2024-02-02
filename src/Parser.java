import java.util.Scanner;

public class Parser {

    private CommandWords commands;
    private Scanner reader;

    public Parser(){
        commands = new CommandWords();
        reader = new Scanner(System.in);
    }

    public Command getCommand() {
        String inputLine;
        String word1 = null;
        String word2 = null;

        System.out.print("> ");

        inputLine = reader.nextLine();

        Scanner tokenizer = new Scanner(inputLine);
        if(tokenizer.hasNext()) {
            word1 = tokenizer.next();
            if(tokenizer.hasNext()) {
                word2 = tokenizer.next();
            }
        }

        if(commands.isCommand(word1)) {
            return new Command(word1, word2);
        }
        else {
            return new Command(null, word2);
        }
    }

    public String getCommandWords(){
        return commands.getCommandWords();
    }

    public double getDouble() {
        System.out.print("> ");

        while (!reader.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid double value.");
            System.out.print("> ");
            reader.next();
        }

        double value = reader.nextDouble();
        reader.nextLine();

        return value;
    }

}

