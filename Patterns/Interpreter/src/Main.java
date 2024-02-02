public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        Expression expression = context.evaluate("2+4-9+5+7");
        System.out.println(expression.interpret());
    }
}







