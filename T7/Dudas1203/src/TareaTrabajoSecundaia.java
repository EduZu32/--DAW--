public final class TareaTrabajoSecundaia extends TareaTrabajo implements Programable{

    private  boolean fechaLimite;

    public TareaTrabajoSecundaia() {
    }

    public TareaTrabajoSecundaia(String titulo, String descripcion, boolean completada, int presupuesto, boolean fechaLimite) {
        super(titulo, descripcion, completada, presupuesto);
        this.fechaLimite = fechaLimite;
    }

    @Override
    public void programar() {
        System.out.println("Vas a programar una tarea de trabajo");
        System.out.println("Ten cuidado que esto es muy importante");
    }
}
