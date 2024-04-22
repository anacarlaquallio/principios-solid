package inversaoDependencia.errado;

// Classe de baixo nível (detalhe)
class EmailService {
    public void enviarEmail(String destinatario, String mensagem) {
        // Exemplo para enviar e-mail
        System.out.println("Enviando e-mail para " + destinatario + ": " + mensagem);
    }
}

// Classe de alto nível (depende de EmailService)
class TarefaService {
    private EmailService emailService;

    public TarefaService() {
        this.emailService = new EmailService();
    }

    public void atribuirTarefa(String funcionario, String tarefa) {
        // Exemplo de atribuir tarefa
        System.out.println("Atribuindo tarefa para " + funcionario + ": " + tarefa);

        // Envio de e-mail diretamente
        emailService.enviarEmail(funcionario, "Você tem uma nova tarefa: " + tarefa);
    }
}

public class Main {
    public static void main(String[] args) {
        TarefaService tarefaService = new TarefaService();
        tarefaService.atribuirTarefa("João", "Criar layout para website");
    }
}
