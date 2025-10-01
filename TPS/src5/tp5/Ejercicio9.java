/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

class Paciente {
    private String nombre;
    private String obraSocial;

    public Paciente(String nombre, String obraSocial) {
        this.nombre = nombre;
        this.obraSocial = obraSocial;
    }

    public String getNombre() { return nombre; }
    public String getObraSocial() { return obraSocial; }
}

class Profesional {
    private String nombre;
    private String especialidad;

    public Profesional(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getNombre() { return nombre; }
    public String getEspecialidad() { return especialidad; }
}

class CitaMedica {
    private String fecha;
    private String hora;
    private Paciente paciente;      
    private Profesional profesional; 

    public CitaMedica(String fecha, String hora, Paciente paciente, Profesional profesional) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.profesional = profesional;
    }

    public String getFecha() { return fecha; }
    public String getHora() { return hora; }
    public Paciente getPaciente() { return paciente; }
    public Profesional getProfesional() { return profesional; }
}

public class Ejercicio9 {
    public static void main(String[] args) {
        Paciente paciente = new Paciente("Lucía Gómez", "OSDE");
        Profesional profesional = new Profesional("Dr. Martín Pérez", "Cardiología");
        CitaMedica cita = new CitaMedica("2025-10-05", "14:30", paciente, profesional);

        System.out.println("Cita Médica:");
        System.out.println("Fecha: " + cita.getFecha() + " - Hora: " + cita.getHora());
        System.out.println("Paciente: " + cita.getPaciente().getNombre() + " - Obra Social: " + cita.getPaciente().getObraSocial());
        System.out.println("Profesional: " + cita.getProfesional().getNombre() + " - Especialidad: " + cita.getProfesional().getEspecialidad());
    }
}
