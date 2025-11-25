/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author Axel
 */
import java.util.Scanner;

public class VerificarEdad {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        try {
            validarEdad(edad);
            System.out.println("Edad válida: " + edad);
        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("La edad debe estar entre 0 y 120 años.");
        }
    }
}
