public class Logger {
    private static Logger logger;
    private static String string="Test\n";
    public synchronized static Logger getLogger(){
        if (logger==null){
            logger = new Logger();
        }
        return logger;//Lazy
    }
    public void addLog(String string){
        this.string += string+ "\n";
    }
    public String getLog(){
        return string;
    }
}