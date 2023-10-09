package Aula01;
import java.util.Scanner;

public class Exercicio03 {
    public static int contarCaractere(String texto, char caractere) {
        int contagem = 0;
        
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == caractere) {
                contagem++;
            }
        }
        
        return contagem;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma palavra ou frase: ");
        String texto = scan.nextLine();

        System.out.println("Caratere que deseja buscar:");
        char caractere = scan.next().charAt(0);
        
        int resultado = contarCaractere(texto, caractere);
        
        System.out.println("O caractere '" + caractere + "' aparece " + resultado + " vezes na string.");
    }
}
