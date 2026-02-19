package teoria.ejemplo2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Producto producto1 = new ProductoDrogueria("001", "lejía",
                2.3, NivelToxicidad.ALTA);
        System.out.println(producto1);
        Producto producto2 = new ProductoAlimentacion("002", "galletas",
                5.3, true, LocalDate.of(2030, 1, 20) );
        System.out.println(producto2);
    }
}
