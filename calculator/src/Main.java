import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите  число");
        float result = input.nextFloat();
        while (true) {
            System.out.println("Выберите операцию :\n '+' - сложение \n '-' - вычитание \n '*' - умножение \n '/' - деление \n");
            String operation = input.next();
            System.out.println("Введите  число");
            float num = input.nextFloat();
            switch (operation) {
                case ("+"):
                    result += num;
                    break;
                case ("-"):
                    result -= num;
                    break;
                case ("*"):
                    result *= num;
                    break;
                case ("/"):
                    result /= num;
                    break;
            }
            System.out.println("Результат = " + result);
        }
    }
}