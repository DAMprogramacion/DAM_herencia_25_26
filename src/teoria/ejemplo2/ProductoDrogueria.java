package teoria.ejemplo2;

public class ProductoDrogueria extends Producto{
    private NivelToxicidad nivelToxicidad;

    public ProductoDrogueria(String idProducto, String nombreProducto, double precioProducto,
                             NivelToxicidad nivelToxicidad) {
        super(idProducto, nombreProducto, precioProducto);
        this.nivelToxicidad = nivelToxicidad;
    }

    public NivelToxicidad getNivelToxicidad() {
        return nivelToxicidad;
    }

    public void setNivelToxicidad(NivelToxicidad nivelToxicidad) {
        this.nivelToxicidad = nivelToxicidad;
    }

    @Override
    protected double getPrecioProducto() {
        /*double precio = super.getPrecioProducto() * 1.21;
        return precio;*/
        return super.getPrecioProducto() * 1.21;
    }

    @Override
    public String toString() {
        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append("PRODUCTO DROGUERÍA").append('\n');
        sBuilder.append("id: ").append(getIdProducto()).append('\n');
        sBuilder.append("nombre producto: ").append(getNombreProducto()).append('\n');
        String precioSinIVA = String.format("%.2f", super.getPrecioProducto());
        sBuilder.append("precio sin IVA: ").append(precioSinIVA).append(" €\n");
        String precioConIVA = String.format("%.2f", this.getPrecioProducto());
        sBuilder.append("precio con IVA: ").append(precioConIVA).append(" €\n");
        sBuilder.append("toxicidad: ").append(nivelToxicidad);
        return sBuilder.toString();
    }
}
