public class Logger {
    private static Logger logger;
    private static String string="Test\n";
    public static synchronized Logger getLogger(){
        if (logger==null){
            logger = new Logger();
        }

        return logger;
    }
    public void addLog(String string){
        this.string +=string+ "\n";
    }
    public String getLog(){
        return string;
    }
}
