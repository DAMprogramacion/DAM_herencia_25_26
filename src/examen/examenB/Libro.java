package examen.examenB;

import java.time.LocalDate;
import java.util.List;

public class Libro extends Material{
    private final String autorLibro;
    private int numeroPaginas;

    public Libro(LocalDate fechaPublicacion, String editorial, String tituloMaterial,
                 String autorLibro, int numeroPagina) {
        super(fechaPublicacion, editorial, tituloMaterial);
        this.autorLibro = autorLibro;
        this.numeroPaginas = numeroPagina;
    }

    public String getAutorLibro() {
        return autorLibro;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
    //Libro:
    //Material: El Quijote
    //Editorial: Planeta
    //Fecha de publicación: 16-1-1605
    //Autor: Miguel de Cervantes
    //Páginas: 980
    @Override
    public String toString() {
        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append("Libro:\n");
        sBuilder.append(super.toString()).append('\n');
        sBuilder.append("Autor: ").append(autorLibro).append('\n');
        sBuilder.append("Páginas: ").append(numeroPaginas);
        return sBuilder.toString();
    }
}






