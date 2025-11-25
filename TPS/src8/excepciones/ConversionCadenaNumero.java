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

public class ConversionCadenaNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        String texto = sc.nextLine();

        try {
            int numero = Integer.parseInt(texto);
            System.out.println("Número válido: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: La cadena no es un número válido.");
        }
    }
}
