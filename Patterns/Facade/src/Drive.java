public class Drive {
    void move(Engine e,Petrol p){
        if (e.hasRPM() & p.hasPetrol()){
            System.out.println("Машина начала движение");
        }
        else if (!e.hasRPM()){
            System.out.println("Двигатель не запущен");
        }
        else
            System.out.println("Бак не заполнен топливом");
    }
}
