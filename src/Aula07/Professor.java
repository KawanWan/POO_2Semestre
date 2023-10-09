package Aula07;

public class Professor extends Pessoa{
    private String cracha;
    private char tipoVinculo;
    private double salario;

    public Professor(String nome, String cpf, String endereco) {
        super(nome, cpf, endereco);
    }

    public String getCracha() {
        return cracha;
    }

    public void setCracha(String cracha) {
        this.cracha = cracha;
    }

    public char getTipoVinculo() {
        return tipoVinculo;
    }

    public void setTipoVinculo(char tipoVinculo) {
        this.tipoVinculo = tipoVinculo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    @Override
    public String imprimir(){
        return  "*** PROFESSOR ***\n"+
                super.imprimir()+
                
                "Cracha: "+ cracha +
                "Tipo Vínculo: " + tipoVinculo +
                "Salário: " + salario;
    }
}
