package huelga;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class CuentaBancaria {
    private final Set<Persona> titulares = new HashSet<>();
    private final LocalDate fechaApertura = LocalDate.now();
    private double saldo;
    private final String numeroCuenta;

    public CuentaBancaria(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public Set<Persona> getTitulares() {
        return titulares;
    }

    public LocalDate getFechaApertura() {
        return fechaApertura;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    public boolean variarSaldo (double cantidad) {
        if (cantidad >= 0) { //queremos ingresar dinero
            saldo += cantidad;
            return true;
        }
        if (Math.abs(cantidad) > saldo) //queremos retirar dinero, pero no hay saldo suficiente
            return false;
        saldo += cantidad; //retiramos dinero, porque hay saldo
        return true;
    }
    public boolean addTitular(Persona persona) { //ejemplo devolviendo éxito de la operacion
        return titulares.add(persona);
    }
    public void quitarTitular(Persona persona) { //aquí no se devulve nada, otra forma de hacerlo
        titulares.remove(persona);
    }


}
