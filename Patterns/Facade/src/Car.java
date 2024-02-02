public class Car {
    Petrol p = new Petrol();
    Engine e = new Engine();
    Drive d= new Drive();
    void drive(){
        p.refill();
        e.on();
        d.move(e, p);
    }
}
