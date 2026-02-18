package teoria.ejemplo2;

import java.util.Objects;

public class Producto {
    private final String idProducto;
    private String nombreProducto;
    private double precioProducto;

    public Producto(String idProducto, String nombreProducto, double precioProducto) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
    }

    protected String getIdProducto() {
        return idProducto;
    }

    protected String getNombreProducto() {
        return nombreProducto;
    }

    protected void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    protected double getPrecioProducto() {
        return precioProducto;
    }

    protected void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Objects.equals(idProducto, producto.idProducto);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idProducto);
    }
}
