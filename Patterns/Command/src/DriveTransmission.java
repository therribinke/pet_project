class DriveTransmission implements Command{
    Transmission transmission;
    public DriveTransmission(Transmission transmission){
        this.transmission=transmission;
    }

    @Override
    public void print() {
        transmission.drive();
    }
}