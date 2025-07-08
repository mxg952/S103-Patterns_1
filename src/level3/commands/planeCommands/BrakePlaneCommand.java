package level3.commands.planeCommands;

import level3.commands.Command;
import level3.vehicles.Plane;

public class BrakePlaneCommand implements Command {
    private Plane plane;

    public BrakePlaneCommand(Plane plane) {
        this.plane = plane;
    }

    public void execute() {
        plane.brake();
    }
}
