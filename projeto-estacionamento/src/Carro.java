
import java.time.LocalDateTime;

public class Carro extends Veiculo {

    private static final double VALOR_POR_HORA = 5.0;

    public Carro(String placa) {
        super(placa);
    }

    @Override
    public double calcularValor(LocalDateTime horaSaida) {
        long horas = calcularDuracaoEmHoras(horaSaida);
        return horas * VALOR_POR_HORA;
    }
}
