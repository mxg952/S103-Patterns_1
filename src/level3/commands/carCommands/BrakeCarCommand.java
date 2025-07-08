package level3.commands.carCommands;

import level3.commands.Command;
import level3.vehicles.Car;

public class BrakeCarCommand implements Command {

    private Car car;

    public BrakeCarCommand(Car car) {
        this.car = car;
    }

    public void execute() {
        car.brake();
    }
}
