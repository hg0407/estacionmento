
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Estacionamento {

    private int capacidade;
    private ArrayList<Veiculo> veiculos;

    public Estacionamento(int capacidade) {
        this.capacidade = capacidade;
        this.veiculos = new ArrayList<>();
    }

    public boolean entrarVeiculo(Veiculo veiculo) {
        if (veiculos.size() < capacidade) {
            veiculos.add(veiculo);
            return true;
        } else {
            return false; // Estacionamento cheio
        }
    }

    public double sairVeiculo(String placa) {
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getPlaca().equals(placa)) {
                veiculos.remove(veiculo);
                LocalDateTime horaSaida = LocalDateTime.now();
                return veiculo.calcularValor(horaSaida);
            }
        }
        return -1; // Veículo não encontrado
    }

    public int vagasDisponiveis() {
        return capacidade - veiculos.size();
    }
}
