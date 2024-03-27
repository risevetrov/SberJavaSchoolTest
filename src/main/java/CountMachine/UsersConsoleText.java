package CountMachine;

import java.util.ArrayList;
import java.util.List;

public class UsersConsoleText {
    public String getCommandsText(int commandNum) {
        List<String> commandsList = new ArrayList<String>();
        commandsList.add("Добро пожаловать!");
        commandsList.add("Для продолжения нажмите ввод:");
        commandsList.add("Завершаю работу...");
        commandsList.add("Счетчик загружен, значение '" + "countNum" +"'");
        commandsList.add("Текущее значение счетчика:\n" + "countNum");
        commandsList.add("Введите команду в консоль:");
        commandsList.add("Новое состояние счетчика:\n");
        commandsList.add("Счетчик сохранен");
        commandsList.add("Счетчик получен");
        String result = commandsList.get(commandNum);
        return result;
    }
}
