package model;

public class Usuario {
    //molde de lo que sera un usuario-Z manual de instruciones
    //los atributos simpre estan privados por el concepto de encapsulamiento.
        //atributos -> caracteristicas qie quiero manejar en el progrma (cialifican)
        //nombre, apellido, dni, perfil, altura, correo, telefono, carnet, direcion


    private  String nombre, apellido, dni, correo, pass,nacionalidad;
    private int telefono;

    //todos los usuarios tengan una pass por defecto que es root1234

    //metodos -> funcionalidades que el objeto tiene(caminar, cantar,lanzar algo)
        //constructor -> construira el objeto -> por defecto el constructor esta vacio
    //public->para verlo todos; void->tipo de si nos devuelve algo o no; NombreMetodo (param1,param2,param3){}


    /*
    public Usuario(){};
    public Usuario(String nombre, String apellido, String dni){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }
    public Usuario(String nombre, String apellido, String dni, int telefono){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
    }
     */

    public Usuario() {
        this.pass = "root1234";
    }

    public Usuario(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.pass = "root1234";
    }

    public Usuario(String nombre, String apellido, String dni, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.pass = "root1234";
    }
    public  void saludar (String mensaje){
        System.out.println("El usuario con el nombre "+this.nombre+" te esta diciendo: "+mensaje);
    }
    public void mostrarDatos(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Apellido: "+ apellido);
        System.out.println("DNI: "+ dni);
        System.out.println("Telefono: "+ telefono);
        System.out.println("Nacionalidad: "+ nacionalidad);
        System.out.println("Pass: "+pass);
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

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
