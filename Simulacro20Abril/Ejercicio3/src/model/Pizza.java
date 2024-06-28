package model;

import java.util.ArrayList;

public class Pizza {
    private String nombre;
    private double precio;
    private ArrayList<Ingrediente> ingredientes;

    //Constructores
    public Pizza() {
    }

    public Pizza(String nombre) {
        this.nombre = nombre;
        this.precio = 0;
        this.ingredientes = new ArrayList<>();
    }

    //Metodo para agregar ingredientes a la pizza
    public void agregarIngrediente(Ingrediente ingrediente){
        ingredientes.add(ingrediente);
        precio += ingrediente.getPrecio();
    }

    //Setter & Getter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }
}
