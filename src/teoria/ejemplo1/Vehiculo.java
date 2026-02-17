package teoria.ejemplo1;

import java.time.LocalDate;
import java.util.Objects;

public class Vehiculo {
    private final  String matricula;
    private TipoCombustible tipoCombustible;
    private String nombrePropietario;
    private final LocalDate fechaPrimeraMatricula;
    private final int numeroPlazas;

    public Vehiculo(int numeroPlazas, String nombrePropietario, TipoCombustible tipoCombustible,
                    String matricula) {
        this.numeroPlazas = numeroPlazas;
        this.nombrePropietario = nombrePropietario;
        this.tipoCombustible = tipoCombustible;
        this.matricula = matricula;
        this.fechaPrimeraMatricula = LocalDate.now();
    }

    protected String getMatricula() {
        return matricula;
    }

    protected TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    protected String getNombrePropietario() {
        return nombrePropietario;
    }

    protected LocalDate getFechaPrimeraMatricula() {
        return fechaPrimeraMatricula;
    }

    protected int getNumeroPlazas() {
        return numeroPlazas;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return Objects.equals(matricula, vehiculo.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(matricula);
    }

    @Override
    public String toString() {
        StringBuilder sBuilider = new StringBuilder();
        sBuilider.append("VEHICULO").append('\n').
                append("matricula: ").append(matricula).append('\n').
                append("combustible: ").append(tipoCombustible).append('\n').
                append("propieatrio: ").append(nombrePropietario).append('\n').
                append("fecha 1ª matricula: ").append(fechaPrimeraMatricula.getDayOfMonth()).append('-').
                append(fechaPrimeraMatricula.getMonthValue()).append('-').
                append(fechaPrimeraMatricula.getYear()).append('\n').
                append("nº de plazas: ").append(numeroPlazas);

        return sBuilider.toString();
    }
}
