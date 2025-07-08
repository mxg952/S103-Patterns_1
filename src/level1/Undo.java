package level1;

import java.util.ArrayList;
import java.util.List;

public class Undo {

    private static Undo instance;

    private List<String> commands;

    private Undo() {
        commands = new ArrayList<>();
    }

    public static Undo getInstance() {
        if (instance == null) {
            instance = new Undo();
        }
        return instance;
    }

    public void addCommand(String cmd) {
        commands.add(cmd);
    }

    public void removeLast() {
        if (!commands.isEmpty()) {
            commands.remove(commands.size()-1);
        }
    }

    public void listCommands() {
        for(String cmd : commands) {
            System.out.println(cmd);
        }
    }


}
