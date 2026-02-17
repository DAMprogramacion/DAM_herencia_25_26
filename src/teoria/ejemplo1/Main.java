package teoria.ejemplo1;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo(5, "jacinto garcía",
                TipoCombustible.DIESEL, "1234FFT");
        System.out.println(vehiculo);
        System.out.println("===============");
        Vehiculo motocicleta = new Motocicleta( "jacinto garcía",
                TipoCombustible.GASOLINA, "1234HFT", 500);
        System.out.println(motocicleta);
    }
}
