class Main{
    public static void main(String[] args){
        Transmission t = new Transmission();
        Human h = new Human(new DriveTransmission(t),new ParkingTransmission(t),new NeutralTransmission(t));
        h.driveCar();
        h.parkingCar();
        h.neutralCar();
    }
}