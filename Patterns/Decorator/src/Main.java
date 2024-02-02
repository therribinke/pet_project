class Main{
    public static void main(String[] args){
        PrinterInterface one = new Decorator(new Printer("p"));
        one.print();
    }
}