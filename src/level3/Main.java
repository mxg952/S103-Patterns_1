package level3;

import level3.invoker.Parking;
import level3.vehicles.Car;
import level3.vehicles.Boat;
import level3.vehicles.Plane;
import level3.vehicles.Bicicle;

import level3.commands.carCommands.StartCarCommand;
import level3.commands.carCommands.AccelarateCarCommand;
import level3.commands.carCommands.BrakeCarCommand;

import level3.commands.boatCommands.StartBoatCommand;
import level3.commands.boatCommands.AccelarateBoatCommand;
import level3.commands.boatCommands.BrakeBoatCommand;

import level3.commands.planeCommands.StartPlaneCommand;
import level3.commands.planeCommands.AccelaratePlaneCommand;
import level3.commands.planeCommands.BrakePlaneCommand;

import level3.commands.bicicleCommands.StartBicicleCommand;
import level3.commands.bicicleCommands.AccelarateBicicleCommand;
import level3.commands.bicicleCommands.BrakeBicicleCommand;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Boat boat = new Boat();
        Plane plane = new Plane();
        Bicicle bicicle = new Bicicle();

        Parking parking = new Parking();

        parking.addCommand(new StartCarCommand(car));
        parking.addCommand(new AccelarateCarCommand(car));
        parking.addCommand(new BrakeCarCommand(car));

        parking.addCommand(new StartBoatCommand(boat));
        parking.addCommand(new AccelarateBoatCommand(boat));
        parking.addCommand(new BrakeBoatCommand(boat));

        parking.addCommand(new StartPlaneCommand(plane));
        parking.addCommand(new AccelaratePlaneCommand(plane));
        parking.addCommand(new BrakePlaneCommand(plane));

        parking.addCommand(new StartBicicleCommand(bicicle));
        parking.addCommand(new AccelarateBicicleCommand(bicicle));
        parking.addCommand(new BrakeBicicleCommand(bicicle));

        parking.executeCommands();
    }
}
