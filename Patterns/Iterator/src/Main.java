public class Main {
    public static void main(String[] args) {
        Array array = new Array();
        Iterator iterator = array.getIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.getVal());
        }
    }
}