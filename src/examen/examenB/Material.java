package examen.examenB;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Material {
    private String tituloMaterial;
    private String editorial;
    private final LocalDate fechaPublicacion;
    private List<Prestamo> prestamos = new ArrayList<>();

    public Material(LocalDate fechaPublicacion, String editorial, String tituloMaterial) {
        this.fechaPublicacion = fechaPublicacion;
        this.editorial = editorial;
        this.tituloMaterial = tituloMaterial;
    }

    public String getTituloMaterial() {
        return tituloMaterial;
    }

    public void setTituloMaterial(String tituloMaterial) {
        this.tituloMaterial = tituloMaterial;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(List<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }
    public void prestarMaterial(Prestamo prestamo) {
        if (prestamos.contains(prestamo)) //obliga a tener sobrescrito el hashCode() equals() en Prestamo
            return;
        prestamos.add(prestamo);
    }
    public Prestamo buscarPrestamo(int id) {
        for (Prestamo prestamo : prestamos)
            if (prestamo.getIdPrestamo() == id)
                return prestamo;
        return null;
    }
    public void ampliarPrestamo(int id) {
        for (Prestamo prestamo : prestamos)
            if (prestamo.getIdPrestamo() == id)
                prestamo.setFechaDevolucion(prestamo.getFechaDevolucion().plusDays(30));
    }
    public void mostrarPrestamos() {
        for (Prestamo prestamo : prestamos)
            System.out.println(prestamo.mostrarInformacion());
    }
    public boolean estaPrestado() {
        if (prestamos.isEmpty())
            return false;
        return prestamos.getLast().getFechaDevolucion().isAfter(LocalDate.now());
    }
    //Material: El Quijote
    //Editorial: Planeta
    //Fecha de publicación: 16-1-1605
    @Override
    public String toString() {
        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append("Material: ").append(tituloMaterial).append('\n').
                append("Editorial: ").append(editorial).append('\n').
                append("Fecha de publicación: ").append(Helper.obtenerFechaFormateada(fechaPublicacion));
        return sBuilder.toString();
    }
}





