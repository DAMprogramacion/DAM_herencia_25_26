package ejercicio;

import java.time.LocalDate;
import java.util.Objects;

public class Persona {
    private final String dni;
    private String nombrePersona;
    private final LocalDate fechaNacimiento;

    public Persona(String dni, LocalDate fechaNacimiento, String nombrePersona) {
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.nombrePersona = nombrePersona;
    }

    public String getDni() {
        return dni;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    @Override
    public String toString() {
        return String.format("%S,%s,%d/%d/%d", dni, nombrePersona, fechaNacimiento.getDayOfMonth(),
                fechaNacimiento.getMonthValue(), fechaNacimiento.getYear());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(dni.toLowerCase(), persona.dni.toLowerCase());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dni);
    }
}



