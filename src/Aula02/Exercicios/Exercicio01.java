package Aula02.Exercicios;

import javax.swing.JOptionPane;

public class Exercicio01 {

  public static void main(String[] args) {
    String cpf, nome, opt = "";
    int idade;
    char sexo;

    Pessoa pessoa = null;

    do {
      opt =
        JOptionPane.showInputDialog(
          "1- Criar pessoa \n2- Mostrar pessoa \n3- Sair"
        );
      switch (opt) {
        case "1":
        //Cadastrar
        cpf = JOptionPane.showInputDialog("cpf: ");
        nome = JOptionPane.showInputDialog("nome: ");
        sexo = JOptionPane.showInputDialog("sexo (M/F): ").charAt(0);
        idade = Integer.parseInt(JOptionPane.showInputDialog("idade: "));

        pessoa = new Pessoa();
        pessoa.setCpf(cpf);
        pessoa.setNome(nome);
        pessoa.setIdade(idade);
        pessoa.setSexo(sexo);

          break;
        case "2":
        //Mostrar Pessoa
        if (pessoa == null) {
          JOptionPane.showMessageDialog(null, "Você precisa cadastrar uma pessoa");

          break;
        }
        JOptionPane.showMessageDialog(null, pessoa.imprimir());
          break;
        case "3":
        //Sair
          break;
        default:
          break;
      }
    } while (!opt.equals("3"));
  }
}
