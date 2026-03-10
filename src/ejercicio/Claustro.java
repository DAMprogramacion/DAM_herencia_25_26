package ejercicio;

import java.time.LocalDate;
import java.util.*;

public class Claustro {
    private static LocalDate fechaActual = LocalDate.now();
    private String nombreCentro;
    private final Map<String, Profesor> profesores = new HashMap<>();

    public Claustro(String nombreCentro) {
        this.nombreCentro = nombreCentro;
    }

    public String getNombreCentro() {
        return nombreCentro;
    }

    public void setNombreCentro(String nombreCentro) {
        this.nombreCentro = nombreCentro;
    }
    //CRUD
    public Map<String, Profesor> getProfesores() {
        return profesores;
    }
    public Profesor geteProfesorByDNI(String dni) {
        return profesores.get(dni);
    }
    public void addProfesor(Profesor profesor){
        profesores.put(profesor.getDni().toLowerCase(), profesor);
    }
    public boolean eliminarProfesor(String dni) {
        return profesores.remove(dni.toLowerCase()) != null;
    }
    //OTROS METODOS
    public double calcularEdadMediaProfesores () {
        double edadProfesores = 0;
        Collection<Profesor> profesors = profesores.values();
        for (Profesor profesor : profesors){
            edadProfesores += Helper.obtenerEdadPorFechaNacimiento(profesor.getFechaNacimiento());
        }
        return edadProfesores / profesors.size();
    }
    public int obtenerNumeroProfesoresPorEspecialidad(Especialidad especialidad){
        int contador = 0;
        for (Profesor profesor : profesores.values())
            if (profesor.getEspecialidad().equals(especialidad))
                contador++;
        return contador;
    }
    public Profesor[] obtenerProfesoresSegunAntiguedad() {
        Profesor[] profesors = new Profesor[2];
        ProfesorTitular pTitularMasAntiguo = null;
        ProfesorInterino pInterinoMenosAntiguo = null;
        LocalDate fechaIncorporacionMasAntigua = fechaActual;
        int mesesContratacion = 13;  //no se puede contratar mas de un año (12 meses)
        for (Profesor profesor : profesores.values()){
            if (profesor instanceof ProfesorTitular) {
                ProfesorTitular pTitular = (ProfesorTitular) profesor;
                if (pTitular.getFechaIncorporacion().isBefore(fechaIncorporacionMasAntigua)){
                    pTitularMasAntiguo = pTitular;
                    fechaIncorporacionMasAntigua = pTitularMasAntiguo.getFechaIncorporacion();
                }
            } else { //hay un error redacción ejercicio vamos a devolver el de menos meses contratacción
                ProfesorInterino pInterino = (ProfesorInterino) profesor;
                if (pInterino.getMesesContratacion() < mesesContratacion){
                    pInterinoMenosAntiguo = pInterino;
                    mesesContratacion = pInterino.getMesesContratacion();
                }
            }
        }
        profesors[0] = pTitularMasAntiguo;
        profesors[1] = pInterinoMenosAntiguo;
        return profesors;
    }

    @Override
    public String toString() {
        int contador = 0;
        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append("CLAUSTRO: " ).append(nombreCentro).append('\n');
        sBuilder.append("Fecha de consulta: ").append(fechaActual.getDayOfMonth()).
                append('/').append(fechaActual.getMonthValue()).append('/').
                append(fechaActual.getYear()).append('\n');
        for (Profesor profesor : profesores.values()) {
            sBuilder.append(++contador).append(".- ");
            if (profesor instanceof ProfesorTitular){
                sBuilder.append("Profesor titular: ");
                sBuilder.append(profesor.getNombrePersona()).append(", ").
                        append(profesor.getDni()).append(", ").
                        append(profesor.getEspecialidad());
                ProfesorTitular pTitular = (ProfesorTitular) profesor;
                int[] tiempoContrato = Helper.calcularAntiguedad(pTitular.getFechaIncorporacion());
                sBuilder.append("\nantigüedad: ").append(tiempoContrato[0]).append(" años, ").
                        append(tiempoContrato[1]).append(" meses, ").
                        append(tiempoContrato[2]).append(" días\n");

            } else {
                sBuilder.append("Profesor interino: ");
                sBuilder.append(profesor.getNombrePersona()).append(", ").
                        append(profesor.getDni()).append(", ").
                        append(profesor.getEspecialidad());
                ProfesorInterino pInterino = (ProfesorInterino) profesor;
                sBuilder.append("\nmeses de contratación: ").
                        append(pInterino.getMesesContratacion()).append('\n');
            }


        }

        return sBuilder.toString();
    }
}
