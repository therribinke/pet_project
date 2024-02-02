public class Engine {
    private boolean RPM;
    void on(){
        System.out.println("Двигатель запущен");
        RPM=true;
    }
    void off(){
        System.out.println("Двигатель остановлен");
        RPM=false;
    }
    public boolean hasRPM(){
        return RPM;
    }
}
