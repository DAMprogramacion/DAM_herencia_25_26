package examen.examenA;

import java.time.LocalDate;

public class Revision {
    private static final LocalDate fechaActual = LocalDate.now();
    private final int idRevision;
    private final LocalDate fechaRevision = fechaActual;
    private String descripcionRevision;
    private double coste;
    private final LocalDate fechaProximaRevision = fechaActual.plusYears(1);

    public Revision(int idRevision, String descripcionRevision, double coste) {
        this.idRevision = idRevision;
        this.descripcionRevision = descripcionRevision;
        this.coste = coste;
    }

    public int getIdRevision() {
        return idRevision;
    }

    public LocalDate getFechaRevision() {
        return fechaRevision;
    }

    public String getDescripcionRevision() {
        return descripcionRevision;
    }

    public void setDescripcionRevision(String descripcionRevision) {
        this.descripcionRevision = descripcionRevision;
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }

    public LocalDate getFechaProximaRevision() {
        return fechaProximaRevision;
    }
    public String mostrarInformacion() {
        //ID: 1 | Fecha revisión: 10-3-2023 | Cambio de aceite | 80.0 €
        String fechaFormateada = String.format("%s-%s-%s", fechaRevision.getDayOfMonth(),
                fechaRevision.getMonthValue(), fechaRevision.getYear());
        return String.format("ID: %d | Fecha revision: %s | %s | %.1f €",
                idRevision, fechaFormateada,descripcionRevision, coste);
    }
 }
