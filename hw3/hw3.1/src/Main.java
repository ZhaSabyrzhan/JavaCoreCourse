import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите температуру (в Цельсия): ");
        double tempCelsius = scanner.nextDouble();

        final double FAHRENHEIT_COEFFICIENT = 1.8;
        final int FAHRENHEIT_OFFSET  = 32;

        double tempFahrenheit = tempCelsius * FAHRENHEIT_COEFFICIENT + FAHRENHEIT_OFFSET;

        System.out.println("Результат: " + tempFahrenheit);
    }
}
