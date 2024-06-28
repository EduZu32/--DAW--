package model;

public class Alumno {

    private String nombre;
    private Asignatura asignatura1, asignatura2, asignatura3;

    private int numeroExpediente;

    public Alumno() {
    }

    public Alumno(String nombre, Asignatura asignatura1, Asignatura asignatura2, Asignatura asignatura3, int numeroExpediente) {
        this.nombre = nombre;
        this.asignatura1 = asignatura1;
        this.asignatura2 = asignatura2;
        this.asignatura3 = asignatura3;
        this.numeroExpediente = numeroExpediente;

    }
    public Alumno(String nombre, int id1, int id2, int id3, int numeroExpediente){
        //inicializar los tres atributos
        this.nombre = nombre;
        this.asignatura1 = new Asignatura(1);
        this.asignatura2 = new Asignatura(2);
        this.asignatura3 = new Asignatura(3);
        this.numeroExpediente = numeroExpediente;

    }


    public void mostrarDatos() {
        System.out.println("Mostrar las calificaciones del alumno con nombre: " + nombre);
        System.out.println("Numero de expdiente: " + numeroExpediente);
        System.out.println("Asignatur con ID: " + asignatura1.getId());
        System.out.println("\tCalificacion : " + asignatura1.getCalificacion());
        System.out.println("Asignatur con ID: " + asignatura2.getId());
        System.out.println("\tCalificacion : " + asignatura2.getCalificacion());
        System.out.println("Asignatur con ID: " + asignatura3.getId());
        System.out.println("\tCalificacion : " + asignatura3.getCalificacion());


    }

    public int getNumeroExpediente() {
        return numeroExpediente;
    }

    public void setNumeroExpediente(int numeroExpediente) {
        this.numeroExpediente = numeroExpediente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Asignatura getAsignatura1() {
        return asignatura1;
    }

    public void setAsignatura1(Asignatura asignatura1) {
        this.asignatura1 = asignatura1;
    }

    public Asignatura getAsignatura2() {
        return asignatura2;
    }

    public void setAsignatura2(Asignatura asignatura2) {
        this.asignatura2 = asignatura2;
    }

    public Asignatura getAsignatura3() {
        return asignatura3;
    }

    public void setAsignatura3(Asignatura asignatura3) {
        this.asignatura3 = asignatura3;
    }
}
