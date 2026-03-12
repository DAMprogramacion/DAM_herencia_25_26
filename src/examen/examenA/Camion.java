package examen.examenA;

public class Camion extends Vehiculo{
    private double cargaMaxima;

    public Camion(String modeloVehiculo, String marcaVehiculo, double cargaMaxima) {
        super(modeloVehiculo, marcaVehiculo);
        this.cargaMaxima = cargaMaxima;
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }
    @Override
    public String toString() {
        String fechaFormateada = String.format("%s-%s-%s", getFechaMatricula().getDayOfMonth(),
                getFechaMatricula().getMonthValue(), getFechaMatricula().getYear());
        String cargaMaxFormateada = String.format("%.1f", cargaMaxima);
        StringBuilder sBuilider = new StringBuilder();
        sBuilider.append("Camión: ").append(getMarcaVehiculo()).append(' ').
                append(getModeloVehiculo()).append('\n').
                append("Matriculado el; ").append(fechaFormateada).append('\n').
                append("Carga máxima: ").append(cargaMaxFormateada).append(" toneladas");
        return sBuilider.toString();

    }
}
