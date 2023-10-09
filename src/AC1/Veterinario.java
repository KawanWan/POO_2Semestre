package AC1;

public class Veterinario {

    private String nome;
    private String cpf;
    private String crmv;
    private int idade;
    private char genero;
    private Double valorConsulta;

    public Veterinario(String nome, String cpf, String crmv, char genero, Double valorConsulta) {
        this.nome = nome;
        this.cpf = cpf;
        this.crmv = crmv;
        this.genero = genero;
        this.valorConsulta = valorConsulta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCrmv() {
        return crmv;
    }

    public void setCrmv(String crmv) {
        this.crmv = crmv;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public Double getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(Double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    public double getSalario(int qtdeConsultas){
        return valorConsulta * qtdeConsultas;
    }
    
    public String imprimir() {
        String vets = "Nome: " + this.nome + "\n"               
                    + "CPF: " + this.cpf + "\n"
                    + "CRMV: " + this.crmv + "\n"
                    + "Gênero: " + this.genero + "\n"
                    + "Valor da Consulta: " + this.valorConsulta;

        return vets;
    }
    
    public String imprimir(int qtdeConsulta){
        String vets = "Nome: " + this.nome + "\n"               
                    + "CPF: " + this.cpf + "\n"
                    + "CRMV: " + this.crmv + "\n"
                    + "Gênero: " + this.genero + "\n"
                    + "Valor da Consulta: " + this.valorConsulta + "\n"
                    + "Salário:" + getSalario(qtdeConsulta);

        return vets;
    }
}
