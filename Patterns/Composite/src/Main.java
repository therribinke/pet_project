class Main{
    public static void main(String[] args){
        Mercedes mercedes1=new Mercedes();
        Mercedes mercedes2=new Mercedes();
        Mercedes mercedes3=new Mercedes();

        BMW bmw1 = new BMW();
        BMW bmw2 = new BMW();
        BMW bmw3 = new BMW();

        Audi audi1 = new Audi();
        Audi audi2 = new Audi();
        Audi audi3 = new Audi();

        Container container1 = new Container();
        container1.addCar(bmw1);
        container1.addCar(bmw2);
        container1.addCar(bmw3);

        Container container2 = new Container();
        container2.addCar(mercedes1);
        container2.addCar(mercedes2);
        container2.addCar(mercedes3);

        Container container3 = new Container();
        container3.addCar(audi1);
        container3.addCar(audi2);
        container3.addCar(audi3);

        Container container = new Container();
        container.addCar(container3);
        container.addCar(container2);
        container.addCar(container1);

        container.print();

    }
}