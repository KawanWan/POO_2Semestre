package Aula01;
import java.util.Scanner;

public class Exercicio02 {
    public static boolean ehPar(int numero) {
        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Digite um número");
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        boolean resultado = ehPar(numero);

        if (resultado) {
            System.out.println(numero + " é um número par.");
        } else {
            System.out.println(numero + " não é um número par.");
        }
    }
}
