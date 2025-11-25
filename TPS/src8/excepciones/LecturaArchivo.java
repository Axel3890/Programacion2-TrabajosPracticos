/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author Axel
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LecturaArchivo {
    public static void main(String[] args) {
        File archivo = new File("datos.txt");

        try {
            Scanner sc = new Scanner(archivo);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: El archivo no existe.");
        }
    }
}

