/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

class Usuario {
    private String nombre;
    private String email;

    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() { return nombre; }
    public String getEmail() { return email; }
}

class FirmaDigital {
    private String codigoHash;
    private String fecha;
    private Usuario usuario; 

    public FirmaDigital(String codigoHash, String fecha, Usuario usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    public String getCodigoHash() { return codigoHash; }
    public String getFecha() { return fecha; }
    public Usuario getUsuario() { return usuario; }
}

class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firma; 

    public Documento(String titulo, String contenido, FirmaDigital firma) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firma = firma;
    }

    public String getTitulo() { return titulo; }
    public String getContenido() { return contenido; }
    public FirmaDigital getFirma() { return firma; }
}

public class Ejercicio8 {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Ana Torres", "ana.torres@email.com");
        FirmaDigital firma = new FirmaDigital("HASH123456", "2025-10-01", usuario);
        Documento doc = new Documento("Contrato de Servicios", "Contenido del contrato...", firma);

        System.out.println("Documento: " + doc.getTitulo());
        System.out.println("Contenido: " + doc.getContenido());
        System.out.println("Firma: " + doc.getFirma().getCodigoHash() + " - Fecha: " + doc.getFirma().getFecha());
        System.out.println("Usuario de la firma: " + doc.getFirma().getUsuario().getNombre() + 
                           " (" + doc.getFirma().getUsuario().getEmail() + ")");
    }
}
