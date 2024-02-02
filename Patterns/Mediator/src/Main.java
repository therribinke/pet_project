import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ConsoleChat consoleChat = new ConsoleChat();
        Admin admin= new Admin(consoleChat);
        ClassicUser classicUser= new ClassicUser(consoleChat);
        ClassicUser classicUser1= new ClassicUser(consoleChat);
        consoleChat.setAdmin(admin);
        consoleChat.addUser(classicUser);
        consoleChat.addUser(classicUser1);
        classicUser1.sendMessage("111");
        admin.sendMessage("222");
    }
}








