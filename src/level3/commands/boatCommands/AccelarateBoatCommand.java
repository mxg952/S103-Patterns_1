package level3.commands.boatCommands;

import level3.commands.Command;
import level3.vehicles.Boat;

public class AccelarateBoatCommand implements Command {
    private Boat boat;

    public AccelarateBoatCommand(Boat boat) {
        this.boat = boat;
    }

    public void execute() {
        boat.accelerate();
    }
}
