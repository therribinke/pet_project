class Human {
    Command drive;
    Command parking;
    Command neutral;
    public Human(Command drive,Command parking,Command neutral){
        this.drive=drive;
        this.parking=parking;
        this.neutral=neutral;
    }
    void driveCar(){
        drive.print();
    }
    void parkingCar(){
        parking.print();
    }
    void neutralCar(){
        neutral.print();
    }
}