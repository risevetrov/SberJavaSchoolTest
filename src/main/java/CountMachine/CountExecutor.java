package CountMachine;

import java.io.IOException;

public class CountExecutor {

    DtoCountValue dtoCountValue = new DtoCountValue();
    UsersConsoleText usersConsoleText = new UsersConsoleText();
    private int currentCountNum = getCount();
    public int countNum = currentCountNum;

    private int getCount(){
        if (dtoCountValue.getFileCount() == null || dtoCountValue.getFileCount().equals("0")){
            countNum = 0;
        } else {
            countNum = Integer.valueOf(dtoCountValue.getFileCount());
            System.out.println(usersConsoleText.getCommandsText(3).replace("countNum", String.valueOf(countNum)));
        }
        return countNum;
    }

    public int getCountInc() throws IOException {
        countNum++;
        System.out.println(usersConsoleText.getCommandsText(6) + countNum);
        dtoCountValue.writeFileCount(String.valueOf(countNum));
        return countNum;
    }

    public int getCountReset() throws IOException {
        countNum = 0;
        System.out.println(usersConsoleText.getCommandsText(6) + countNum);
        dtoCountValue.writeFileCount(String.valueOf(countNum));
        return countNum;
    }

    public void getCountStop() throws IOException {
        System.out.println(usersConsoleText.getCommandsText(4).replace("countNum",String.valueOf(countNum)));
        System.out.println(usersConsoleText.getCommandsText(2));
    }
}
