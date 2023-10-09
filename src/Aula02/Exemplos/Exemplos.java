package Aula02.Exemplos;

import Aula02.Exemplos.Aluno;
import Aula02.Exemplos.Automovel;

public class Exemplos {
    public static void main(String[] args) {
        Aluno alu1 = new Aluno();
        alu1.setNome("Kawan");
        alu1.setCurso("ADS");
        alu1.setRa("235467");

        System.out.println("Aluno: " + alu1.imprimir());

        Automovel carro1 = new Automovel();
        carro1.setMarca("Fiat");
        carro1.setModelo("Palio");
        carro1.setCor("Cinza");

        System.out.println("Automóvel: " +carro1.Imprimir());
    }
}
