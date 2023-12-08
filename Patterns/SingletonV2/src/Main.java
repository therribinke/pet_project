public class Main {
    public static void main(String[] args) {
        Logger.getLogger().addLog("111");
        Logger.getLogger().addLog("112");
        Logger.getLogger().addLog("113");
        System.out.println(Logger.getLogger().getLog());
    }
}