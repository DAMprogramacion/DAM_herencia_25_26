package ejercicio;

import java.time.LocalDate;

public class ProfesorTitular extends Profesor{
    private final LocalDate fechaIncorporacion;

    public ProfesorTitular(String dni, LocalDate fechaNacimiento, String nombrePersona,
                           Especialidad especialidad,
                           LocalDate fechaIncorporacion) {
        super(dni, fechaNacimiento, nombrePersona, especialidad);
        this.fechaIncorporacion = fechaIncorporacion;
    }

    public LocalDate getFechaIncorporacion() {
        return fechaIncorporacion;
    }

    @Override
    public String toString() {
        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append(super.toString()).append(',').
                append(fechaIncorporacion.getDayOfMonth()).append('/').
                append(fechaIncorporacion.getMonthValue()).append('/').
                append(fechaIncorporacion.getYear());
        return sBuilder.toString();
    }
}
