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

class CodigoQR {
    private String valor;
    private Usuario usuario;

    public CodigoQR(String valor, Usuario usuario) {
        this.valor = valor;
        this.usuario = usuario;
    }

    public String getValor() { return valor; }
    public Usuario getUsuario() { return usuario; }

    public void mostrarInfo() {
        System.out.println("QR generado: " + valor + 
                           " | Usuario: " + usuario.getNombre() + 
                           " (" + usuario.getEmail() + ")");
    }
}

class GeneradorQR {
    public void generar(String valor, Usuario usuario) {
        CodigoQR qr = new CodigoQR(valor, usuario);
        qr.mostrarInfo();
    }
}

public class Ejercicio13 {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Carlos López", "carlos@mail.com");

        GeneradorQR generador = new GeneradorQR();
        generador.generar("QR123456", usuario);
    }
}
