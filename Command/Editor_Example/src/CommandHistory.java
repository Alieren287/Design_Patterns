import java.util.List;

public class CommandHistory {
    private List<Command> commandList;

    public void push(Command c) {
        commandList.add(c);
    }

    public Command pop() {
        Command command = commandList.get(commandList.size()-1);
        commandList.remove(commandList.size()-1);
        return command;
    }
}
