package Aula02.Exercicios;

import javax.swing.JOptionPane;

public class Exercicio03 {

  public static void main(String[] args) {
    Funcionario funcionario = null;

    while (true) {
      String escolhaStr = JOptionPane.showInputDialog(
        "Menu:\n" +
        "1 - Criar Funcionário\n" +
        "2 - Mostrar Folha de Pagamento\n" +
        "3 - Alterar remuneração\n" +
        "4 - Sair\n" +
        "Escolha uma opção:"
      );

      int escolha = Integer.parseInt(escolhaStr);

      switch (escolha) {
        case 1:
          funcionario = criarFuncionario();
          break;
        case 2:
          if (funcionario != null) {
            JOptionPane.showMessageDialog(null, funcionario.imprimir());
          } else {
            JOptionPane.showMessageDialog(
              null,
              "Funcionário não foi criado ainda."
            );
          }
          break;
        case 3:
          if (funcionario != null) {
            alterarRemuneracao(funcionario);
          } else {
            JOptionPane.showMessageDialog(
              null,
              "Funcionário não foi criado ainda."
            );
          }
          break;
        case 4:
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

  public static Funcionario criarFuncionario() {
    Funcionario funcionario = new Funcionario();

    String crachaStr = JOptionPane.showInputDialog("Digite o crachá:");
    funcionario.setCracha(Integer.parseInt(crachaStr));

    funcionario.setNome(JOptionPane.showInputDialog("Digite o nome:"));

    String tipoVinculoStr = JOptionPane.showInputDialog(
      "Digite o tipo de vínculo (H para horista, N para normal):"
    );
    funcionario.setTipoVinculo(tipoVinculoStr.charAt(0));

    if (funcionario.getTipoVinculo() == 'H') {
      String valorHoraStr = JOptionPane.showInputDialog(
        "Digite o valor da hora:"
      );
      funcionario.setValorHora(Float.parseFloat(valorHoraStr));

      String qtdeHoraStr = JOptionPane.showInputDialog(
        "Digite a quantidade de horas:"
      );
      funcionario.setQtdeHora(Float.parseFloat(qtdeHoraStr));
    } else {
      String salarioStr = JOptionPane.showInputDialog("Digite o salário:");
      funcionario.setSalario(Float.parseFloat(salarioStr));
    }

    String valorDescontoStr = JOptionPane.showInputDialog(
      "Digite o valor do desconto:"
    );
    funcionario.setValorDesconto(Float.parseFloat(valorDescontoStr));

    return funcionario;
  }

  public static void alterarRemuneracao(Funcionario funcionario) {
    if (funcionario.getTipoVinculo() == 'H') {
      String valorHoraStr = JOptionPane.showInputDialog(
        "Digite o novo valor da hora:"
      );
      funcionario.setValorHora(Float.parseFloat(valorHoraStr));

      String qtdeHoraStr = JOptionPane.showInputDialog(
        "Digite a nova quantidade de horas:"
      );
      funcionario.setQtdeHora(Float.parseFloat(qtdeHoraStr));
    } else {
      String salarioStr = JOptionPane.showInputDialog("Digite o novo salário:");
      funcionario.setSalario(Float.parseFloat(salarioStr));
    }

    String valorDescontoStr = JOptionPane.showInputDialog(
      "Digite o novo valor do desconto:"
    );
    funcionario.setValorDesconto(Float.parseFloat(valorDescontoStr));

    JOptionPane.showMessageDialog(null, "Remuneração alterada com sucesso.");
  }
}
