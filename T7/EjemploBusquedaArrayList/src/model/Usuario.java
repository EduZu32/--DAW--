package model;

public class Usuario {

    private String dni, nombre, apellido;

    private int telefono;

    public Usuario() {
    }

    public Usuario(String dni, String nombre, String apellido, int telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    //este metodo lo llamamos desde el metodo mostrarusuarios en agenda
    public void mostrarDatos(){
        System.out.println("DNI = " + dni);
        System.out.println("Nombre = " + nombre);
        System.out.println("Apellido = " + apellido);
        System.out.println("Telefono = " + telefono);
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
