package examen.examenB;

import java.time.LocalDate;

public class Helper {
    public static String obtenerFechaFormateada (LocalDate fecha) {
        return String.format("%s-%s-%s", fecha.getDayOfMonth(),
                fecha.getMonthValue(), fecha.getYear());
    }
}
