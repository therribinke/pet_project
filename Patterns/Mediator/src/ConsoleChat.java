import java.util.ArrayList;
import java.util.List;

class ConsoleChat implements Chat{
    User admin;
    List<User> users=new ArrayList<>();
    public void setAdmin(User admin){
        this.admin=admin;
    }
    public void addUser(User user){
        users.add(user);
    }
    @Override
    public void sendMessage(String message, User user) {
        for (User u: users) {
            u.getMessage(message);
        }
        admin.getMessage(message);
    }
}