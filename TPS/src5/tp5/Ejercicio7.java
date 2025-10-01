/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

class Motor {
    private String tipo;
    private String numeroSerie;

    public Motor(String tipo, String numeroSerie) {
        this.tipo = tipo;
        this.numeroSerie = numeroSerie;
    }

    public String getTipo() { return tipo; }
    public String getNumeroSerie() { return numeroSerie; }
}

class Conductor {
    private String nombre;
    private String licencia;
    private Vehiculo vehiculo;

    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Vehiculo getVehiculo() { return vehiculo; }
    public String getNombre() { return nombre; }
    public String getLicencia() { return licencia; }
}

class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor;          
    private Conductor conductor; 
    
    public Vehiculo(String patente, String modelo, Motor motor, Conductor conductor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
        this.conductor = conductor;
        conductor.setVehiculo(this);
    }

    public String getPatente() { return patente; }
    public String getModelo() { return modelo; }
    public Motor getMotor() { return motor; }
    public Conductor getConductor() { return conductor; }
}

public class Ejercicio7 {
    public static void main(String[] args) {
        Motor motor = new Motor("Nafta", "MTR12345");
        Conductor conductor = new Conductor("Carlos López", "LIC987654");
        Vehiculo vehiculo = new Vehiculo("ABC123", "Toyota Corolla", motor, conductor);

        System.out.println("Vehículo: " + vehiculo.getModelo() + " - Patente: " + vehiculo.getPatente());
        System.out.println("Motor: " + vehiculo.getMotor().getTipo() + " - N° Serie: " + vehiculo.getMotor().getNumeroSerie());
        System.out.println("Conductor: " + vehiculo.getConductor().getNombre() + " - Licencia: " + vehiculo.getConductor().getLicencia());
    }
}
