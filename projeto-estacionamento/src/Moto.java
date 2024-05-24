
import java.time.LocalDateTime;

public class Moto extends Veiculo {

    private static final double VALOR_POR_HORA = 2.5;

    public Moto(String placa) {
        super(placa);
    }

    @Override
    public double calcularValor(LocalDateTime horaSaida) {
        long horas = calcularDuracaoEmHoras(horaSaida);
        return horas * VALOR_POR_HORA;
    }
}
