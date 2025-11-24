/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6;

/**
 *
 * @author Axel
 */
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private String nombre;
    private List<Libro> libros = new ArrayList<>();

    public Biblioteca(String nombre) {
        this.nombre = nombre;
    }

    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        libros.add(new Libro(isbn, titulo, anioPublicacion, autor));
        System.out.println("Libro agregado correctamente.");
    }

    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
            return;
        }

        for (Libro l : libros) {
            l.mostrarInfo();
        }
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro l : libros) {
            if (l.getIsbn().equalsIgnoreCase(isbn)) {
                return l;
            }
        }
        return null;
    }

    public boolean eliminarLibro(String isbn) {
        Libro libro = buscarLibroPorIsbn(isbn);
        if (libro != null) {
            libros.remove(libro);
            System.out.println("Libro eliminado.");
            return true;
        }
        System.out.println("No se encontró el libro.");
        return false;
    }

    public int obtenerCantidadLibros() {
        return libros.size();
    }

    public List<Libro> filtrarLibrosPorAnio(int anio) {
        List<Libro> filtrados = new ArrayList<>();

        for (Libro l : libros) {
            if (l.getAnioPublicacion() == anio) {
                filtrados.add(l);
            }
        }

        return filtrados;
    }

    public void mostrarAutoresDisponibles() {
        System.out.println("Autores disponibles en la biblioteca:");
        libros.stream()
                .map(Libro::getAutor)
                .distinct()
                .forEach(a -> System.out.println("- " + a.getNombre() + " (" + a.getNacionalidad() + ")"));
    }
}


