/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

class Artista {
    private String nombre;
    private String genero;

    public Artista(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }

    public String getNombre() { return nombre; }
    public String getGenero() { return genero; }
}

class Cancion {
    private String titulo;
    private Artista artista;

    public Cancion(String titulo, Artista artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    public String getTitulo() { return titulo; }
    public Artista getArtista() { return artista; }
}

class Reproductor {
    public void reproducir(Cancion cancion) {
        System.out.println("Reproduciendo: " + cancion.getTitulo() +
                           " - Artista: " + cancion.getArtista().getNombre());
    }
}

public class Ejercicio11 {
    public static void main(String[] args) {
        Artista artista = new Artista("Soda Stereo", "Rock");
        Cancion cancion = new Cancion("De Música Ligera", artista);

        Reproductor reproductor = new Reproductor();
        reproductor.reproducir(cancion);
    }
}
