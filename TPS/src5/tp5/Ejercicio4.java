/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

class Banco {
    private String nombre;
    private String cuit;

    public Banco(String nombre, String cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
    }

    public String getNombre() { return nombre; }
    public String getCuit() { return cuit; }
}

class Cliente {
    private String nombre;
    private String dni;
    private TarjetaDeCredito tarjeta;

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setTarjeta(TarjetaDeCredito tarjeta) {
        this.tarjeta = tarjeta;
    }

    public TarjetaDeCredito getTarjeta() {
        return tarjeta;
    }

    public String getNombre() { return nombre; }
    public String getDni() { return dni; }
}

class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    private Banco banco;        
    private Cliente cliente;    

    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco, Cliente cliente) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
        this.cliente = cliente;
        cliente.setTarjeta(this); 
    }

    public String getNumero() { return numero; }
    public String getFechaVencimiento() { return fechaVencimiento; }
    public Banco getBanco() { return banco; }
    public Cliente getCliente() { return cliente; }
}

public class Ejercicio4 {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco Nación", "30-50000000-6");
        Cliente cliente = new Cliente("Juan Pérez", "12345678");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("1234-5678-9012-3456", "12/28", banco, cliente);

        System.out.println("Cliente: " + cliente.getNombre() + " (DNI: " + cliente.getDni() + ")");
        System.out.println("Banco: " + tarjeta.getBanco().getNombre() + " - CUIT: " + tarjeta.getBanco().getCuit());
        System.out.println("Tarjeta N°: " + tarjeta.getNumero() + " - Vence: " + tarjeta.getFechaVencimiento());
    }
}
