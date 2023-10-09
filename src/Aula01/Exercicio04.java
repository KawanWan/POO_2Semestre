package Aula01;
import java.util.Scanner;

public class Exercicio04 {

  public static double celsiusParaFahrenheit(double temperaturaCelsius) {
    double temperaturaFahrenheit = (temperaturaCelsius * 9 / 5) + 32;
    return temperaturaFahrenheit;
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Temperatura em Celsius: ");
    double temperaturaCelsius = scan.nextDouble();
    double temperaturaFahrenheit = celsiusParaFahrenheit(temperaturaCelsius);

    System.out.println(
      temperaturaCelsius +
      " °C é equivalente a " +
      temperaturaFahrenheit +
      " °F."
    );
  }
}
