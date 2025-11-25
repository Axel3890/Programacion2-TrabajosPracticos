/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ecommerce;

/**
 *
 * @author Axel
 */
public class Ecommerce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Cliente cliente = new Cliente("Axel");
        Pedido pedido = new Pedido(cliente);

        pedido.agregarProducto(new Producto("Mouse Gamer", 15000));
        pedido.agregarProducto(new Producto("Teclado Mecánico", 30000));

        double total = pedido.calcularTotal();
        System.out.println("Total del pedido: $" + total);

        TarjetaCredito tc = new TarjetaCredito();
        double totalConDescuento = tc.aplicarDescuento(total);

        tc.procesarPago(totalConDescuento);

        pedido.cambiarEstado("EN PREPARACIÓN");
        pedido.cambiarEstado("ENVIADO");
    }
    
}
