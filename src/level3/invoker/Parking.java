package level3.invoker;

import level3.commands.Command;

import java.util.ArrayList;
import java.util.List;


public class Parking {
    private List<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void executeCommands() {
        for (Command command : commands) {
            command.execute();
        }
    }
}


