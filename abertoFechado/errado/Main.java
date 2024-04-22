package abertoFechado.errado;

// Interface que define o método de cálculo de desconto
interface DescontoCalculavel {
    double calcularDesconto(double preco, String nomeFuncionario);
}

// Classe para representar os projetos da empresa de design
class Projeto {
    private String nome;
    private double preco;

    public Projeto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}

// Classe para funcionários MEI (Microempreendedor Individual)
class FuncionarioMEI implements DescontoCalculavel {
    private String nome;
    private double taxaPorHora;

    public FuncionarioMEI(String nome, double taxaPorHora) {
        this.nome = nome;
        this.taxaPorHora = taxaPorHora;
    }

    public String getNome() {
        return nome;
    }

    // Método para calcular o desconto para um projeto
    @Override
    public double calcularDesconto(double preco, String nomeFuncionario) {
        // Supondo que o desconto seja calculado com base no número de horas dedicadas
        // ao projeto e no nome do funcionário
        int horasTrabalhadas = (int) (preco / taxaPorHora);
        double desconto = horasTrabalhadas * 5; // Exemplo simplificado: 5 reais por hora trabalhada
        System.out.println("Desconto calculado por " + nomeFuncionario + " para o projeto: R$" + desconto);
        return desconto;
    }
}

// Classe para processamento de pedidos
class ProcessadorDePedidos {
    // Método para calcular o desconto de um projeto
    public double calcularDesconto(Projeto projeto, DescontoCalculavel descontoStrategy, String nomeFuncionario) {
        return descontoStrategy.calcularDesconto(projeto.getPreco(), nomeFuncionario);
    }
}
public class Main {
    public static void main(String[] args) {
        // Criando projetos
        Projeto projeto1 = new Projeto("Website", 1500);
        Projeto projeto2 = new Projeto("Logo", 800);

        // Criando funcionários MEI
        FuncionarioMEI mei1 = new FuncionarioMEI("João", 30);
        FuncionarioMEI mei2 = new FuncionarioMEI("Maria", 40);

        // Criando um processador de pedidos
        ProcessadorDePedidos processadorDePedidos = new ProcessadorDePedidos();

        // Calculando descontos para cada projeto
        processadorDePedidos.calcularDesconto(projeto1, mei1, mei1.getNome());
        processadorDePedidos.calcularDesconto(projeto2, mei2, mei2.getNome());
    }
}
