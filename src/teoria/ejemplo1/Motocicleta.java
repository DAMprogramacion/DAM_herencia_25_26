package teoria.ejemplo1;

public final class Motocicleta extends Vehiculo {
    private int cilindrada;

    public Motocicleta(String nombrePropietario,
                       TipoCombustible tipoCombustible, String matricula, int cilindrada) {
        super(2, nombrePropietario, tipoCombustible, matricula);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return String.format("MOTOCICLETA: \n%s\ncilindrada: %d", super.toString(), cilindrada);
    }
}