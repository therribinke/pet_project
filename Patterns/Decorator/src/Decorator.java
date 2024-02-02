public class Decorator implements PrinterInterface{
    PrinterInterface val;
    public Decorator(PrinterInterface val){
        this.val=val;
    }
    @Override
    public void print() {
        System.out.print("'");
        val.print();
        System.out.print("'");
    }
}
