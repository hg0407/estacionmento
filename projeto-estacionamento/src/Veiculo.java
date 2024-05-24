
import java.time.LocalDateTime;

public abstract class Veiculo {

    private String placa;
    private LocalDateTime horaEntrada;

    public Veiculo(String placa) {
        this.placa = placa;
        this.horaEntrada = LocalDateTime.now();
    }

    public String getPlaca() {
        return placa;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public abstract double calcularValor(LocalDateTime horaSaida);

    protected long calcularDuracaoEmHoras(LocalDateTime horaSaida) {
        return java.time.Duration.between(horaEntrada, horaSaida).toHours();
    }
}
