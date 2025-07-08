package level3.commands.carCommands;

import level3.commands.Command;
import level3.vehicles.Car;

public class StartCarCommand implements Command {

    private Car car;

    public StartCarCommand(Car car) {
        this.car = car;
    }

    public void execute() {
        car.start();
    }
}

