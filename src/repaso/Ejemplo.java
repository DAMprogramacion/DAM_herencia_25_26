package repaso;

import ejercicio.Especialidad;
import ejercicio.Profesor;
import ejercicio.ProfesorInterino;
import ejercicio.ProfesorTitular;
//import huelga.Persona;
import ejercicio.Persona;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Ejemplo {
    public static void main(String[] args) {
        /*Persona p1 = new Persona("123456789a", "pedro", "avda barcelona");
        Persona p2 = new Persona("123456789b", "emilio", "avda andalucia");
        Persona p3 = new Persona("123456789c", "rosa", "avda madrid");
        List<Persona> personas = new ArrayList<>();
        personas.add(p1); personas.add(p2); personas.add(p3);
        System.out.println(personas.size());
        eliminarPersona(personas, "123456789B");
        System.out.println(personas.size());*/
        Profesor pf1  = new ProfesorTitular("123456789f", LocalDate.of(1999, 10,1),
                "alberto casas", Especialidad.EDUCACION_FISICA, LocalDate.now());
        Profesor pf2  = new ProfesorTitular("123456711a", LocalDate.of(1997, 10,1),
                "alicia casas", Especialidad.INGLES, LocalDate.of(2010,1,1));
        Profesor pf3  = new ProfesorInterino("123456789s", LocalDate.of(1990, 10,1),
                "pedro casas", Especialidad.BIOLOGIA_GEOLOGIA, 5);
        List<Persona> personas1 = new ArrayList<>();
        personas1.add(pf1); personas1.add(pf2); personas1.add(pf3);
        System.out.println(personas1);
        for (Persona persona : personas1) {
            if (persona instanceof ProfesorTitular) {
                ((Profesor) persona).getEspecialidad();
                ProfesorTitular profesorTitular = (ProfesorTitular) persona;
                System.out.println(profesorTitular.getFechaIncorporacion());
            }

        }
    }
    /*public static void eliminarPersona(List<Persona> personas, String dni) {
        for (Persona persona : personas)
            if (persona.getDni().equalsIgnoreCase(dni))
                personas.remove(persona);
    }*/
}
