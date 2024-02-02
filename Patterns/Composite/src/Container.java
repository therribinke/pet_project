import java.util.ArrayList;
import java.util.List;

public class Container implements Car {
    private List <Car> cars = new ArrayList<>();
    public void addCar(Car car){
        cars.add(car);
    }
    public void delCar(Car car){
        cars.remove(car);
    }
    @Override
    public void print(){
        for (Car car: cars){
            car.print();
        }
    }
}
