package level3.commands.bicicleCommands;

import level3.commands.Command;
import level3.vehicles.Bicicle;

public class BrakeBicicleCommand implements Command {
    private Bicicle bicicle;

    public BrakeBicicleCommand(Bicicle bicicle) {
        this.bicicle = bicicle;
    }

    public void execute() {
        bicicle.brake();
    }
}
