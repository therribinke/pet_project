class StartEngineWithBrake implements StartEngine{
    String pressOrNot;
    public StartEngineWithBrake(String pressOrNot){
        this.pressOrNot=pressOrNot;
        startACC();
    }
    void startACC(){
        System.out.println("Включение зажигания "+pressOrNot);
    }
    @Override
    public void pressTheBrake () {
        System.out.println("Включение двигателя "+pressOrNot);
    }
}