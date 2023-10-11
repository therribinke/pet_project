import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите первое число");
        float num1 = input.nextFloat();
        System.out.println("Введите второе число");
        float num2 = input.nextFloat();
        System.out.println("Выберите операцию :\n '+' - сложение \n '-' - вычитание \n '*' - умножение \n '/' - деление \n");
        String operation = input.next();
        float result=0;
        switch (operation){
            case ("+"):
                result=num1+num2;
                break;
            case ("-"):
                result=num1-num2;
                break;
            case ("*"):
                result=num1*num2;
                break;
            case ("/"):
                result=num1/num2;
                break;
        }
        System.out.println("Результат = "+ result);
    }
}