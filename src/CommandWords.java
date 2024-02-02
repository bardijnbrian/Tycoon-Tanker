public class CommandWords
{
    // a constant array that holds all valid command words
    private static final String[] validCommands = {

    };

    public CommandWords()
    {

    }
    public boolean isCommand(String aString)
    {
        for(int i = 0; i < validCommands.length; i++) {
            if(validCommands[i].equals(aString))
                return true;
        }
        return false;
    }

    public String getCommandWords(){
        String ret = "";
        for (String word : validCommands){
            ret += word + " ";
        }
        return ret.trim();
    }
}