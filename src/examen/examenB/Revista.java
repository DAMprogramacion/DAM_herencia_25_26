package examen.examenB;

import java.time.LocalDate;
import java.util.List;

public class Revista extends Material{
    private int numeroEdicion;
    private String tema;

    public Revista(LocalDate fechaPublicacion,String editorial,
                   String tituloMaterial, int numeroEdicion, String tema) {
        super(fechaPublicacion,  editorial, tituloMaterial);
        this.numeroEdicion = numeroEdicion;
        this.tema = tema;
    }

    public int getNumeroEdicion() {
        return numeroEdicion;
    }

    public void setNumeroEdicion(int numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
    @Override
    public String toString() {
        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append("Revista:\n");
        sBuilder.append(super.toString()).append('\n');
        return sBuilder.toString();
    }
}
