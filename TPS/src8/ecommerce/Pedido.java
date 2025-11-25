/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommerce;

/**
 *
 * @author Axel
 */
import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable {

    private List<Producto> productos = new ArrayList<>();
    private String estado;
    private Notificable cliente;

    public Pedido(Notificable cliente) {
        this.cliente = cliente;
        this.estado = "CREADO";
        notificar();
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    @Override
    public double calcularTotal() {
        return productos.stream()
                .mapToDouble(Producto::calcularTotal)
                .sum();
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        notificar();
    }

    private void notificar() {
        if (cliente != null) {
            cliente.notificarCambio(estado);
        }
    }

    public String getEstado() {
        return estado;
    }
}

