package Aula02.Exercicios;

import javax.swing.JOptionPane;

public class Exercicio02 {

  public static void main(String[] args) {
    Aluno aluno = null;

    while (true) {
      String escolhaStr = JOptionPane.showInputDialog(
        "Menu:\n" +
        "1 - Criar Aluno\n" +
        "2 - Mostrar Aluno\n" +
        "3 - Sair\n" +
        "Escolha uma opção:"
      );

      int escolha = Integer.parseInt(escolhaStr);

      switch (escolha) {
        case 1:
          aluno = criarAluno();
          break;
        case 2:
          if (aluno != null) {
            JOptionPane.showMessageDialog(null, aluno.imprimir());
          } else {
            JOptionPane.showMessageDialog(null, "Aluno não foi criado ainda.");
          }
          break;
        case 3:
          JOptionPane.showMessageDialog(null, "Saindo do programa.");
          return;
        default:
          JOptionPane.showMessageDialog(
            null,
            "Opção inválida. Escolha novamente."
          );
      }
    }
  }

  public static Aluno criarAluno() {
    Aluno aluno = new Aluno();

    aluno.setRA(JOptionPane.showInputDialog("Digite o RA:"));
    aluno.setNome(JOptionPane.showInputDialog("Digite o nome:"));
    aluno.setAC1(
      Float.parseFloat(JOptionPane.showInputDialog("Digite a nota da AC1:"))
    );
    aluno.setAC2(
      Float.parseFloat(JOptionPane.showInputDialog("Digite a nota da AC2:"))
    );
    aluno.setAG(
      Float.parseFloat(JOptionPane.showInputDialog("Digite a nota da AG:"))
    );
    aluno.setAF(
      Float.parseFloat(JOptionPane.showInputDialog("Digite a nota da AF:"))
    );

    return aluno;
  }
}
