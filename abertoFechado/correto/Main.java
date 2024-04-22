package abertoFechado.correto;

// Interface que define o método de cálculo de desconto
interface DescontoCalculavel {
    double calcularDesconto(double preco);
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

    // Método para calcular o desconto para um projeto
    @Override
    public double calcularDesconto(double preco) {
        // Supondo que o desconto seja calculado com base no número de horas dedicadas ao projeto
        int horasTrabalhadas = (int) (preco / taxaPorHora);
        return horasTrabalhadas * 5; // Exemplo simplificado: 5 reais por hora trabalhada
    }
}

// Classe para processamento de pedidos
class ProcessadorDePedidos {
    // Método para calcular o desconto de um projeto
    public double calcularDesconto(Projeto projeto, DescontoCalculavel descontoStrategy) {
        return descontoStrategy.calcularDesconto(projeto.getPreco());
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

        // Calculando e exibindo descontos para cada projeto
        System.out.println("Desconto do projeto " + projeto1.getNome() + ": R$" + processadorDePedidos.calcularDesconto(projeto1, mei1));
        System.out.println("Desconto do projeto " + projeto2.getNome() + ": R$" + processadorDePedidos.calcularDesconto(projeto2, mei2));
    }
}
