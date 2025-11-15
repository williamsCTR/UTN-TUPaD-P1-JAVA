package interfacesenunsistema;

public class TarjetaCredito implements Pago, PagoConDescuento {

    private String titular;

    public TarjetaCredito(String titular) {
        this.titular = titular;
    }

    @Override
    public double aplicarDescuento(double monto) {
        return monto * 0.90; // 10% de descuento
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago con tarjeta de " + titular + " procesado por $" + monto);
    }
}
