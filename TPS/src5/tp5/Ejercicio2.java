/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

class Bateria {
    private String modelo;
    private int capacidad;

    public Bateria(String modelo, int capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    public String getModelo() { return modelo; }
    public int getCapacidad() { return capacidad; }
}

class Usuario {
    private String nombre;
    private String dni;
    private Celular celular;

    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
    }

    public Celular getCelular() {
        return celular;
    }

    public String getNombre() { return nombre; }
    public String getDni() { return dni; }
}

class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria;    
    private Usuario usuario;    
    public Celular(String imei, String marca, String modelo, Bateria bateria, Usuario usuario) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
        this.usuario = usuario;
        usuario.setCelular(this);
    }

    public String getImei() { return imei; }
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public Bateria getBateria() { return bateria; }
    public Usuario getUsuario() { return usuario; }
}

public class Ejercicio2 {
    public static void main(String[] args) {
        Bateria bateria = new Bateria("Samsung-5000mAh", 5000);
        Usuario usuario = new Usuario("Ana García", "98765432");
        Celular celular = new Celular("123456789", "Samsung", "Galaxy S21", bateria, usuario);

        System.out.println("Celular IMEI: " + celular.getImei());
        System.out.println("Marca: " + celular.getMarca() + " | Modelo: " + celular.getModelo());
        System.out.println("Batería: " + celular.getBateria().getModelo() + " (" + celular.getBateria().getCapacidad() + " mAh)");
        System.out.println("Usuario: " + celular.getUsuario().getNombre() + " (DNI: " + celular.getUsuario().getDni() + ")");
    }
}

