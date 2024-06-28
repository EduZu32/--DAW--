import java.util.ArrayList;

public class Entrada {
    public static void main(String[] args) {
        //TareaTrabajo tareaTrabajo =new TareaTrabajo("nombre","descripcion",false,100);abstracta
        TareaTrabajoPrimaria tareaTrabajoPrimaria = new TareaTrabajoPrimaria("nombre", "descripcion",
                false, 100, 5);
        TareaTrabajoSecundaia tareaTrabajoSecundaia = new TareaTrabajoSecundaia("nombre", "descripcion",
                true, 150, true);
        TareaFamiliar tareaFamiliar = new TareaFamiliar("nombre", "descripcion", true,"Las Rozas");

        ArrayList<Tarea> list = new ArrayList<>();
        list.add(tareaTrabajoPrimaria);
        list.add(tareaTrabajoSecundaia);
        list.add(tareaFamiliar);

        for (Tarea tarea : list) {
            if (tarea instanceof TareaTrabajo){
                ((TareaTrabajo) tarea).metodoTareaTrabajo();
            }
            if (tarea instanceof TareaTrabajoPrimaria) {
                ((TareaTrabajoPrimaria) tarea).metodoTareaPrimaria();
            } else if (tarea instanceof TareaTrabajoSecundaia) {
                ((TareaTrabajoSecundaia) tarea).metodoTareaSecundaria();
            }
            if (tarea instanceof Programable){
                ((Programable) tarea).programar();
                ((Programable) tarea).metodoDefecto();
            }

        }
    }


}

