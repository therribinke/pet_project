class NeutralTransmission implements Command{
    Transmission transmission;
    public NeutralTransmission(Transmission transmission){
        this.transmission=transmission;
    }
    @Override
    public void print() {
        transmission.neutral();
    }
}