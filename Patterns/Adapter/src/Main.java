
public class Main {
    public static void main(String[] args) {
         A a= new Adapter();
         a.method1();
         a.method2();
    }
}

interface I {
    void intermethod1();
    void intermethod2();
}
class A{
    public void method1(){
        System.out.println("method1");
    }
    public void method2(){
        System.out.println("method2");
    }
}
class Adapter extends A implements I{
    @Override
    public void intermethod1() {
        method1();
    }

    @Override
    public void intermethod2() {
        method2();
    }
}