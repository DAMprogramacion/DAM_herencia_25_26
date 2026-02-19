package teoria.ejemplo2;

import java.util.HashSet;
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
    public void prueba(String id){
        for (Producto producto : productos)
            if (producto instanceof ProductoAlimentacion) {
                ProductoAlimentacion pAlimentacion = (ProductoAlimentacion) producto;
                //pAlimentacion.
            }
    }
}
