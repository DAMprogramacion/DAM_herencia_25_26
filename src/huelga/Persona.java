package huelga;

import java.util.Objects;

public class Persona {
    private String nombrePersona;
    private final String dni;
    private String direccionPersona;

    public Persona(String dni, String nombrePersona, String direccionPersona) {
        this.dni = dni;
        this.nombrePersona = nombrePersona;
        this.direccionPersona = direccionPersona;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getDni() {
        return dni;
    }

    public String getDireccionPersona() {
        return direccionPersona;
    }

    public void setDireccionPersona(String direccionPersona) {
        this.direccionPersona = direccionPersona;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombrePersona='" + nombrePersona + '\'' +
                ", dni='" + dni + '\'' +
                ", direccionPersona='" + direccionPersona + '\'' +
                '}';
    }
    //para poder trabajarlo, por ejemplo en colecciones de tipo Set, estos métodos:

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
