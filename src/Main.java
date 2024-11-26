
import java.util.Scanner;
public class Main {

    public static void menu() {
        System.out.println("\n===== Carteira Digital =====");
        System.out.println("1) Adicionar Saldo");
        System.out.println("2) Realizar Pagamento");
        System.out.println("3) Verificar Saldo");
        System.out.println("4) Ver Histórico de Transações");
        System.out.println("5) Sair");
        System.out.print("Escolha uma opção: ");
    }
    // Função para ler a entrada do usuário
    public static void lerEntradaUsuario(Scanner sc, UniparCoins carteira) {
        int opcao = sc.nextInt();
        switch (opcao) {
            case 1:
                System.out.print("Digite o valor a ser adicionado: R$ ");
                double valorAdicionar = sc.nextDouble();
                carteira.adicionarSaldo(valorAdicionar);
                break;
                case 2:
                    System.out.print("Digite o valor do pagamento: R$ ");
                    double valorPagamento = sc.nextDouble();
                    carteira.realizarPagamento(valorPagamento);
                    break;
                    case 3:
                        carteira.verificarSaldo();
                        break;
                    case 4:
                        carteira.historicoTransacoes();
                        break;
                    case 5:
                        System.out.println("Saindo... Até logo!");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            }

            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                UniparCoins carteira = new UniparCoins();

                while (true) {
                    menu();
                    lerEntradaUsuario(sc, carteira);
                }
    }
}