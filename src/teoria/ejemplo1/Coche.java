package teoria.ejemplo1;

public class Coche extends Vehiculo{
    private boolean descapotable;
    private final int numeroPuertas;

    public Coche(int numeroPlazas, String nombrePropietario, TipoCombustible tipoCombustible, String matricula,
                 int numeroPuertas, boolean descapotable) {
        super(numeroPlazas, nombrePropietario, tipoCombustible, matricula);
        this.numeroPuertas = numeroPuertas;
        this.descapotable = descapotable;
    }

    public boolean isDescapotable() {
        return descapotable;
    }

    public void setDescapotable(boolean descapotable) {
        this.descapotable = descapotable;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }
    @Override
    public String toString() {
        String mensaje = descapotable ? "SI" : "NO";
        return String.format("COCHE: \n%s\ndescapotable: %s\nnumero puertas: %d",
                super.toString(), mensaje, numeroPuertas);
    }
}
