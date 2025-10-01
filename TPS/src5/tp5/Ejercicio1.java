/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

class Foto {
    private String imagen;
    private String formato;

    public Foto(String imagen, String formato) {
        this.imagen = imagen;
        this.formato = formato;
    }

    public String getImagen() { return imagen; }
    public String getFormato() { return formato; }
}

class Titular {
    private String nombre;
    private String dni;
    private Pasaporte pasaporte;

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
    }

    public Pasaporte getPasaporte() {
        return pasaporte;
    }

    public String getNombre() { return nombre; }
    public String getDni() { return dni; }
}

class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Foto foto;            
    private Titular titular;      

    public Pasaporte(String numero, String fechaEmision, Titular titular, Foto foto) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = foto;
        this.titular = titular;
        titular.setPasaporte(this);
    }

    public String getNumero() { return numero; }
    public String getFechaEmision() { return fechaEmision; }
    public Foto getFoto() { return foto; }
    public Titular getTitular() { return titular; }
}

public class Ejercicio1 {
    public static void main(String[] args) {
        Foto foto = new Foto("imagen.jpg", "jpg");
        Titular titular = new Titular("Juan Pérez", "12345678");
        Pasaporte pasaporte = new Pasaporte("A123456", "2025-01-01", titular, foto);

        System.out.println("Pasaporte N°: " + pasaporte.getNumero());
        System.out.println("Fecha de emisión: " + pasaporte.getFechaEmision());
        System.out.println("Titular: " + pasaporte.getTitular().getNombre() + " (DNI: " + pasaporte.getTitular().getDni() + ")");
        System.out.println("Foto: " + pasaporte.getFoto().getImagen() + " (" + pasaporte.getFoto().getFormato() + ")");
    }
}
