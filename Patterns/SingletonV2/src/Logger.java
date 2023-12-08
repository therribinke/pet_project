public class Logger {
    private static Logger logger= new Logger();
    private static String string="Test\n";
    public static Logger getLogger(){
        return logger;//Not lazy
    }
    public void addLog(String string){
        this.string += string+ "\n";
    }
    public String getLog(){
        return string;
    }
}