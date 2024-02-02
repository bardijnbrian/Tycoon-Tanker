public class Loop {
    private Parser parser = new Parser();
    private Gasstation gs;

    private boolean processCommand(Command command)
    {
        boolean wantToQuit = false;

        if(command.isUnknown()) {
            System.out.println("I don't know what you mean...");
            return false;
        }

        String commandWord = command.getCommandWord();

        switch (commandWord) {
            case "next" :
                next();
                clearConsole();
                gs.printPlayerInfo();
                break;
            case "quit" :
                wantToQuit = quit(command);
                break;
            default:
        }

        return wantToQuit;
    }

    public boolean quit(Command command)
    {
        if(command.hasSecondWord()) {
            System.out.println("Quit what?");
            return false;
        }
        else {
            return true;
        }
    }

    public void next(){
        gs.setDate(gs.getDate().plusDays(1));
    }

    private void clearConsole(){
        for (int i = 0; i<20 ; i++){
            System.out.println();
        }
    }

    public void start(){
        String name = parser.getName();
        gs = new Gasstation(name);
        gs.printInfo();
        boolean finished = false;
        while(!finished){
            Command command = parser.getCommand();
            finished = processCommand(command);
        }
    }

}
