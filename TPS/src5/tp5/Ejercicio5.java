/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

class PlacaMadre {
    private String modelo;
    private String chipset;

    public PlacaMadre(String modelo, String chipset) {
        this.modelo = modelo;
        this.chipset = chipset;
    }

    public String getModelo() { return modelo; }
    public String getChipset() { return chipset; }
}

class Propietario {
    private String nombre;
    private String dni;
    private Computadora computadora;

    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public String getNombre() { return nombre; }
    public String getDni() { return dni; }
}

class Computadora {
    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre;   
    private Propietario propietario; 
    
    public Computadora(String marca, String numeroSerie, PlacaMadre placaMadre, Propietario propietario) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = placaMadre;
        this.propietario = propietario;
        propietario.setComputadora(this);
    }

    public String getMarca() { return marca; }
    public String getNumeroSerie() { return numeroSerie; }
    public PlacaMadre getPlacaMadre() { return placaMadre; }
    public Propietario getPropietario() { return propietario; }
}

public class Ejercicio5 {
    public static void main(String[] args) {
        PlacaMadre placa = new PlacaMadre("ASUS Prime B450M", "AMD B450");
        Propietario propietario = new Propietario("María López", "98765432");
        Computadora pc = new Computadora("HP", "SN12345XYZ", placa, propietario);

        System.out.println("Propietario: " + propietario.getNombre() + " (DNI: " + propietario.getDni() + ")");
        System.out.println("Computadora: " + pc.getMarca() + " - Serie: " + pc.getNumeroSerie());
        System.out.println("Placa Madre: " + pc.getPlacaMadre().getModelo() + " (" + pc.getPlacaMadre().getChipset() + ")");
    }
}
