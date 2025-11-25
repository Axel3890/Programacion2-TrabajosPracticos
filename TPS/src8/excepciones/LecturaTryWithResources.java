/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author Axel
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LecturaTryWithResources {
    public static void main(String[] args) {

        String ruta = "archivo.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {

            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
