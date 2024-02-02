class writerObserver implements Observer{
    @Override
    public void event(int height, int weight) {
        System.out.println("Рост-"+height+" Вес-"+weight);
    }
}