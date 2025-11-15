package interfacesenunsistema;

public class InterfacesEnUnSistema {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Williams");
        Pedido pedido = new Pedido(cliente);

        Producto p1 = new Producto("Mouse Gamer", 15000);
        Producto p2 = new Producto("Teclado Mecánico", 30000);
        Producto p3 = new Producto("Auriculares Inalámbricos", 25000);

        pedido.agregarProducto(p1);
        pedido.agregarProducto(p2);
        pedido.agregarProducto(p3);

        double total = pedido.calcularTotal();
        System.out.println("Total del pedido: $" + total);

        pedido.cambiarEstado("Procesando");
        pedido.cambiarEstado("En camino");
        pedido.cambiarEstado("Entregado");

        System.out.println("------------------------------------------");

        TarjetaCredito tarjeta = new TarjetaCredito("Williams Cantero");
        double totalConDescuento = tarjeta.aplicarDescuento(total);

        System.out.println("Total con descuento (Tarjeta): $" + totalConDescuento);
        tarjeta.procesarPago(totalConDescuento);

        System.out.println("------------------------------------------");

        PayPal paypal = new PayPal("williams@mail.com");
        paypal.procesarPago(total);

        System.out.println("------------------------------------------");

        System.out.println("Pruebas completadas exitosamente.");
    }

}
