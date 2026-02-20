package teoria.ejemplo2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Supermercado {
    private String nombreSupermercado;
    private final Set<Producto> productos = new HashSet<>();

    public Supermercado(String nombreSupermercado) {
        this.nombreSupermercado = nombreSupermercado;
    }

    public String getNombreSupermercado() {
        return nombreSupermercado;
    }

    public void setNombreSupermercado(String nombreSupermercado) {
        this.nombreSupermercado = nombreSupermercado;
    }
    //crud
    public Set<Producto> getProductos() {
        return productos;
    }

    public boolean addProducto (Producto producto) {
        return productos.add(producto);
    }
    public boolean eliminarProducto(String id){
       Producto producto = new Producto(id, null, 0);
       return productos.remove(producto);
      /*  for (Producto producto : productos)
            if (producto.getIdProducto().equals(id))
                productos.remove(producto);
       */ //NO FUNCIONA, CON BUCLES MEJORADOS NO SE PUEDE TOCAR EL TAMAÑO DE LA COLECCIÓN
    }
    public boolean actualizarPrecioPorId (String id, double nuevoPrecio) {
        for (Producto producto : productos)
            if (producto.getIdProducto().equalsIgnoreCase(id) &&
                    producto.getPrecioProducto() != nuevoPrecio) {
                producto.setPrecioProducto(nuevoPrecio);
                return true;
            }
        return false;
    }
    public Producto getProductById (String id) {
        for (Producto producto : productos)
            if (producto.getIdProducto().equalsIgnoreCase(id))
                return producto;
        return null;
    }
    public List<ProductoAlimentacion> obtenerProductosCaducados(){
        List<ProductoAlimentacion> productosCaducados = new ArrayList<>();
        for (Producto producto : productos)
            if (producto instanceof ProductoAlimentacion) {
                ProductoAlimentacion pAlimentacion = (ProductoAlimentacion) producto;
                if (pAlimentacion.estaCaducado())
                    productosCaducados.add(pAlimentacion);
            }
        return productosCaducados;
    }
}
