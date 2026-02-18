package teoria.ejemplo1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo(5, "jacinto garcía",
                TipoCombustible.DIESEL, "1234FFT");
        System.out.println(vehiculo);
        System.out.println("===============");
        Vehiculo motocicleta = new Motocicleta( "jacinto garcía",
                TipoCombustible.GASOLINA, "1234HFT", 500);
        System.out.println(motocicleta);
        Vehiculo coche = new Coche(5, "asunciçpn méndez", TipoCombustible.HIBRIDO,
                "0000AAA", 3, false);
        System.out.println(coche);
        List<Vehiculo> vehiculos = List.of(vehiculo, motocicleta, coche);
        System.out.println("========================");
       // for (Vehiculo v : vehiculos)
       //     System.out.println(v);
        vehiculos.forEach(System.out::println);
    }
}
