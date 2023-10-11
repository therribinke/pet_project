import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean flag =false;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите  выражения");
        System.out.println("Примеры операции :\n '+' - сложение \n '-' - вычитание \n '*' - умножение \n '/' - деление \n");
        System.out.println("Для подсчета введите '='");
        float result = input.nextFloat();
        char operation = input.next().charAt(0);
        while (true) {
            if (flag){
                operation = input.next().charAt(0);
                flag = false;
            }
                float num = input.nextFloat();
                switch (operation) {
                    case ('+'):
                        result = Operation.addition(result, num);
                        break;
                    case ('-'):
                        result = Operation.subtraction(result, num);
                        break;
                    case ('*'):
                        result = Operation.multiplication(result, num);
                        break;
                    case ('/'):
                        result = Operation.division(result, num);
                        break;

                    default:
                        System.out.println("Введите команду заново");
                        Operation.equally(result);
                }
            operation = input.next().charAt(0);
            if (operation=='=') {
                flag=true;
                Operation.equally(result);
            }
        }
    }
}
