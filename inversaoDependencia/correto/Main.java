package inversaoDependencia.correto;

// Interface para serviço de notificação
interface NotificacaoService {
    void enviarNotificacao(String destinatario, String mensagem);
}

// Implementação concreta do serviço de e-mail
class EmailService implements NotificacaoService {
    @Override
    public void enviarNotificacao(String destinatario, String mensagem) {
        // Exemplo enviar e-mail
        System.out.println("Enviando e-mail para " + destinatario + ": " + mensagem);
    }
}

// Classe de alto nível dependendo de abstração (DIP)
class TarefaService {
    private NotificacaoService notificacaoService;

    public TarefaService(NotificacaoService notificacaoService) {
        this.notificacaoService = notificacaoService;
    }

    public void atribuirTarefa(String funcionario, String tarefa) {
        // Exemplo atribuir tarefa
        System.out.println("Atribuindo tarefa para " + funcionario + ": " + tarefa);

        // Usando serviço de notificação através da abstração
        notificacaoService.enviarNotificacao(funcionario, "Você tem uma nova tarefa: " + tarefa);
    }
}

public class Main {
    public static void main(String[] args) {
        // Usando a implementação de EmailService para notificação
        NotificacaoService emailService = new EmailService();
        TarefaService tarefaService = new TarefaService(emailService);
        tarefaService.atribuirTarefa("João", "Criar layout para website");
    }
}

