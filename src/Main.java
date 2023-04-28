import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        String[] processName = new String[5];

        processName[0] = "Messenger.exe";
        processName[1] = "idea64.exe";
        processName[2] = "Telegram.exe";
        processName[3] = "Discord.exe";
        processName[4] = "Viber.exe";

        for(String el : processName) {

            try {
                Runtime.getRuntime().exec("taskkill /f /im " + el);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}