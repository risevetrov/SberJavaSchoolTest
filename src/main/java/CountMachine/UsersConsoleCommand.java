package CountMachine;

import java.util.ArrayList;
import java.util.List;

public class UsersConsoleCommand {
    public List<String> getCommandsText() {
        List<String> commandsList = new ArrayList();
        commandsList.add("/start");
        commandsList.add("/inc");
        commandsList.add("/reset");
        commandsList.add("/stop");
        return commandsList;
    }
}
