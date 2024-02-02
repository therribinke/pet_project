public class Main {
    public static void main(String[] args) {
        Player player = new Music1();
        OnlinePlayer onlinePlayer = new OnlinePlayer();
        onlinePlayer.setPlay(player);
        onlinePlayer.play();
        onlinePlayer.setMusic();
        onlinePlayer.play();
        onlinePlayer.setMusic();
        onlinePlayer.play();
        onlinePlayer.setMusic();
        onlinePlayer.play();
        onlinePlayer.setMusic();
        onlinePlayer.play();
    }
}