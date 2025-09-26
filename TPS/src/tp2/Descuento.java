package tp2;

import java.util.Scanner;

public class Descuento {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();

        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        char categoria = sc.next().toUpperCase().charAt(0);

        double descuento = 0;

        if (categoria == 'A') {
            descuento = 0.10; // 10%
        } else if (categoria == 'B') {
            descuento = 0.15; // 15%
        } else if (categoria == 'C') {
            descuento = 0.20; // 20%
        } else {
            System.out.println("Categoría inválida.");
            sc.close();
            return;
        }

        double montoDescuento = precio * descuento;
        double precioFinal = precio - montoDescuento;

        System.out.println("Precio original: " + precio);
        System.out.println("Descuento aplicado: " + (int)(descuento * 100) + "%");
        System.out.println("Precio final: " + precioFinal);

        sc.close();
    }
}