import java.util.ArrayList;
import java.util.List;

class Human implements Observed{
    int height;
    int weight;
    public void setData(int h, int w){
        height=h;
        weight=w;
        notifyObservers();
    }
    List<Observer> observers= new ArrayList<>();
    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer o :observers){
            o.event(height,weight);
        }
    }
}