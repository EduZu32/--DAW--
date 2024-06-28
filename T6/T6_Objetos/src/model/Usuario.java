package model;

public class Usuario {

    //modelo de lo que sera un usuario ->manual de instruciones
    //atributos -> caracterisitcas que quiero manejar en el programa (cualifican)
    //nombre, dni, perfil, altura, correo, telefono, carnet, dirrecion, pass
    //Todas la variables de un objeto son privadas

    private String nombre, apellido, dni, correo, pass, nacionalidad;
    private int telefono;


    //Todos los usuarios que tengas una contraseña que es root1234 -> la asiganmos directamente en el constructor
    //metodo-> funcionalidades que el objeto  tiene
    //Constructor -> construir el objeto. Por defecto hay un constructor vacio.

    //public void nombreMetodo(param,param2,param3){}

    public Usuario(){
        this.pass = "root1234";
    }

    public Usuario(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.pass = "root1234";
    }

    public Usuario(String nombre, String apellido, String dni, String correo, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.correo = correo;
        this.telefono = telefono;
        this.pass = "root1234";
    }

    public Usuario(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
        this.pass = "root1234";
    }

    public void saludar(String mensaje){
        System.out.println("El usuario con nombre "+this.nombre+" te esta diciendo "+ mensaje);
    }
    public  void mostarDatos(){
        System.out.println("Nombre: " +nombre);
        System.out.println("Apellido: " +apellido);
        System.out.println("DNI: " +dni);
        System.out.println("Telefono: " +telefono);
        System.out.println("Correo: " +correo);
        System.out.println("Contraseña: " +pass);
    }


    //setter y getter - 1 por cada variable



    public String getNombre(){
        return this.nombre;
    }
    public  void setNombre(String nombre){
        this.nombre=nombre;
    }

    public int getTelefono() {
        return telefono;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }



}
