package level3.commands.bicicleCommands;

import level3.commands.Command;
import level3.vehicles.Bicicle;

public class StartBicicleCommand implements Command {
    private Bicicle bicicle;

    public StartBicicleCommand(Bicicle bicicle) {
        this.bicicle = bicicle;
    }

    public void execute() {
        bicicle.start();
    }
}
