package correto;
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

    // Método para calcular o salário com base nas horas trabalhadas e taxa por hora
    public double calcularSalario() {
        return horasTrabalhadas * taxaPorHora;
    }
}

class CalculadoraDeSalario {
    // Método para calcular o salário de um funcionário MEI
    public double calcularSalario(FuncionarioMEI funcionario) {
        return funcionario.calcularSalario();
    }
}

public class Main {
    public static void main(String[] args) {
        // Código para criar e calcular o salário do funcionário MEI
      // Criando um funcionário MEI
        FuncionarioMEI funcionarioMEI = new FuncionarioMEI("João", "Designer", 40, 30.0);

        // Calculando o salário do funcionário
        CalculadoraDeSalario calculadora = new CalculadoraDeSalario();
        double salario = calculadora.calcularSalario(funcionarioMEI);

        // Exibindo o salário calculado
        System.out.println("O salário do funcionário é: R$" + salario);
    }
}
