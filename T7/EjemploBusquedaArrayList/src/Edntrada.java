import model.Agenda;
import model.Usuario;

public class Edntrada {



    public static void main(String[] args) {

        Agenda agenda = new Agenda();
        agenda.agregarUsuario(new Usuario("12345678P","Eduard","Ciprian",123434668));
        agenda.agregarUsuario(new Usuario("12345678Y","Sheila","Acedo",144434668));
        agenda.agregarUsuario(new Usuario("12345678D","David","Manzano",666434668));
        agenda.agregarUsuario(new Usuario("12345678S","Borja","Martin",777434668));

        agenda.eleminarUsuario("12345678D");
        agenda.agregarUsuario(new Usuario("12345678D","DavidNuevo","Manzano",666434668));

        agenda.mostrarUsuarios();

    }


}
