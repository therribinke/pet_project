

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        writerObserver w = new writerObserver();
        human.addObserver(w);
        human.setData(190,89);
        human.removeObserver(w);
        human.setData(190,89);
    }
}
