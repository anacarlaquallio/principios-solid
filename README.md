# 💻 Principios de projeto
Este repositório contém um trabalho da disciplina de Engenharia de Software (BCC3004 - UTFPR Campus Campo Mourão), que consiste em uma prática envolvendo princípios de projeto. Foram selecionados quatro princípios: 

1. **Princípio da Responsabilidade Única**
2. **Princípio Aberto-Fechado**
3. **Princípio da Inversão da Dependência**
4. **Prefira Composição à Herança**

Para cada princípio, foram desenvolvidos exemplos de código que ilustram sua aplicação correta e incorreta, na linguagem de programação Java. Vejamos as definições de cada princípio e notas sobre os exemplos.

## 📝 Princípio de Responsabilidade Única
Este princípio propõe que toda classe deve ter uma única responsabilidade, ou seja, deve se concentrar em realizar apenas uma tarefa ou funcionalidade específica. Para exemplificar, considere uma empresa de design que contrata funcionários por meio do MEI (Microempreendedor Individual). A quantificação do salário é feito por horas trabalhadas. Nesse sentido, temos uma classe `FuncionarioMEI`, que contém os atributos *nome*, *cargo*, *horasTrabalhadas* e *taxaPorHora*.

No código [errado](https://github.com/anacarlaquallio/principios-solid/blob/main/responsabilidadeUnica/errado/Main.java), introduzimos dentro da classe `FuncionarioMEI` o método `calcularSalario()`. Nesse sentido, `FuncionarioMEI` possui a responsabilidade de armazenar os dados do funcionário MEI e calcular o salário diretamente. Isso viola o Princípio da Responsabilidade Única, pois a classe pode mudar com a alteração dos dados do funcionárioe com o aumento/diminuição da taxa paga por hora.

Como solução, no código [correto](https://github.com/anacarlaquallio/principios-solid/blob/main/responsabilidadeUnica/correto/Main.java), implementou-se a classe `CalculadoraDeSalario` apenas para ficar com a responsabilidade de cálculo de salário. É válido pontuar que faz sentido manter o método `calcularSalario()` em `FuncionarioMEI` porque ele está relacionado diretamente às informações contidas na classe.

## 📝 Princípio Aberto-Fechado
Este princípio propõe que uma classe deve estar fechada para modificações e aberta para extensões por meio de recursos como herança, funções de mais alta ordem (ou funções lambda) e padrões de projeto. Isso com o intuito de construir classes capazes de se adaptarem a diversos cenários de uso, sem modificações no seu código fonte. Para exemplo, considere ainda o exemplo da empresa de design com funcionários MEI. Dessa vez, o código permite o cálculo de desconto de um determinado projeto com base na quantidade de horas dedicadas pelo funcionário.

No código [errado](https://github.com/anacarlaquallio/principios-solid/blob/main/abertoFechado/errado/Main.java), temos o método `calcularDesconto()`, que inclui o nome do funcionário no cálculo de desconto de cada projeto. Isso viola o princípio porque as modificações devem ser extensões, e não diretas no código.

No código [correto](https://github.com/anacarlaquallio/principios-solid/blob/main/abertoFechado/correto/Main.java), essa questão do nome foi excluída. Isso torna o código mais flexível quando novas funcionalidades precisarem ser adicionadas ou alteradas. 

## 📝 Princípio da Inversão da Dependência
Este princípio recomenda que uma classe cliente deve estabelecer dependências prioritariamente com abstrações e não com implementações concretas. Em outras palavras, este princípio sugere que os módulos de alto nível não devem depender de módulos de baixo nível. Ambos devem depender de abstrações. Para exemplificar, considere a construção de um sistema de notificação para a empresa de design, onde queremos enviar notificações aos funcionários MEI sempre que houver uma nova tarefa atribuída a eles.

No código [errado](https://github.com/anacarlaquallio/principios-solid/blob/main/inversaoDependencia/errado/Main.java), a classe `TarefaService`, que é de alto nível, depende diretamente da implementação concreta da classe `EmailService`, que é de baixo nível. Isso viola o Princípio de Inversão de Dependência.

No código [correto](https://github.com/anacarlaquallio/principios-solid/blob/main/inversaoDependencia/correto/Main.java), a classe `TarefaService` depende de uma abstração `NotificacaoService`, em vez de uma implementação concreta. Isso permite que diferentes implementações de serviços de notificação (como e-mail, notificações push...) possam ser facilmente trocadas.

## 📝 Prefira Composição à Herança

### 📚 Bibliografia

Marco Tulio Valente. Engenharia de Software Moderna: Princípios e Práticas para Desenvolvimento de Software com Produtividade, Editora: Independente, 2020.
