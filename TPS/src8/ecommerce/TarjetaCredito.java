/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommerce;

/**
 *
 * @author Axel
 */
public class TarjetaCredito implements Pago, PagoConDescuento {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con tarjeta por $" + monto);
    }

    @Override
    public double aplicarDescuento(double monto) {
        return monto * 0.90; // 10% descuento
    }
}
