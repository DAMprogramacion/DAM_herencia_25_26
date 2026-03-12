package examen.examenA;

public class Coche extends Vehiculo {
    private final int numeroPuertas;

    public Coche(String modeloVehiculo, String marcaVehiculo, int numeroPuertas) {
        super(modeloVehiculo, marcaVehiculo);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }
    //Coche: Toyota Corolla
    //Matriculado el: 10-5-2021
    //Puertas: 5

    @Override
    public String toString() {
        String fechaFormateada = String.format("%s-%s-%s", getFechaMatricula().getDayOfMonth(),
                getFechaMatricula().getMonthValue(), getFechaMatricula().getYear());
        StringBuilder sBuilider = new StringBuilder();
        sBuilider.append("Coche: ").append(getMarcaVehiculo()).append(' ').
                append(getModeloVehiculo()).append('\n').
                append("Matriculado el; ").append(fechaFormateada).append('\n').
                append("Puertas: ").append(numeroPuertas);
        return sBuilider.toString();

    }
}





