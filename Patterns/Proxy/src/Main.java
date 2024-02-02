public class Main {
    public static void main(String[] args) {
        StartEngine startEngine = new StartEngineWithOutBrake("ДА");
        startEngine.pressTheBrake();
        StartEngine startEngine1 = new StartEngineWithOutBrake("ДА1");
        StartEngine startEngine2 = new StartEngineWithBrake("ДА2");
    }
}