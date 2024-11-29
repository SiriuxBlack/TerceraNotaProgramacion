class SaldoInsuficienteExcepcion extends Exception {
    public SaldoInsuficienteExcepcion(String informacion) {
        super(informacion);
    }
}
class RegistroFinanciero {
    private double fondos;
    public RegistroFinanciero(double montoInicial) {
        this.fondos = montoInicial;
    }
    public void extraer(double monto) throws SaldoInsuficienteExcepcion {
        if (monto > fondos) {
            throw new SaldoInsuficienteExcepcion("¡Transacción rechazada! El balance es insuficiente.");
        }
        fondos -= monto;
    }
    public double obtenerBalance() {
        return fondos;
    }
}
public class OperacionesBanco {
    public static void main(String[] args) {
        RegistroFinanciero registro = new RegistroFinanciero(1000.0);
        try {
            registro.extraer(1200.0);
        } catch (SaldoInsuficienteExcepcion e) {
            System.out.println("Operación no completada: " + e.getMessage());
        }
        System.out.println("Balance actual del registro: " + registro.obtenerBalance());
    }
}