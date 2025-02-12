import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Добро пожаловать в мой калькулятор, " +
                "который считает сумму, разность либо частное чисел");

        System.out.println("Какое действие с числами вы хотите произвести?");
        System.out.println("Подсказка: введите число 1, 2 или 3");
        double action = scanner.nextInt();

        if (action == 1) {

            System.out.println("Введите первое число: ");
            double firstNumber = scanner.nextInt();

            System.out.println("Введите второе число: ");
            double secondNumber = scanner.nextInt();

            double result = firstNumber + secondNumber;
            System.out.println(firstNumber + " + " + secondNumber + " = " + result);

        } else if (action == 2) {
            System.out.println("Введите первое число: ");
            double firstNumber = scanner.nextInt();

            System.out.println("Введите второе число: ");
            double secondNumber = scanner.nextInt();

            double result = firstNumber - secondNumber;
            System.out.println(firstNumber + " - " + secondNumber + " = " + result);
        } else if (action == 3) {
            System.out.println("Введите первое число: ");
            double firstNumber = scanner.nextInt();

            System.out.println("Введите второе число: ");
            double secondNumber = scanner.nextInt();

            double result = firstNumber / secondNumber;
            System.out.println(firstNumber + " / " + secondNumber + " = " + result);
        }

    }
}
