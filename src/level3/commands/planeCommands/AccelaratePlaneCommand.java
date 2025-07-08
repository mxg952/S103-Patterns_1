package level3.commands.planeCommands;

import level3.commands.Command;
import level3.vehicles.Plane;

public class AccelaratePlaneCommand implements Command {
    private Plane plane;

    public AccelaratePlaneCommand(Plane plane) {
        this.plane = plane;
    }

    public void execute() {
        plane.accelerate();
    }
}
