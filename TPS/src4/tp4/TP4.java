/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4;

/**
 *
 * @author Dell
 */
public class TP4 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Empleado e1 = new Empleado(1, "Axel Gomez", "Gerente", 5000);
        Empleado e2 = new Empleado(2, "Karen Sedeño", "Analista", 3000);

        Empleado e3 = new Empleado("Carlos Lopez", "Programador");
        Empleado e4 = new Empleado("Ana Torres", "Diseñadora");

        e1.actualizarSalario(10);
        e2.actualizarSalario(500);
        e3.actualizarSalario(20);
        e4.actualizarSalario(1000);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);

        System.out.println("Total de empleados creados: " + Empleado.mostrarTotalEmpleados());
    }
    
}
