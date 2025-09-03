
import java.util.Scanner;

public class Atividade52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double temperaturaCelsius = scanner.nextDouble();
        double temperaturaFahrenheit = celsiusParaFahrenheit(temperaturaCelsius);

        System.out.println(temperaturaCelsius + "°C é igual a " + temperaturaFahrenheit + "°F.");

    }

    public static double celsiusParaFahrenheit(double celsius) {
        return (9.0 * celsius) / 5.0 + 32.0;
    }
}