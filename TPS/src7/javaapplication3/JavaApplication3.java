/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


package javaapplication3;

/**
 *
 * @author Axel
 */

import java.util.ArrayList;
import java.util.List;

public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Vehiculo miAuto = new Auto("Toyota", "Corolla", 4);

        miAuto.mostrarInfo();  
        
        System.out.println("============ Figuras ============");
        Figura[] figuras = new Figura[3];

        figuras[0] = new Circulo(5);
        figuras[1] = new Rectangulo(4, 6);
        figuras[2] = new Circulo(2.5);

        for (Figura figura : figuras) {
            System.out.println(
                figura.getNombre() + " - Área: " + figura.calcularArea()
            );
        }
        
        System.out.println("============ Empleados ============");
        
        List<Empleado> empleados = new ArrayList<>();

        empleados.add(new EmpleadoPlanta("Ana", 150000));
        empleados.add(new EmpleadoTemporal("Luis", 120, 1500));
        empleados.add(new EmpleadoPlanta("Carla", 180000));
        empleados.add(new EmpleadoTemporal("Pedro", 90, 1800));

        for (Empleado e : empleados) {
            double sueldo = e.calcularSueldo();

            System.out.println("Empleado: " + e.getNombre());
            System.out.println("Sueldo: $" + sueldo);

            if (e instanceof EmpleadoPlanta) {
                System.out.println("- Tipo: Planta");
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println("- Tipo: Temporal");
            }

            System.out.println("----------------------------");
        }
        
        System.out.println("============ Animales ============");
        
        List<Animal> animales = new ArrayList<>();

        animales.add(new Perro("Firulais"));
        animales.add(new Gato("Mishi"));
        animales.add(new Vaca("Lola"));

        for (Animal animal : animales) {
            animal.describirAnimal();
            animal.hacerSonido();
            System.out.println("-------------------");
        }
    }
    
    
}
