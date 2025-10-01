/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

class Proyecto {
    private String nombre;
    private int duracionMin;

    public Proyecto(String nombre, int duracionMin) {
        this.nombre = nombre;
        this.duracionMin = duracionMin;
    }

    public String getNombre() { return nombre; }
    public int getDuracionMin() { return duracionMin; }
}

class Render {
    private String formato;
    private Proyecto proyecto;

    public Render(String formato, Proyecto proyecto) {
        this.formato = formato;
        this.proyecto = proyecto;
    }

    public String getFormato() { return formato; }
    public Proyecto getProyecto() { return proyecto; }

    public void mostrarInfo() {
        System.out.println("Render en formato: " + formato +
                           " | Proyecto: " + proyecto.getNombre() +
                           " (" + proyecto.getDuracionMin() + " min)");
    }
}

class EditorVideo {
    public void exportar(String formato, Proyecto proyecto) {
        Render render = new Render(formato, proyecto);
        render.mostrarInfo();
    }
}

public class Ejercicio14 {
    public static void main(String[] args) {
        Proyecto proyecto = new Proyecto("Documental Naturaleza", 90);

        EditorVideo editor = new EditorVideo();
        editor.exportar("MP4", proyecto);
    }
}
