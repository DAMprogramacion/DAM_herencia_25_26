package examen.examenA;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Vehiculo {
    private String marcaVehiculo;
    private final String modeloVehiculo;
    private final LocalDate fechaMatricula = LocalDate.now();
    private final Map<Integer, Revision> revisiones = new HashMap<>();

    public Vehiculo(String modeloVehiculo, String marcaVehiculo) {
        this.modeloVehiculo = modeloVehiculo;
        this.marcaVehiculo = marcaVehiculo;
    }

    public String getMarcaVehiculo() {
        return marcaVehiculo;
    }

    public void setMarcaVehiculo(String marcaVehiculo) {
        this.marcaVehiculo = marcaVehiculo;
    }

    public String getModeloVehiculo() {
        return modeloVehiculo;
    }

    public LocalDate getFechaMatricula() {
        return fechaMatricula;
    }

    public Map<Integer, Revision> getRevisiones() {
        return revisiones;
    }
    public void agregarRevision(Revision revision) {
        revisiones.put(revision.getIdRevision() , revision);
    }
    public void mostrarRevisiones() {
        for (Revision revision : revisiones.values())
            System.out.println(revision.mostrarInformacion());
    }
    public Revision buscarRevision(int id) {
        return revisiones.get(id);
    }
    public void modificarDescripcionRevision(int id, String nuevaDescripcion) {
        for (Revision revision : revisiones.values())
            if (revision.getIdRevision() == id)
                revision.setDescripcionRevision(nuevaDescripcion);
    }
    public Revision obtenerUltimaRevision() {
        Revision ultimaRevision = null;
        LocalDate fechaRevisionMasReciente = LocalDate.of(1900, 1, 1);
        if (revisiones.isEmpty())
            return null;
        for (Revision revision : revisiones.values()){
            if (revision.getFechaRevision().isAfter(fechaRevisionMasReciente)) {
                fechaRevisionMasReciente = revision.getFechaRevision();
                ultimaRevision = revision;
            }
        }
        return ultimaRevision;
    }
    public LocalDate obtenerProximaRevision() {
        return obtenerUltimaRevision().getFechaProximaRevision();
    }
}
