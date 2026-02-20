package teoria.metodosObject;

public class MainPersona {
    public static void main(String[] args) {
        Persona p1 = new Persona(1, "juan");
        Persona p2 = p1;
        p2.setNombre("luis");
        System.out.println(p1);
        System.out.println(p2);
    }
}
