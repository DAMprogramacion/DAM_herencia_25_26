package examen.examenB;

import java.time.LocalDate;
import java.util.Objects;

public class Prestamo {
    private static final LocalDate fechaActual = LocalDate.now();
    private final int idPrestamo;
    private String nombreUsuario;
    private final LocalDate fechaPrestamo   = fechaActual;
    private LocalDate fechaDevolucion = fechaActual.plusDays(30);

    public Prestamo(int idPrestamo, String nombreUsuario) {
        this.idPrestamo = idPrestamo;
        this.nombreUsuario = nombreUsuario;

    }

    public int getIdPrestamo() {
        return idPrestamo;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
    public String mostrarInformacion() {
        //ID: 1 | Usuario: Juan Pérez | Prestamo: 1-3-2023 | Devolución: 31-3-2023
        return String.format("ID: %d | Usuario: %s | Prestamo: %s | Devolución: %s",
                idPrestamo, nombreUsuario, Helper.obtenerFechaFormateada(fechaPrestamo),
                Helper.obtenerFechaFormateada(fechaDevolucion));
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Prestamo prestamo = (Prestamo) o;
        return idPrestamo == prestamo.idPrestamo;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idPrestamo);
    }
}
