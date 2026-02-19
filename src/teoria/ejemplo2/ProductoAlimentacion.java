package teoria.ejemplo2;

import java.time.LocalDate;

public class ProductoAlimentacion extends Producto{
    private LocalDate fechaCaducidad;
    private final boolean gluten;


    public ProductoAlimentacion(String idProducto, String nombreProducto, double precioProducto,
                                boolean gluten, LocalDate fechaCaducidad) {
        super(idProducto, nombreProducto, precioProducto);
        this.gluten = gluten;
        this.fechaCaducidad = fechaCaducidad;

    }
    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public boolean isGluten() {
        return gluten;
    }
    @Override
    protected double getPrecioProducto() {
       return super.getPrecioProducto() * 1.1;
    }
    public boolean estaCaducado() {
        return fechaCaducidad.isBefore(LocalDate.now()) ;
    }
    @Override
    public String toString() {
        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append("PRODUCTO ALIMENTACIÓN").append('\n');
        sBuilder.append("id: ").append(getIdProducto()).append('\n');
        sBuilder.append("nombre producto: ").append(getNombreProducto()).append('\n');
        String precioSinIVA = String.format("%.2f", super.getPrecioProducto());
        sBuilder.append("precio sin IVA: ").append(precioSinIVA).append(" €\n");
        String precioConIVA = String.format("%.2f", this.getPrecioProducto());
        sBuilder.append("precio con IVA: ").append(precioConIVA).append(" €\n");
        String mensaje = gluten ? "SI" : "NO";
        sBuilder.append("gluten: ").append(mensaje).append('\n');
        sBuilder.append("fecha caducidad: ").append(fechaCaducidad.getDayOfMonth()).append('-').
                append(fechaCaducidad.getMonthValue()).append('-').append(fechaCaducidad.getYear());
        return sBuilder.toString();
    }
}












