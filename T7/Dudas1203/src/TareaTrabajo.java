public abstract class TareaTrabajo extends Tarea{
    private int presupuesto;

    public TareaTrabajo() {
    }

    public TareaTrabajo(String titulo, String descripcion, boolean completada, int presupuesto) {
        super(titulo, descripcion, completada);
        this.presupuesto = presupuesto;
    }

    public void metodoTareaSecundaria(){
        System.out.println("Ejecutado desde secundaria");
    }

    public void metodoTareaTrabajo(){
        System.out.println("Ejecutado desde trajea trabajo");
    }
}
