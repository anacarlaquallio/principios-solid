package prefiraComposicao.correto;

import java.util.List;
import java.util.ArrayList;

// Classe que representa os funcionários de design
class FuncionarioDesign {
    protected String nome;

    public FuncionarioDesign(String nome) {
        this.nome = nome;
    }

    public void trabalhar() {
        System.out.println(nome + " está trabalhando como Designer");
    }

    public void criarLayout() {
        System.out.println(nome + " está criando um layout.");
    }
}

// Classe que representa a empresa de design
class EmpresaDesign {
    private String nome;
    private List<FuncionarioDesign> funcionarios;

    public EmpresaDesign(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    public void contratarFuncionario(FuncionarioDesign funcionario) {
        funcionarios.add(funcionario);
        System.out.println(funcionario.nome + " foi contratado pela empresa " + nome);
    }

    public void realizarTrabalho() {
        System.out.println("A empresa " + nome + " está realizando trabalhos:");
        for (FuncionarioDesign funcionario : funcionarios) {
            funcionario.trabalhar();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Criando funcionários
        FuncionarioDesign funcionario1 = new FuncionarioDesign("João");
        FuncionarioDesign funcionario2 = new FuncionarioDesign("Maria");

        // Criando empresa de design
        EmpresaDesign empresa = new EmpresaDesign("Design Co.");

        // Contratando funcionários
        empresa.contratarFuncionario(funcionario1);
        empresa.contratarFuncionario(funcionario2);

        // Realizando trabalho
        empresa.realizarTrabalho();
    }
}
