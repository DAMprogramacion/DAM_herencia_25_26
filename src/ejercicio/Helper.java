package ejercicio;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;

public class Helper {
    public static int obtenerEdadPorFechaNacimiento (LocalDate fechaNacimiento){
        Period periodo = Period.between(fechaNacimiento, LocalDate.now() );
        return periodo.getYears();
    }

    /**
     *
     * Metodo que nos devuelve un array de enteros con los años, meses y días transcurridos
     * entre dos fechas
     * @param fechaIncorporacion
     * @return
     */
    public static int[] calcularAntiguedad (LocalDate fechaIncorporacion) {
        //ejemplo incorporación 25 de enero de 2020
        //6 años, 1 mes, 1 día  retorna [6, 1, 1]
        Period periodo = Period.between(fechaIncorporacion, LocalDate.now() );
        int[] arrayDatos = new int[3];
        arrayDatos[0] = periodo.getYears();
        arrayDatos[1] = periodo.getMonths();
        arrayDatos[2] = periodo.getDays();
        return arrayDatos;
    }

    public static void main(String[] args) {
        LocalDate fecha = LocalDate.of(2015, 3, 6);
        System.out.println(obtenerEdadPorFechaNacimiento(fecha));
        System.out.println(Arrays.toString(calcularAntiguedad(fecha)));
    }
}
