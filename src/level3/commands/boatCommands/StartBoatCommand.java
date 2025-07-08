package level3.commands.boatCommands;

import level3.commands.Command;
import level3.vehicles.Boat;

public class StartBoatCommand implements Command {
    private Boat boat;

    public StartBoatCommand(Boat boat) {
        this.boat = boat;
    }

    public void execute() {
        boat.start();
    }
}

