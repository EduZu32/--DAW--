package model;

public class Persona {
    private String nombre,apellido,dni;
    private int edad,altura;
    private double peso;

    public Persona() {
        dni = "11111111111X";
    }

    public Persona(String nombre, String apellido, String dni, int edad, int altura, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }

    public Persona(String nombre, String apellido, String dni, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        dni = "11111111111X";
        edad = 0;
        altura = 0;
        peso = 0.0;
    }


    //Metodos
    public void mostrarDatos(){
        System.out.println("Nombre = " + nombre);
        System.out.println("Apellido = " + apellido);
        System.out.println("DNI = " + dni);
        System.out.println("Edad = " + edad);
        System.out.println("Altur = " + altura +"cm");
        System.out.println("Peso = " + peso+"kg");
    }
    public void mostrarDatos2(){
        System.out.println("Nombre = " + nombre);
        System.out.println("Apellido = " + apellido);
        System.out.println("DNI = " + dni);
        System.out.println("Edad = " + edad);

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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAltur() {
        return altura;
    }

    public void setAltur(int altur) {
        this.altura = altur;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
