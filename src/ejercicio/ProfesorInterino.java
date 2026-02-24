package ejercicio;

import java.time.LocalDate;

public class ProfesorInterino extends Profesor{
    private int mesesContratacion;

    public ProfesorInterino(String dni, LocalDate fechaNacimiento, String nombrePersona,
                            Especialidad especialidad,
                            int mesesContratacion) {
        super(dni, fechaNacimiento, nombrePersona, especialidad);
        this.mesesContratacion = mesesContratacion;
    }

    public int getMesesContratacion() {
        return mesesContratacion;
    }

    public void setMesesContratacion(int mesesContratacion) {
        this.mesesContratacion = mesesContratacion;
    }

    @Override
    public String toString() {
        return String.format("%s,%d", super.toString(), mesesContratacion);
    }
}
