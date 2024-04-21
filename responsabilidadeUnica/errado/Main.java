package errado;

class FuncionarioMEI {
    String nome;
    String cargo;
    int horasTrabalhadas;
    double taxaPorHora;

    public FuncionarioMEI(String nome, String cargo, int horasTrabalhadas, double taxaPorHora) {
        this.nome = nome;
        this.cargo = cargo;
        this.horasTrabalhadas = horasTrabalhadas;
        this.taxaPorHora = taxaPorHora;
    }

    // Método para calcular o salário diretamente na classe FuncionarioMEI
    public double calcularSalario() {
        return horasTrabalhadas * taxaPorHora; // Lógica de cálculo diretamente na classe FuncionarioMEI
    }
}

public class Main {
    public static void main(String[] args) {
        // Criando um funcionário MEI
        FuncionarioMEI funcionarioMEI = new FuncionarioMEI("João", "Designer", 40, 30.0);

        // Calculando o salário do funcionário
        double salario = funcionarioMEI.calcularSalario(); // Chamada direta do método calcularSalario

        // Exibindo o salário calculado
        System.out.println("O salário do funcionário é: R$" + salario);
    }
}