
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estacionamento estacionamento = new Estacionamento(10);

        while (true) {
            System.out.println("1. Entrar Veículo");
            System.out.println("2. Sair Veículo");
            System.out.println("3. Verificar Vagas Disponíveis");
            System.out.println("4. Sair do Sistema");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o tipo de veículo (1. Carro, 2. Moto): ");
                    int tipoVeiculo = scanner.nextInt();
                    System.out.println("Digite a placa do veículo: ");
                    String placa = scanner.next();
                    Veiculo veiculo;
                    if (tipoVeiculo == 1) {
                        veiculo = new Carro(placa);
                    } else if (tipoVeiculo == 2) {
                        veiculo = new Moto(placa);
                    } else {
                        System.out.println("Tipo de veículo inválido.");
                        break;
                    }
                    if (estacionamento.entrarVeiculo(veiculo)) {
                        System.out.println("Veículo entrou no estacionamento.");
                    } else {
                        System.out.println("Estacionamento cheio.");
                    }
                    break;
                case 2:
                    System.out.println("Digite a placa do veículo: ");
                    String placaSaida = scanner.next();
                    double valor = estacionamento.sairVeiculo(placaSaida);
                    if (valor >= 0) {
                        System.out.println("Valor a ser pago: R$ " + valor);
                    } else {
                        System.out.println("Veículo não encontrado.");
                    }
                    break;
                case 3:
                    System.out.println("Vagas disponíveis: " + estacionamento.vagasDisponiveis());
                    break;
                case 4:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
