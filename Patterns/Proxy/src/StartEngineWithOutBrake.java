class StartEngineWithOutBrake implements StartEngine{
    String pressOrNot;
    StartEngineWithBrake startEngineWithBrake;
    public StartEngineWithOutBrake(String pressOrNot){
        this.pressOrNot=pressOrNot;
    }
    @Override
    public void pressTheBrake() {
        if(startEngineWithBrake == null){
            startEngineWithBrake = new StartEngineWithBrake(pressOrNot);
        }
        startEngineWithBrake.pressTheBrake();
    }
}