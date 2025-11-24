/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp6;

/**
 *
 * @author Axel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {

        Inventario inventario = new Inventario();

        System.out.println("\n=== 1. Crear y agregar 5 productos ===");

        Producto p1 = new Producto("P001", "Leche", 1200, 15, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P002", "Televisor", 250000, 5, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("P003", "Remera", 3500, 25, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P004", "Sillón", 180000, 2, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P005", "Pan", 800, 40, CategoriaProducto.ALIMENTOS);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        System.out.println("\n=== 2. Listar todos los productos ===");
        inventario.listarProductos();

        System.out.println("\n=== 3. Buscar un producto por ID (P003) ===");

        Producto buscado = inventario.buscarProductoPorId("P003");
        if (buscado != null) {
            System.out.println("Producto encontrado:");
            buscado.mostrarInfo();
        } else {
            System.out.println("Producto no encontrado.");
        }

        System.out.println("\n=== 4. Filtrar por categoría ALIMENTOS ===");

        for (Producto p : inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS)) {
            p.mostrarInfo();
        }

        System.out.println("\n=== 5. Eliminar producto con ID P005 ===");
        inventario.eliminarProducto("P005");

        System.out.println("\nProductos restantes:");
        inventario.listarProductos();

        System.out.println("\n=== 6. Actualizar stock del producto P002 ===");
        inventario.actualizarStock("P002", 12);

        inventario.buscarProductoPorId("P002").mostrarInfo();

        System.out.println("\n=== 7. Mostrar total de stock ===");
        System.out.println("Total de unidades en inventario: " + inventario.obtenerTotalStock());

        System.out.println("\n=== 8. Producto con mayor stock ===");
        Producto mayor = inventario.obtenerProductoConMayorStock();
        if (mayor != null) {
            mayor.mostrarInfo();
        }

        System.out.println("\n=== 9. Filtrar productos entre $1000 y $3000 ===");
        for (Producto p : inventario.filtrarProductosPorPrecio(1000, 3000)) {
            p.mostrarInfo();
        }

        System.out.println("\n=== 10. Mostrar categorías disponibles ===");
        inventario.mostrarCategoriasDisponibles();
        
        System.out.println("\n========= Bibloteca =========");
        System.out.println("\n=== 1. Crear biblioteca ===");
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        System.out.println("\n=== 2. Crear 3 autores ===");
        Autor a1 = new Autor("A01", "Gabriel García Márquez", "Colombia");
        Autor a2 = new Autor("A02", "J. K. Rowling", "Reino Unido");
        Autor a3 = new Autor("A03", "Julio Cortázar", "Argentina");

        System.out.println("\n=== 3. Agregar 5 libros a la biblioteca ===");
        biblioteca.agregarLibro("ISBN001", "Cien años de soledad", 1967, a1);
        biblioteca.agregarLibro("ISBN002", "El amor en los tiempos del cólera", 1985, a1);
        biblioteca.agregarLibro("ISBN003", "Harry Potter y la piedra filosofal", 1997, a2);
        biblioteca.agregarLibro("ISBN004", "Rayuela", 1963, a3);
        biblioteca.agregarLibro("ISBN005", "Harry Potter y la cámara secreta", 1998, a2);

        System.out.println("\n=== 4. Listar todos los libros ===");
        biblioteca.listarLibros();

        System.out.println("\n=== 5. Buscar libro por ISBN (ISBN003) ===");
        Libro encontrado = biblioteca.buscarLibroPorIsbn("ISBN003");
        if (encontrado != null) {
            encontrado.mostrarInfo();
        } else {
            System.out.println("No se encontró el libro.");
        }

        System.out.println("\n=== 6. Filtrar libros por año 1997 ===");
        for (Libro l : biblioteca.filtrarLibrosPorAnio(1997)) {
            l.mostrarInfo();
        }

        System.out.println("\n=== 7. Eliminar libro con ISBN004 ===");
        biblioteca.eliminarLibro("ISBN004");

        System.out.println("\nLibros restantes:");
        biblioteca.listarLibros();

        System.out.println("\n=== 8. Cantidad total de libros ===");
        System.out.println("Total: " + biblioteca.obtenerCantidadLibros());

        System.out.println("\n=== 9. Listar autores disponibles ===");
        biblioteca.mostrarAutoresDisponibles();
        
        System.out.println("\n========= Universidad =========");
        
        Universidad uni = new Universidad("Universidad Nacional");

        System.out.println("\n=== 1. Crear 3 profesores y 5 cursos ===");

        Profesor profe1 = new Profesor("P01", "Ana Torres", "Matemática");
        Profesor profe2 = new Profesor("P02", "Carlos Gómez", "Programación");
        Profesor profe3 = new Profesor("P03", "Laura Méndez", "Historia");

        Curso c1 = new Curso("C101", "Álgebra");
        Curso c2 = new Curso("C102", "Cálculo I");
        Curso c3 = new Curso("C201", "Programación I");
        Curso c4 = new Curso("C202", "Estructuras de Datos");
        Curso c5 = new Curso("C301", "Historia Universal");

        System.out.println("\n=== 2. Agregar profesores y cursos a la universidad ===");
        uni.agregarProfesor(profe1);
        uni.agregarProfesor(profe2);
        uni.agregarProfesor(profe3);

        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        System.out.println("\n=== 3. Asignar profesores a cursos ===");
        uni.asignarProfesorACurso("C101", "P01");
        uni.asignarProfesorACurso("C102", "P01");
        uni.asignarProfesorACurso("C201", "P02");
        uni.asignarProfesorACurso("C202", "P02");
        uni.asignarProfesorACurso("C301", "P03");

        System.out.println("\n=== 4. Listar cursos y profesores ===");
        System.out.println("\nCursos:");
        uni.listarCursos();

        System.out.println("\nProfesores:");
        uni.listarProfesores();

        System.out.println("\n=== 5. Cambiar profesor de un curso ===");
        uni.asignarProfesorACurso("C202", "P01"); // C202 pasa de P02 → P01

        System.out.println("\nProfesores después del cambio:");
        uni.listarProfesores();

        System.out.println("\n=== 6. Remover curso C101 ===");
        uni.eliminarCurso("C101");

        uni.listarProfesores();

        System.out.println("\n=== 7. Remover profesor P02 (sus cursos quedan sin profesor) ===");
        uni.eliminarProfesor("P02");

        uni.listarCursos();

        System.out.println("\n=== 8. Reporte: cantidad de cursos por profesor ===");
        for (Profesor p : new Profesor[]{profe1, profe2, profe3}) {
            System.out.println(p.getNombre() + ": " + p.getCursos().size() + " cursos");
        }
    
    }

    
}
