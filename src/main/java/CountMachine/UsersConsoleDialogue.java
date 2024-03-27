package CountMachine;

import java.util.ArrayList;
import java.util.Scanner;
public class UsersConsoleDialogue {

    public int getCommandsDialogue() {
        UsersConsoleCommand usersConsoleCommand = new UsersConsoleCommand();
        UsersConsoleText usersConsoleText = new UsersConsoleText();
        String inputText = "null";
        ArrayList ConsoleCommandList = (ArrayList) usersConsoleCommand.getCommandsText();
        while (ConsoleCommandList.indexOf(inputText) == -1){
            System.out.println(usersConsoleText.getCommandsText(5));
            Scanner scanner = new Scanner(System.in);
            inputText = scanner.nextLine();
        }
        return ConsoleCommandList.indexOf(inputText);
    }
}
