package tp3;

public class MainGeneral {
    public static void main(String[] args) {
        System.out.println("EJERCICIO 1: ESTUDIANTE");
        Estudiantes estudiante = new Estudiantes("Axel", "Gomez", "Programación", 7.5);
        estudiante.mostrarInfo();
        estudiante.subirCalificacion(2);
        estudiante.bajarCalificacion(1);
        estudiante.mostrarInfo();

        System.out.println("\nEJERCICIO 2: MASCOTA");
        Mascota mascota = new Mascota("Luna", "Perro", 3);
        mascota.mostrarInfo();
        mascota.cumplirAnios();

        System.out.println("\nEJERCICIO 3: LIBRO");
        Libro libro = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 1967);
        libro.mostrarInfo();
        libro.setAñoPublicacion(3000);
        libro.setAñoPublicacion(1970);
        libro.mostrarInfo();

        System.out.println("\nEJERCICIO 4: GALLINAS");
        Gallina g1 = new Gallina(1, 2);
        Gallina g2 = new Gallina(2, 1);
        g1.ponerHuevo();
        g1.envejecer();
        g2.ponerHuevo();
        g2.envejecer();
        g1.mostrarEstado();
        g2.mostrarEstado();

        System.out.println("\nEJERCICIO 5: NAVE ESPACIAL");
        NaveEspacial nave = new NaveEspacial("Explorer-1", 50);
        nave.mostrarEstado();
        nave.avanzar(120);
        nave.recargarCombustible(40);
        nave.despegar();
        nave.avanzar(60);
        nave.mostrarEstado();
    }
}
