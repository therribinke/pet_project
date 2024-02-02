public class Petrol {
    private boolean petrol;
    void refill(){
        System.out.println("Бак заполнен");
        petrol = true;
    }
    void unfilled(){
        System.out.println("Бак пуст");
        petrol = false;
    }
    public boolean hasPetrol(){
        return petrol;
    }
}
