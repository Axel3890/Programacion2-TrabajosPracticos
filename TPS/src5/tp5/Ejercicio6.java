/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

class Cliente {
    private String nombre;
    private String telefono;

    public Cliente(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() { return nombre; }
    public String getTelefono() { return telefono; }
}

class Mesa {
    private int numero;
    private int capacidad;

    public Mesa(int numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }

    public int getNumero() { return numero; }
    public int getCapacidad() { return capacidad; }
}

class Reserva {
    private String fecha;
    private String hora;
    private Cliente cliente;
    private Mesa mesa;      

    public Reserva(String fecha, String hora, Cliente cliente, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.mesa = mesa;
    }

    public String getFecha() { return fecha; }
    public String getHora() { return hora; }
    public Cliente getCliente() { return cliente; }
    public Mesa getMesa() { return mesa; }
}

public class Ejercicio6 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Juan Pérez", "1122334455");
        Mesa mesa = new Mesa(12, 4);
        Reserva reserva = new Reserva("2025-10-01", "21:00", cliente, mesa);

        System.out.println("Reserva para: " + reserva.getCliente().getNombre() +
                           " - Tel: " + reserva.getCliente().getTelefono());
        System.out.println("Fecha: " + reserva.getFecha() + " Hora: " + reserva.getHora());
        System.out.println("Mesa N°: " + reserva.getMesa().getNumero() +
                           " (Capacidad: " + reserva.getMesa().getCapacidad() + ")");
    }
}
