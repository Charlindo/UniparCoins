import java.util.ArrayList;
import java.util.List;

    public class UniparCoins{
        private double saldo;
        private List<String> transacoes;

        public UniparCoins() {
            this.saldo = 0.0;
            this.transacoes = new ArrayList<>();
        }

        public void adicionarSaldo(double valor) {
            if (valor > 0) {
                saldo += valor;
                transacoes.add("Adicionado: R$ " + valor);
                System.out.println("Saldo adicionado com sucesso! Novo saldo: R$ " + saldo);
            } else {
                System.out.println("Valor inválido. O valor deve ser maior que zero.");
            }
        }

        // Método para realizar pagamento
        public void realizarPagamento(double valor) {
            if (valor > 0 && saldo >= valor) {
                saldo -= valor;
                transacoes.add("Pagamento: R$ " + valor);
                System.out.println("Pagamento realizado com sucesso! Novo saldo: R$ " + saldo);
            } else if (valor <= 0) {
                System.out.println("Valor inválido. O valor deve ser maior que zero.");
            } else {
                System.out.println("Saldo insuficiente. Não foi possível realizar o pagamento.");
            }
        }

        // Método para verificar o saldo
        public void verificarSaldo() {
            System.out.println("Saldo atual: R$ " + saldo);
        }

        // Método para exibir o histórico de transações
        public void historicoTransacoes() {
            if (transacoes.isEmpty()) {
                System.out.println("Nenhuma transação realizada.");
            } else {
                System.out.println("Histórico de Transações:");
                for (String transacao : transacoes) {
                    System.out.println(transacao);
                }
            }
        }
    }

