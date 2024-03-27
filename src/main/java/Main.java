
import CountMachine.UsersConsoleText;
import CountMachine.UsersConsoleDialogue;
import CountMachine.CountExecutor;

import java.io.IOException;

public class Main extends Thread{
    public static void main(String[] args) throws IOException {
        UsersConsoleText usersConsoleText = new UsersConsoleText();
        System.out.println(usersConsoleText.getCommandsText(0));
        UsersConsoleDialogue usersConsoleDialogue = new UsersConsoleDialogue();
        CountExecutor countExecutor = new CountExecutor();
        int countMachineStatus = 0;
        int countNum = countExecutor.countNum;
        if (countNum == 0){
            System.out.println(usersConsoleText.getCommandsText(4).replace("countNum",String.valueOf(countNum)));
        }
            while (!(countMachineStatus == 3)) {

                countMachineStatus = usersConsoleDialogue.getCommandsDialogue();

                if (countMachineStatus == 1){
                    countExecutor.getCountInc();
                }
                if (countMachineStatus == 2){
                    countExecutor.getCountReset();
                }
                if (countMachineStatus == 3){
                    countExecutor.getCountStop();
                    break;
                }
    }

    }
}



