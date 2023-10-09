package Aula07;

public class MainHeranca {

    public static void main(String[] args) {
        Professor prof = new Professor("Bruno","45678","Sorocaba");
        Aluno alu = new Aluno("236737", "Kawan","4674","Araçoiaba");
        
        System.out.println(prof.imprimir());
        System.out.println("-----------------------------");
        System.out.println(alu.imprimir());
    }
    
}
