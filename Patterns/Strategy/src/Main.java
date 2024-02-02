public class Main {
    public static void main(String[] args) {
        Strategy strategy = new Strategy();
        strategy.setStrategy(new Music1());
        strategy.getResult();
        strategy.setStrategy(new Music2());
        strategy.getResult();
        strategy.setStrategy(new Music3());
        strategy.getResult();
        strategy.setStrategy(new Music4());
        strategy.getResult();
    }
}