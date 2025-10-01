/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

class ClaveSeguridad {
    private String codigo;
    private String ultimaModificacion;

    public ClaveSeguridad(String codigo, String ultimaModificacion) {
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }

    public String getCodigo() { return codigo; }
    public String getUltimaModificacion() { return ultimaModificacion; }
}

class Titular {
    private String nombre;
    private String dni;
    private CuentaBancaria cuenta;

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setCuenta(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }

    public CuentaBancaria getCuenta() { return cuenta; }
    public String getNombre() { return nombre; }
    public String getDni() { return dni; }
}


class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad clave; 
    private Titular titular;   

    public CuentaBancaria(String cbu, double saldo, ClaveSeguridad clave, Titular titular) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = clave;
        this.titular = titular;
        titular.setCuenta(this);
    }

    public String getCbu() { return cbu; }
    public double getSaldo() { return saldo; }
    public ClaveSeguridad getClave() { return clave; }
    public Titular getTitular() { return titular; }

    public void depositar(double monto) { this.saldo += monto; }

    public void extraer(double monto) {
        if (monto <= saldo) {
            this.saldo -= monto;
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }
}

public class Ejercicio10 {
    public static void main(String[] args) {
        Titular titular = new Titular("Laura Fernández", "12345678");
        ClaveSeguridad clave = new ClaveSeguridad("ABC123", "2025-09-01");
        CuentaBancaria cuenta = new CuentaBancaria("000123456789", 5000.0, clave, titular);

        System.out.println("Titular: " + titular.getNombre() + " - DNI: " + titular.getDni());
        System.out.println("CBU: " + cuenta.getCbu() + " - Saldo: $" + cuenta.getSaldo());
        System.out.println("Clave: " + cuenta.getClave().getCodigo() + " - Última Modificación: " + cuenta.getClave().getUltimaModificacion());

        cuenta.depositar(1500);
        System.out.println("Saldo luego de depósito: $" + cuenta.getSaldo());
        cuenta.extraer(7000);
        System.out.println("Saldo luego de extracción: $" + cuenta.getSaldo());
    }
}

