public class Main {
    public static void main(String[] args) {
        Gadget one = new Phone(new Samsung());
        one.use();
        Gadget two = new Tablet(new Xiaomi());
        two.use();
    }
}

abstract class Gadget {
    Maker maker;
    public Gadget(Maker maker){
    this.maker=maker;
    }
    abstract void use();
}
class Phone extends Gadget{
    public Phone(Maker maker) {
        super(maker);
    }

    @Override
    void use() {
        maker.use("Использование телефона ");
    }
}
class Tablet extends Gadget{
    public Tablet(Maker maker) {
        super(maker);
    }

    @Override
    void use() {
        maker.use("Использование планшета ");
    }
}
interface Maker{
    void use(String str);
}
class Samsung implements Maker{
    @Override
    public void use(String str) {
        System.out.println(str + "производителя Samsung");
    }
}
class Xiaomi implements Maker{
    @Override
    public void use(String str) {
        System.out.println(str + "производителя Xiaomi");
    }
}


