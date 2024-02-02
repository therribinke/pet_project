class ParkingTransmission implements Command{
    Transmission transmission;
    public ParkingTransmission(Transmission transmission){
        this.transmission=transmission;
    }
    @Override
    public void print() {
        transmission.parking();
    }
}