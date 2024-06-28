package model;

import java.util.ArrayList;

public class Agenda {


    //arraylist de conjunto de usuarios
    private ArrayList<Usuario> listaUsuarios;

    //Constructor
    public Agenda() {
        //inicializo la lista
        listaUsuarios = new ArrayList<>();
    }

    //metodo para agregar usuario


    public void eleminarUsuario(String dni){
        if(estaUsuario(dni)==null){
            System.out.println("No se puede borrar porque no existe");
        }else {
            listaUsuarios.remove(estaUsuario(dni));
            System.out.println("Borrado corectamente");
        }
    }
    public void agregarUsuario(Usuario usuario) {
        //solo agrega si el dni del ususario no esta en la lista

        if (estaUsuario(usuario.getDni()) == null) {
            this.listaUsuarios.add(usuario);
            System.out.println("Usuario con nombre: " + usuario.getNombre() + " agregado corrctamente");
        } else {
            System.out.println("Fallo de agregacion, ya hay un usuario con el mismo DNI");
        }


    }

    private Usuario estaUsuario(String dni) {
        for (Usuario item : listaUsuarios) {
            if (item.getDni().equals(dni)) {
                return item;
            }

        }
        return null;

    }

    public void mostrarUsuarios() {
        for (Usuario usuario : listaUsuarios) {
            usuario.mostrarDatos();
        }
    }

    //Getter Setter
    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
}


