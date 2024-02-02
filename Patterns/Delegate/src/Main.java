class Main{
    public static void main(String[] args) {
        Creater creater = new Creater();
        creater.setCarBrand(new Mercedes());
        creater.print();
        creater.setCarBrand(new BMW());
        creater.print();
        creater.setCarBrand(new Audi());
        creater.print();
    }
}