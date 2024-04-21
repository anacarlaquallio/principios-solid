# 💻 Principios de projeto
Este repositório contém um trabalho da disciplina de Engenharia de Software (BCC3004 - UTFPR Campus Campo Mourão), que consiste em uma prática envolvendo princípios de projeto. Foram selecionados quatro princípios: 

1. **Princípio da Responsabilidade Única**
2. **Princípio Aberto-Fechado**
3. **Princípio da Inversão da Dependência**
4. **Prefira Composição à Herança**

Para cada princípio, foram desenvolvidos exemplos de código que ilustram sua aplicação correta e incorreta, na linguagem de programação Java. Vejamos as definições de cada princípio e notas sobre os exemplos.

## 📝 Princípio de Responsabilidade Única
Este princípio propõe que toda classe deve ter uma única responsabilidade, ou seja, deve se concentrar em realizar apenas uma tarefa ou funcionalidade específica. Para exemplificar, considere uma empresa de design que contrata funcionários por meio do MEI (Microempreendedor Individual). A quantificação do salário é feito por horas trabalhadas. Nesse sentido, temos uma classe `FuncionarioMEI`, que contém os atributos *nome*, *cargo*, *horasTrabalhadas* e *taxaPorHora*.

No código [errado](https://github.com/anacarlaquallio/principios-solid/blob/main/responsabilidadeUnica/errado/Main.java), introduzimos dentro da classe `FuncionarioMEI` o método `calcularSalario`. Nesse sentido, `FuncionarioMEI` possui a responsabilidade de armazenar os dados do funcionário MEI e calcular o salário diretamente. Isso viola o Princípio da Responsabilidade Única, pois a classe pode mudar com a alteração dos dados do funcionárioe com o aumento/diminuição da taxa paga por hora.

Como solução, no código [correto](https://github.com/anacarlaquallio/principios-solid/blob/main/responsabilidadeUnica/correto/Main.java), implementou-se a classe `CalculadoraDeSalario` apenas para ficar com a responsabilidade de cálculo de salário. É válido pontuar que faz sentido manter o método `calcularSalario()` em `FuncionarioMEI` porque ele está relacionado diretamente às informações contidas na classe.

## 📝 Princípio Aberto-Fechado

## 📝 Princípio da Inversão da Dependência

## 📝 Prefira Composição à Herança

### 📚 Bibliografia

Marco Tulio Valente. Engenharia de Software Moderna: Princípios e Práticas para Desenvolvimento de Software com Produtividade, Editora: Independente, 2020.
