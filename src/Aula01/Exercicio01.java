package Aula01;
import java.util.Scanner;

public class Exercicio01 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int num1;
    int num2;
    int resultado;
    String operador;

    System.out.println("Digite um número: ");
    num1 = scan.nextInt();

    System.out.println("operador");
    operador = scan.next();

    System.out.println("Digite outro número: ");
    num2 = scan.nextInt();

    resultado = Calcula(num1, num2, operador);

    System.out.println("Resultado: " + resultado);
  }

  public static int Calcula(int num1, int num2, String operador) {
    int resultado = 0;

    switch (operador) {
      case "+":
        resultado = num1 + num2;
        break;
      case "-":
        resultado = num1 - num2;
        break;
      case "/":
        resultado = num1 / num2;
        break;
      case "*":
        resultado = num1 * num2;
        break;
      default:
        break;
    }

    return resultado;
  }
}
