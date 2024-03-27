package CountMachine;

import java.io.*;

public class DtoCountValue implements Serializable {
    private final String failPath = "src\\main\\resources\\SerializableFiles\\saveCount.txt";
    UsersConsoleText usersConsoleText = new UsersConsoleText();

    public void writeFileCount(String countNum) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(failPath))) {
                bufferedWriter.write(countNum);
                System.out.println(usersConsoleText.getCommandsText(7));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getFileCount() {
        String result = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(failPath))) {
            while ((result = reader.readLine()) != null) {
                return result;
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}

