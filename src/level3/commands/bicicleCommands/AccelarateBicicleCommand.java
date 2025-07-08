package level3.commands.bicicleCommands;

import level3.commands.Command;
import level3.vehicles.Bicicle;

public class AccelarateBicicleCommand implements Command {
    private Bicicle bicicle;

    public AccelarateBicicleCommand(Bicicle bicicle) {
        this.bicicle = bicicle;
    }

    public void execute() {
        bicicle.accelerate();
    }
}
