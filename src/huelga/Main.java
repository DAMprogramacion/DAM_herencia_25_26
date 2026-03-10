package huelga;

import ejercicio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate fecha  = LocalDate.now();
        LocalDate fechaMesAAntes = fecha.minusDays(30);
        LocalDate fechaMesSiguiente = fecha.plusDays(30);
        Profesor p1 = new ProfesorInterino("12345678a", LocalDate.of(2000, 1, 2), "" +
                "joaquin zafra", Especialidad.EDUCACION_FISICA, 6);
        Profesor p2 = new ProfesorInterino("12345678b", LocalDate.of(2010, 1, 2), "" +
                "emilia zafra", Especialidad.BIOLOGIA_GEOLOGIA, 2);
        Profesor p3 = new ProfesorTitular("12345678d", LocalDate.of(2006, 1, 2), "" +
                "beatriz zafra", Especialidad.INFORMATICA, LocalDate.of(2020, 12, 1));
        Profesor p4 = new ProfesorTitular("12345678c", LocalDate.of(2010, 1, 2), "" +
                "remiro zafra", Especialidad.INGLES, LocalDate.of(2021, 12, 1));
        Claustro claustro = new Claustro("IES Virgen del Carmen");
        claustro.addProfesor(p1);
        claustro.addProfesor(p2);
        claustro.addProfesor(p3);
        claustro.addProfesor(p4);
        System.out.println(claustro);
        System.out.println("===========ANTIGÜEDAD===============");
        Profesor[] antiguedad = claustro.obtenerProfesoresSegunAntiguedad();
        System.out.printf("Profesor titular: %s%n", antiguedad[0]);
        System.out.printf("Profesor interino: %s%n", antiguedad[1]);
        System.out.println("===========Eliminar===============");
        claustro.eliminarProfesor("12345678A");
        System.out.println(claustro);
        System.out.println("==========Edad media profesorado=============");
        System.out.printf("Edad media: %.2f%n", claustro.calcularEdadMediaProfesores());
        System.out.println("==========fechas==========");
        System.out.println(fecha);
        System.out.println(fechaMesAAntes);
        System.out.println(fechaMesSiguiente);
        System.out.println(fecha.isAfter(fechaMesAAntes));
        System.out.println(fecha.isBefore(fechaMesSiguiente));
    }
}
