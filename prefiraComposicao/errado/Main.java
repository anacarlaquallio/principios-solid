package prefiraComposicao.errado;

// Classe base para os funcionários
class Funcionario {
    protected String nome;
    protected String cargo;

    public Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    public void trabalhar() {
        System.out.println(nome + " está trabalhando como " + cargo);
    }
}

// Classe para funcionários de design que herda de Funcionario
class FuncionarioDesign extends Funcionario {
    public FuncionarioDesign(String nome) {
        super(nome, "Designer");
    }

    // Adicionando um método específico para funcionários de design
    public void criarLayout() {
        System.out.println(nome + " está criando um layout.");
    }
}

// Classe Empresa que herda de FuncionarioDesign (viola o princípio)
class EmpresaDesign extends FuncionarioDesign {
    public EmpresaDesign(String nome) {
        super(nome);
    }
}

public class Main {
    public static void main(String[] args) {
        // Criando funcionário de design
        FuncionarioDesign funcionario = new FuncionarioDesign("João");
        funcionario.trabalhar(); // Saída: João está trabalhando como Designer
        funcionario.criarLayout(); // Saída: João está criando um layout.

        // Criando empresa de design
        EmpresaDesign empresa = new EmpresaDesign("Design Co.");
        empresa.trabalhar(); // Saída: Design Co. está trabalhando como Designer
    }
}
