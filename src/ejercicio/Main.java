package ejercicio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("12345678a", LocalDate.of(2000, 12, 1),
                "jacinto gómez gómez");
        Persona p2 = new Persona("12345678b", LocalDate.of(2000, 12, 1),
                "jacinto gómez gómez");
        Persona p3 = new Persona("12345678a", null, null);
        Persona p4 = new Persona("12345678A", LocalDate.of(2000, 12, 1),
                "jacinto gómez gómez");
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(p1.equals(p4));
        System.out.println(p4);
        System.out.println("========================");
        Profesor profesor = new Profesor("12345678B", LocalDate.of(2000, 12, 1),
                "marisa perales ruíz", Especialidad.EDUCACION_FISICA);
        System.out.println(profesor);
        System.out.println("***************************************");
        Profesor profesorTitular = new ProfesorTitular("12345678B", LocalDate.of(2000, 12, 1),
                "marisa perales ruíz", Especialidad.EDUCACION_FISICA,
                LocalDate.of(2020, 1, 24));
        System.out.println(profesorTitular);
        Profesor profesorInterino = new ProfesorInterino("12345678B", LocalDate.of(2000, 12, 1),
                "marisa perales ruíz", Especialidad.EDUCACION_FISICA, 5);
        System.out.println(profesorInterino);
    }
}
