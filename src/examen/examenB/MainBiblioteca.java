package examen.examenB;

import java.time.LocalDate;

public class MainBiblioteca {
    public static void main(String[] args) {
        Material libro1 = new Libro(LocalDate.of(2023,10,1), "editorial1",
                "titulo libro 1", "autor 1", 123);
        Material libro2 = new Libro(LocalDate.of(1900,10,1), "editorial1",
                "titulo libro 2", "autor 2", 200);
        Material revista1 = new Revista(LocalDate.of(1020,10,1), "editorial2",
                "titulo revista 1",  1, "tema 1");
        Material revista2 = new Revista(LocalDate.of(1020,2,1), "editorial3",
                "titulo revista 2",  11, "tema 11");
        Prestamo p1 = new Prestamo(1, "usuario 1");
        libro1.prestarMaterial(p1);
        System.out.println(p1.mostrarInformacion());
        System.out.println(libro1);
        libro1.ampliarPrestamo(p1.getIdPrestamo());
        System.out.println(p1.mostrarInformacion());

    }
}
