import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Конвертер валют
        System.out.println("Введите количество рублей: ");
        int rubles = scanner.nextInt();

        System.out.println("Введите курс доллара к рублю: ");
        double dollarRate = scanner.nextDouble();

        System.out.println("Введите курс евро к рублю: ");
        double euroRate = scanner.nextDouble();

        double dollars = rubles / dollarRate;
        double euros = rubles / euroRate;

        System.out.printf("Значение в долларах: %.2f%n", dollars);
        System.out.printf("Значение в евро: %.2f%n", euros);

        // **********************************************************

        // Преобразование температуры
        System.out.println("Введите температуру (в Цельсия): ");
        double tempCelsius = scanner.nextDouble();

        final double FAHRENHEIT_COEFFICIENT = 1.8;
        final int FAHRENHEIT_OFFSET  = 32;

        double tempFahrenheit = tempCelsius * FAHRENHEIT_COEFFICIENT + FAHRENHEIT_OFFSET;

        System.out.println("Результат: " + tempFahrenheit);
    }
}
