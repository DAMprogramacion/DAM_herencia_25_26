package huelga;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OficinaBancaria {
    private String numeroSucursal;
    private final Map<String , CuentaBancaria> cuentasBancarias = new HashMap<>();

    public OficinaBancaria(String numeroSucursal) {
        this.numeroSucursal = numeroSucursal;
    }

    public String getNumeroSucursal() {
        return numeroSucursal;
    }

    public void setNumeroSucursal(String numeroSucursal) {
        this.numeroSucursal = numeroSucursal;
    }

    public Map<String, CuentaBancaria> getCuentasBancarias() {
        return cuentasBancarias;
    }
    //CRUD
    public void addCuenta (CuentaBancaria cuentaBancaria) { //elegimos de tipo void, aunque hay otras opciones
        cuentasBancarias.put(cuentaBancaria.getNumeroCuenta() , cuentaBancaria);
    }
    public void eliminarCuentaBancaria(CuentaBancaria cuentaBancaria) {
        cuentasBancarias.remove(cuentaBancaria.getNumeroCuenta());
    }
    public List<CuentaBancaria> obtenerTodasCuentas() {
        return (List<CuentaBancaria>) cuentasBancarias.values();
    }
    public double obtenerSaldoMayorDeOficina() {
        double mayorSaldo = 0;
        for (CuentaBancaria cuentaBancaria : cuentasBancarias.values()) { //values da una colección de V
            if (cuentaBancaria.getSaldo() > mayorSaldo)
                mayorSaldo = cuentaBancaria.getSaldo();
        }
        return mayorSaldo;
    }
    public List<CuentaBancaria> getCuentasSaldoInferior (double saldoLimite) {
        List<CuentaBancaria> cuentasMenorSaldo = new ArrayList<>();
        for (CuentaBancaria cuentaBancaria : cuentasBancarias.values())
            if (cuentaBancaria.getSaldo() < saldoLimite)
                cuentasMenorSaldo.add(cuentaBancaria);
        return cuentasMenorSaldo;
    }
    public List<CuentaBancaria> getCuentasSegunDNI (String dni) {
        List<CuentaBancaria> cuentasDNI = new ArrayList<>();
        for (CuentaBancaria cuentaBancaria : cuentasBancarias.values())
            if (cuentaBancaria.getTitulares().
                    contains(new Persona(dni, null, null)))
                cuentasDNI.add(cuentaBancaria);
        return cuentasDNI;
    }
}




