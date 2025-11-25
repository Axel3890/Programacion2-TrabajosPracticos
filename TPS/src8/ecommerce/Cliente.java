/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommerce;

/**
 *
 * @author Axel
 */
public class Cliente implements Notificable {

    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void notificarCambio(String nuevoEstado) {
        System.out.println("Cliente " + nombre +
                ": su pedido cambió al estado -> " + nuevoEstado);
    }
}
